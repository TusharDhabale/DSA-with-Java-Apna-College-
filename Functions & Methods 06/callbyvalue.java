import java.util.Scanner;

public class callbyvalue {

    public static int swap(int a, int b) { // parameters or formal parameters

        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a :" + a );
       System.out.println("b :" + b );

       return temp;
    }

    public static void main(String[] args) {
        //swap - value excahnge
        int a = 5;
        int b = 10;
        swap(a, b);
       
    }
}
