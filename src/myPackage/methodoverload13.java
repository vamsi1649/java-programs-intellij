package myPackage;

public class methodoverload13 {
    public static void cal1(){
        System.out.println("vamsi");
    }
    public static void cal2(int i){
        System.out.println(i * 20);
    }
    public static void main(String[] args){
        methodoverload13 m =new methodoverload13();
        m.cal2(20);
        m.cal1();


    }
}
