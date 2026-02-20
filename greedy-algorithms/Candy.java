import java.util.Scanner;

public class Candy {

    public static int candy(int[] ratings) {
        int s = 1;
        int i = 1;
        int n = ratings.length;

        while (i < n) {
            if (ratings[i] == ratings[i - 1]) {
                s += 1;
                i++;
                continue;
            }

            int p = 1;
            while (i < n && ratings[i] > ratings[i - 1]) {
                p += 1;
                s += p;
                i++;
            }

            int d = 1;
            while (i < n && ratings[i] < ratings[i - 1]) {
                s += d;
                d += 1;
                i++;
            }

            if (d > p) {
                s += d - p;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number candies");
        int n = sc.nextInt();
        int[] ratings = new int[n];

        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        System.out.println(candy(ratings));
        sc.close();
    }
}