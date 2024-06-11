/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bse213037_lab07.recursive;
import java.util.Scanner;
/**
 *
 * @author BSE213037
 */
public class BSE213037_Lab07Recursive {

    public static int addNum(int num){
        if (num ==0) {
            return 0;
        }
        else    
            return num+addNum(num-1);
    }
    
    public static int XpowerY(int x , int y){
        if (y ==0) {
            return 1;
        }
        else    
        {
            return x * XpowerY(x , y-1);
        }
    }
    
    public static int fabonacci(int num){
        if (num <=1) {
            return num;
        }
        else    
        {
            return fabonacci(num-1) + fabonacci(num-2);
        }
    }
    
    public static String stringReverse(String str){
        if (str.length() <=1) {
            return str;
        }
        else    
        {
            return stringReverse(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string to reverse...");
        String input = obj.nextLine();
        String result = stringReverse(input);
        System.out.println("Reverse string of " + input + " is = " + result);
    }
}
