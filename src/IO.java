import java.util.Scanner;

public class IO {

    private Scanner scanner;

    public IO() {
        scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Iniciar jogo");
        System.out.println("2. Sair");
    }

    public int getUserChoice() {
        System.out.print("\nDigite sua escolha: ");
        return scanner.nextInt();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void close() {
        scanner.close();
    }
}