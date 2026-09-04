import java.util.Scanner;
public class Exercicio1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas Horas?");
        int horas = scanner.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else {
            if (horas < 18){
                System.out.println("Boa Tarde!");
            }
            else {
                System.out.println("Boa Noite!");
            }
        }
        scanner.close();
    }
}