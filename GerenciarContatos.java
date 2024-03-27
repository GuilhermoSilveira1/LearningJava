import java.util.Scanner;
import java.util.ArrayList;

public class GerenciarContatos {

    private static int idContato = 1;

    public static Contatos criarContatos () {
        System.out.println("Digite o nome do contato:");
        Scanner input_firstName = new Scanner(System.in);
        String firstName = input_firstName.next();

        System.out.println("Digite o sobrenome do contato");
        Scanner input_lastName = new Scanner(System.in);
        String lastName = input_lastName.next();

        System.out.println("Digite o número do telefone, sem espaços ou traços:");
        Scanner input_numTelefone = new Scanner(System.in);
        String numTelefone = input_numTelefone.next();

        System.out.println("Digite a cidade que " + firstName + " trabalha:");
        Scanner input_cidade = new Scanner(System.in);
        String cidade = input_cidade.next();

        Contatos contato = new Contatos (idContato++, firstName, lastName, numTelefone, cidade);

        System.out.println("Contato criado!");

        input_firstName.close();
        input_lastName.close();
        input_numTelefone.close();
        input_cidade.close();
        
        return contato;
    }
    
    public static void main (String[] args) {

        System.out.println("Olá, qual ação gostaria de realizar?");
        System.out.println("1 - Criar novo contato");
        System.out.println("2 - Exibir contatos cadastrados");
        System.out.println("3 - Deletar contato");

        Scanner input_action = new Scanner(System.in);
        int action = input_action.nextInt();

        if (action == 1) {
            criarContatos();
        }

        //ver como usar a variável action para puxar qual função deve ser executada.        

        input_action.close();
    }
}
