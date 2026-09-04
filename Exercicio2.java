import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero");
        numero = scanner.nextInt();
        if (numero >= 0) {
            System.out.println("O numero é Positivo");
        }
        else {
            System.out.println("O numero é Negativo");      
        }
        scanner.close();
    }
}