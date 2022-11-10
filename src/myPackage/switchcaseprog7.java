package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcaseprog7 {
    public static void main(String[] args) throws IOException  {
        int a, b, c;
        System.out.println("Enter two number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());

        switch (c){
            case 1:
                System.out.println(a/b);
                break;
            case 2:
                System.out.println(a%b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("wrong number");
        }
    }
}
