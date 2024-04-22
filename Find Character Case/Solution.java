import java.util.Scanner;


public class Solution {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Character input = myObj.next().charAt(0);
        if(Character.isLetter(input)){
            if(input >'a' && input <'z'){
                System.out.println("0");
            }else{
                System.out.println("1");
            }

        }
        else{
            System.out.println("-1");
        }
        

    }
}