package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class methoveruser14 {
    public static void cal(int x, int y) {
        int z;
        z=x+y;
        System.out.println(z);
        z=y-x;
        System.out.println(z);
        z=x*y;
        System.out.println(z);
        z=x%y;
        System.out.println(z);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your number");
        int x; int y; int z;
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());{
            cal(x,y);
        }
    }
}









