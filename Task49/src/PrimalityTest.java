import java.util.Random;
import java.util.Scanner;

public class PrimalityTest {
    public static boolean isPrimeAndSmall(int p){
        if(p <= 1) {
            return false;
        }
        for(int i = 2; i < Math.sqrt(p);i++) {
            if(p % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void provideP(){
        System.out.println("PROVIDE YOUR NUMBER");
        Scanner s = new Scanner(System.in);
        int p;
        while (true) {
            System.out.print("please enter the value, and I'll check if it's prime! :) ");
            p = s.nextInt();
            if (isPrimeAndSmall(p)) {
                System.out.println("TRUE ! p is prime" );
                break;
            }  else {
                System.out.println("FALSE ! This number is not prime ! :( ");
            }
        }
    }
}
