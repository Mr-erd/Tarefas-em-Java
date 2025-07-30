import java.util.Scanner;


public class main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Ola informe seu nome: ");
        String nome = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("ola %s, sua idade e %s \n", nome, age);

        
        
    }
}
