
package exercicios_sequenciais_exercicio09;

import java.util.Scanner;


public class LerTemperatura {

    public static void main(String[] args) {
        
        ConverterCelsiusFahenheit();
        
    }
    static void ConverterCelsiusFahenheit() {
        
        double celcius, fahrenheit = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a temperatura em graus Celsius: ");
         double celsius = scanner.nextDouble();
        
         
        fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        
        
        
    }
}
