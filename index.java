import java.util.Scanner;

public class index {

    public static void main(String[] args) {

        double studentGPA = 3.45;
        String studentFirstName = "Guilhermo";
        String studentLastName = "Silveira";

        System.out.println(studentFirstName + " " + studentLastName + " has the GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has the GPA of " + studentGPA);

        input.close();
    }

}