package exercises;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String user_name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name: ");
        user_name = in.nextLine();
        System.out.println("Hello, " + user_name);
    }
}