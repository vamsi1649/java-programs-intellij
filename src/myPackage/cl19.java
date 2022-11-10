package myPackage;

class ne18 {
    int i;
    String xyz;
    String xyw;

    public void met1() {
        i = i % 2;
        System.out.println(i);// 10/3
        System.out.println(xyz);
    }

    public void met2() {
        int x = i + 2;
        int z = i * 20;
        System.out.println(x);
        System.out.println(z);
        System.out.println(xyw);
    }
}public class cl19 {
    public static void main(String[] args) {
        ne18 su = new ne18();
        su.i = 625;
        su.xyz = "rkv";
        su.xyw = "krishna";
        su.met1();
        su.met2();
    }
}
