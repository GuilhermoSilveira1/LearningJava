public class totalMealPrice {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    } //Adicionando double na frente da função pede que alguma das variáveis locais sejam indicadas como um valor a ser retornado,
    //ao invés de void, que não retorna um valor, já que a função apenas executa o que precisa, e acaba.
    public static void main(String args[]){
        //Assim, o valor de result vai ser o que a função vai retornar, e o que vai para a variável declarada.
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);
    }
}
