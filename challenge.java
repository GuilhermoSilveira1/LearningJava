import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        String question = "Complete o ditado: Quem tem boca, vai à ...? (Coloque o número da resposta)";
        String choiceOne = "1 - Curitiba";
        String choiceTwo = "2 - Brasília";
        String choiceThree = "3 - Roma";
        Boolean gotItRight = true;
        Scanner input = new Scanner(System.in);
        

        while(gotItRight) {

            System.out.println(question);
            System.out.println(choiceOne);
            System.out.println(choiceTwo);
            System.out.println(choiceThree);

            int correctAnswer = input.nextInt();

            if (correctAnswer != 3) {
                System.out.println("Wrong answer, think a bit more!");
            } else {
                gotItRight = false;
            }

        }

        System.out.println("Congratulations, you got the answer right!");

        input.close();
    }
}
