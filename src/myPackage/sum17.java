package myPackage;

public class sum17 {
        public static int sum(int ...numbers){
            int k=0;
            for (int j=0; j<numbers.length; j++){
                k=k+numbers[j];
            }return k;
        }

        public static void main(String[] args){
            sum17 m=new sum17();
            System.out.println(m.sum(3,4,5,5,3));
        }
    }