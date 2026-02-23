import java.util.*;
class TransformedArray{
    public static int[] constructTransformedArray(int[] nums){
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                res[i]=0;
            }else{
                int indx=(i+nums[i])%n;
                if(indx<0){
                    indx+=n;
                }
                res[i]=nums[indx];
            }
        }
        return res;
    }
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the values of the array");
        int n=scr.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scr.nextInt();
        }
        int[] res=constructTransformedArray(nums);
        System.out.println("the transformed array is :");
        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
    }
}