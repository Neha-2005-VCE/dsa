import java.util.*;
public class Jumpgame2 {
    public static int jump(int[] nums){
        int n=nums.length;
        int curr=0,f=0,j=0;
        for(int i=0;i<n-1;i++){
            f=Math.max(f,i+nums[i]);
            if(i==curr){
                j=j+1;
                curr=f;
            }
            if(curr>=n-1) break;
        }
        return j;
    }
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the values in the array");
        int n=scr.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scr.nextInt();
        }
        int res=jump(nums);
        System.out.println("the min no of jumps to reach the end of the array is"+res);
        scr.close();
    }
    }
