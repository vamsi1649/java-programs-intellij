package myPackage;
class xy1{
    public int cal(int x, int y){
        return x%y;
    }
}
class xy2 extends xy1{
    public int cal2(int x, int y){
        return x*y;
    }
}
class xy3 extends xy2{
    public int cal3(int x, int y){
        return x+y;
    }
}
public class inheritance20 {
    public static void main(String[] args) {
        xy3 a=new xy3();
        System.out.println(a.cal2(20,12));
    }
}
