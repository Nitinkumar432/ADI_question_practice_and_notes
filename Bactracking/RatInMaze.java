package Bactracking;

import java.util.ArrayList;

public class RatInMaze {

    // Function to check if the current move is valid (within the maze boundaries and not visited)
    private static boolean isSafe(int[][] maze, int x, int y, boolean[][] visited) {
        int n = maze.length;
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1 && !visited[x][y]);
    }

    // Utility function to explore all possible paths from (x, y) to destination
    private static void findPaths(int[][] maze, int x, int y, int n, boolean[][] visited, String path, ArrayList<String> paths) {
        // Base condition: If the destination (bottom-right corner) is reached
        if (x == n - 1 && y == n - 1) {
            paths.add(path);  // Add the current path to the list of paths
            return;
        }

        // Mark the current cell as visited
        visited[x][y] = true;

        // Move Down
        if (isSafe(maze, x + 1, y, visited)) {
            findPaths(maze, x + 1, y, n, visited, path + "D", paths);
        }

        // Move Left
        if (isSafe(maze, x, y - 1, visited)) {
            findPaths(maze, x, y - 1, n, visited, path + "L", paths);
        }

        // Move Right
        if (isSafe(maze, x, y + 1, visited)) {
            findPaths(maze, x, y + 1, n, visited, path + "R", paths);
        }

        // Move Up
        if (isSafe(maze, x - 1, y, visited)) {
            findPaths(maze, x - 1, y, n, visited, path + "U", paths);
        }

        // Backtrack: Unmark the current cell as visited for exploring other possible paths
        visited[x][y] = false;
    }

    // Function to print all possible paths from start to destination
    public static ArrayList<String> findAllPaths(int[][] maze, int n) {
        ArrayList<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];  // To track visited cells

        // If the starting point is blocked, return empty list
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return paths;
        }

        // Start finding paths from (0, 0)
        findPaths(maze, 0, 0, n, visited, "", paths);
        return paths;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int n = maze.length;

        ArrayList<String> result = findAllPaths(maze, n);
        if (result.isEmpty()) {
            System.out.println("No path found.");
        } else {
            System.out.println("All possible paths:");
            for (String path : result) {
                System.out.println(path);
            }
        }
    }
}

