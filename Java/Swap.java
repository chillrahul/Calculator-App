import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        swap(8,9);
    }
    static void swap(int a, int b){
        //n.nextInt();
        int temp = a;
     //a=temp;
     b =a;
     b=temp;
        System.out.println(a+""+b);
    }
}
