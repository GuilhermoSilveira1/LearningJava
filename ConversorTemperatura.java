/*Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), 
Réaumur (Re), Rankine (Ra) e 
Fahrenheit (F), seguindo as fórmulas: 
F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.6 */

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temperaturaCelcius = input.nextDouble();

        double temperaturaFahren = (temperaturaCelcius * 1.8) + 32;

        double temperaturaKelvin = temperaturaCelcius + 273;

        double temperaturaRéaumur = temperaturaCelcius * 0.8;

        double temperaturaRankine = temperaturaFahren + 459.6;

        System.out.println("A tempera em graus Celcius foi:");
        System.out.println(temperaturaCelcius);
        System.out.println();
        System.out.println("As conversões em Fahrenheit, Kelvin, Réaumur e Rankine são:");
        System.out.println(temperaturaFahren);
        System.out.println(temperaturaKelvin);
        System.out.println(temperaturaRéaumur);
        System.out.println(temperaturaRankine);

        input.close();
    }
}
