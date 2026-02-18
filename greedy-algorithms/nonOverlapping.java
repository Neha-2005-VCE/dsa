import java.util.*;

public class nonOverlapping {

    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        int no = 1;
        int n = intervals.length;
        int p = intervals[0][1];

        for (int i = 1; i < n; i++) {   // start from 1
            if (p <= intervals[i][0]) {
                no++;
                p = intervals[i][1];
            }
        }

        return n - no;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of intervals:");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter intervals (start end):");

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int result = eraseOverlapIntervals(intervals);

        System.out.println("Minimum intervals to remove: " + result);

        sc.close();
    }
}
