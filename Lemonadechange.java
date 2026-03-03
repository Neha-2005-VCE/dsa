import java.util.*;
public class Lemonadechange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number of customers:");
        int n=scr.nextInt();
        System.out.println("enter the bills");
        int[]bills=new int[n];
        for(int i=0;i<n;i++){
            bills[i]=scr.nextInt();
        }
        Lemonadechange obj=new Lemonadechange();
        boolean res=obj.lemonadeChange(bills);
        System.out.println(res);
        scr.close();
    }
}
