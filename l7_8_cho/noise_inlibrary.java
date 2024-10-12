package l7_8_cho;
import java.util.*;

public class noise_inlibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seating arrangement (O for occupied, _ for empty): ");
        String s = sc.nextLine();
        int n = s.length();

        System.out.println("Enter the seat number where the user is seated: ");
        int up = sc.nextInt();  // 1-based seat number

        System.out.println("Enter the range within which the user can disturb others: ");
        int r = sc.nextInt();

        // Converting 1-based index to 0-based for array
        up = up - 1;

        int co = 0;

        // Checking left from the current seat
        for (int i = up - 1, j = 0; i >= 0 && j < r; i--, j++) {
            if (s.charAt(i) == 'O') {
                co++;
            }
        }

        // Checking right from the current seat
        for (int i = up + 1, j = 0; i < n && j < r; i++, j++) {
            if (s.charAt(i) == 'O') {
                co++;
            }
        }

        System.out.println("Count of disturbed people: " + co);
    }
}
