import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("Pick a number from 1 to 10!");

        Scanner input = new Scanner(System.in);
        int numberChosen = input.nextInt();

        if (numberChosen < 5) {
            System.out.println("Enjoy the luck a friend brings!");
        } else {
            System.out.println("Your shoe selection will make you very happy today!");
        }

        input.close();

    }
}
