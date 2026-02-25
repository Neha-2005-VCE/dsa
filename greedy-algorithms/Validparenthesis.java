import java.util.*;
public class Validparenthesis {
    public static boolean isValid(String s) {
        int min=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                min++;
                max++;
            }
            else if(s.charAt(i)==')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }if(min<0) min=0;
            if(max<0){
                return false;
            }
        }
        return min==0;
    }
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the string");
        String st=scr.nextLine();
        System.out.println(isValid(st));
    }
}
