package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gas;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the miles you have traveled: ");
        miles = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("Enter gallons of gas used: ");
        gas = in.nextDouble();

        mpg = miles/gas;
        System.out.println("Your miles per gallon is: " + mpg);

    }
}
