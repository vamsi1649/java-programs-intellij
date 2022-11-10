package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nestedif6 {
    public static void main(String[] args) throws IOException  {
        int a; int b;
        System.out.println("Enter two number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        a=Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        b=Integer.parseInt(br.readLine());   // String.parseString
        if (a>b) {
            System.out.print(a - b);
        }
            else if (a<b) {
            System.out.println(a + b);
        }
            else if (a==b){
                System.out.println("a equals to b");
            } else {
                System.out.println("fail");
        }
    }
}


