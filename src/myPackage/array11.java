package myPackage;

public class array11 {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "vamsi";
        str[1] = "ram";
        str[2] = "krishna";
        str[3] = "virat";
        str[4] = "kolhi";
        System.out.println(str.length);
        for (int i = 0; i <= str.length - 1; i++) {
            System.out.println(str[i]);

        }
    }
}