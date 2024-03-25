import java.util.Scanner;

public class function {
    public static void announceDevTeaTime() {
        System.out.println("Waiting for developer tea time.");
        System.out.println("Type in a random word to start developer tea time");

        Scanner input = new Scanner(System.in);
        input.next();

        System.out.println("It's developer tea time!");

        input.close();
    }
    public static void main(String args[]) {
        announceDevTeaTime();
    }
}
