package YalActivity1;

import java.util.Scanner;

public class YalActivity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Inputted number Zero");
        } else if (number > 0) {
            System.out.println(number + " is a positive number");
        } else {
            System.out.println(number + " is a negative number");
        }

        input.close();
    }
}
