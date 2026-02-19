import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insertIntervals {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (intervals[i][1] < newInterval[0]) {
                res.add(intervals[i]);
            } 
            else if (intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } 
            else {
                res.add(newInterval);
                newInterval = intervals[i];
            }
        }

        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[] newInterval = new int[2];
        System.out.print("Enter new interval (start end): ");
        newInterval[0] = sc.nextInt();
        newInterval[1] = sc.nextInt();

        int[][] result = insert(intervals, newInterval);

        System.out.println("Result:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }

        sc.close();
    }
}
