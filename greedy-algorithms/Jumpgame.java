import java.util.*;
public class Jumpgame{
    public static boolean canJump(int[] nums){
        int f=0;
        for(int i=0;i<nums.length;i++){
            if(i>f){
                return false;
            }
            f=Math.max(f,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println( "enter the size of the array");
        int n=scr.nextInt();
        int[] nums=new int[n];
        System.out.println( "enter the values of tghe array");
        for(int i=0;i<n;i++){
            nums[i]=scr.nextInt();
        }
        System.out.println( canJump(nums));
    }
}