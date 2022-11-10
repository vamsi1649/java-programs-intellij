package myPackage;
class ed{    // parent
    public int cal(int x, int y){
        int d=4;
        return x+y;
    }
}
class ed1 extends ed{      //child
    int sum=d+4;
    public int cal_adv(int x, int y){
        return x-y;
    }
}
class ed2 extends ed1{    // parent
    public int cals(int x, int y){
        return x*y;
    }
}
public class inheritance21 {
    public static void main(String[] args) {


    }
}
