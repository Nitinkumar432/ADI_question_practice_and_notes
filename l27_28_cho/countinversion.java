
package l27_28_cho;

import java.util.*;
public class countinversion {
    
    public static long countInversions = 0;

    public static void mergesort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] b = new int[arr.length];
        
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
                countInversions += (mid - i + 1);
            }
            k++;
        }
        
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        
        while (j <= r) {
            b[k] = arr[j];
            j++;
            k++;
        }
        
        for (int t = l; t <= r; t++) {
            arr[t] = b[t];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 5, 3, 5, 4, 6};
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nNumber of inversions: " + countInversions);
    }
}

// The logic for counting inversions in Merge Sort relies on the fact that when merging two sorted subarrays, any time an element from the right subarray is placed before an element from the left subarray, there is an inversion.

// Inversion Definition:
// An inversion is a pair of indices (i, j) in the array such that i < j and arr[i] > arr[j].
// In other words, an inversion occurs when a larger element appears before a smaller one in the array.
// Merge Sort Process:
// Divide and Conquer: The array is recursively split into two halves using the merge sort algorithm.
// Merge: During the merge step, we count how many elements from the left half of the array are greater than elements from the right half (which is already sorted after recursive sorting).
// Key Insight for Counting Inversions:
// If arr[i] (from the left half) is greater than arr[j] (from the right half), then all elements after arr[i] in the left half (since they are sorted) will also be greater than arr[j]. This gives us mid - i + 1 inversions for that particular pair.
// Step-by-Step Example:
// Given an array: [6, 5, 4, 5, 3, 5, 4, 6]

// Split the array into two halves: [6, 5, 4, 5] and [3, 5, 4, 6].
// Recursively Split further until each subarray contains a single element.
// Merge and Count Inversions:
// When merging [6] and [5], we have an inversion since 6 > 5. So, increment the inversion count by 1.
// When merging [6, 5] and [4, 5], every time we take an element from the right subarray before an element from the left subarray (e.g., placing 4 before 6), we count the inversions (mid - i + 1).
// Detailed Merge Logic for Counting Inversions:
// We maintain two pointers: one for the left subarray and one for the right subarray.
// We compare elements pointed to by the two pointers.
// If the element from the left subarray is less than or equal to the element from the right subarray, it is placed in the sorted array without counting an inversion (since there is no inversion).
// If the element from the right subarray is smaller than the element from the left subarray, this means that all remaining elements in the left subarray are also greater than the current element from the right subarray (because the left subarray is sorted). This is where the inversion is counted.
// Formula to Count Inversions:
// When arr[i] > arr[j] (where i is from the left subarray and j is from the right subarray):
// The number of inversions is mid - i + 1, because all elements from arr[i] to arr[mid] are greater than arr[j].
// Example Walkthrough (Merging [5, 6] and [4, 5]):
// Initially, i points to 5 in the left subarray, and j points to 4 in the right subarray.
// Since 5 > 4, we count mid - i + 1 = 2 - 0 + 1 = 2 inversions (both 5 and 6 are greater than 4).
// Now, we increment j to the next element (5), and since 5 == 5, no new inversions are counted.
// Conclusion:
// The key idea is that while merging two sorted subarrays, when an element from the right subarray is smaller than an element from the left subarray, it means that all remaining elements in the left subarray are greater than that element from the right subarray, so we count those inversions.