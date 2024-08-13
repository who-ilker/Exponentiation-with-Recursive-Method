import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Base: ");
        int base = scanner.nextInt();
        System.out.print("Exponent: ");
        int exponent = scanner.nextInt();
        System.out.println(base + "^" + exponent + " = " +pow(base, exponent));

    }
    static int pow(int base, int exponent){
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        else
            return base * pow(base, exponent - 1);
    }
}

/* (4^3)  ->  4 * (4^2)
                  (4^2)-> 4 * (4*1)
                              (4*1) = 4
   4 ^3
*/