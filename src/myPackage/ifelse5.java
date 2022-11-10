package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifelse5 {
    public static void main(String[] args) throws IOException  {
        int marks;
        System.out.println("Enter marks in numbers");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        marks=Integer.parseInt(br.readLine());

        if (marks >= 35) {
            System.out.println("pass");
        } else if (marks < 35) {
            System.out.println("fail");
        }
    }
}

