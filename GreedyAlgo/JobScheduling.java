package GreedyAlgo;
import java.util.Arrays;
import java.util.Comparator;

class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {

    // Function to find the maximum profit and the jobs to be done
    public static int[] jobScheduling(Job[] jobs, int n) {
        // Sort jobs by their profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find the maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        // Create an array to store the result of job sequence
        int[] result = new int[maxDeadline + 1];
        Arrays.fill(result, -1); // Initialize with -1 (no job scheduled at that time)

        int countJobs = 0, maxProfit = 0;

        // Iterate over sorted jobs
        for (Job job : jobs) {
            // Try to schedule the job at the latest possible time slot (before or on its deadline)
            for (int j = job.deadline; j > 0; j--) {
                if (result[j] == -1) {  // If the slot is free
                    result[j] = job.id; // Schedule this job
                    countJobs++;        // Increment count of jobs
                    maxProfit += job.profit; // Add profit
                    break;
                }
            }
        }

        return new int[] {countJobs, maxProfit};  // Return the number of jobs and max profit
    }

    public static void main(String[] args) {
        // Sample jobs with id, deadline, and profit
        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };
        int n = jobs.length;

        // Find the maximum profit and the number of jobs
        int[] result = jobScheduling(jobs, n);
        System.out.println("Number of jobs done: " + result[0]);
        System.out.println("Maximum profit: " + result[1]);
    }
}
