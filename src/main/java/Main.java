import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */

//write a program which prompts the user to input a number n
    // Program should respond by printing the sum of numbers 1 to n

public class Main {

    public static void main(String[] args){
        Scanner sumPrinter = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sumPrinter.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
