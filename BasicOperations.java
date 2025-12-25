package Assignment1;

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=kb.nextInt();
        int b=kb.nextInt();
        add(a,b);
        subtract(a,b);
        multiply(a,b);
        divide(a,b);
        remainder(a,b);
        square(a);
        cube(a);
        absolute(b);

    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void subtract(int a,int b){
        System.out.println(a-b);
    }
    public static void multiply(int a,int b){
        System.out.println(a*b);
    }
    public static void divide(int a,int b){
        System.out.println((double)a/b);
    }
    public static void remainder(int a,int b){
        System.out.println((double)a%b);
    }
    public static void square(int a){
        System.out.println(a*a);
    }
    public static void cube(int a){
        System.out.println(a*a*a);
    }
    public static void absolute(int a){
        if(a<0){
            System.out.println(-a);
        }
        else{
            System.out.println(a);
        }
    }

}
