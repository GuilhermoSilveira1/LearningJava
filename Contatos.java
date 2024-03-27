public class Contatos {
    
    //Primeiro declarar quais os atributos dessa classe
    int idContato;
    String firstName;
    String lastName;
    String numTelefone;
    String cidade;


    //Criar o construtor, com a sintaxe public e o mesmo nome da classe
    public Contatos (int idContato,
                    String firstName,
                    String lastName,
                    String numTelefone,
                    String cidade) {
        this.idContato = idContato;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numTelefone = numTelefone;
        this.cidade = cidade;
    }


    //caso necessário, adicionar algum método, com a sintaxe public (tipo da função) (nome da função) () {}


}
