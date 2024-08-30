
public class AppSystem {

    private IO io;
    private SortearPalavras sortearPalavras;

    public AppSystem() {
        io = new IO();
        sortearPalavras = new SortearPalavras();
    }

    public void start() {
        boolean running = true;
        while (running) {
            io.menu();
            int choice = io.getUserChoice();

            if (choice == 1) {
                System.out.println("Qual quantidade de palavras deseja sortear? (deve ser 3 ou mais)\n");
                int quantidade = io.getUserChoice();
                if (quantidade < 3) {
                    System.out.println("\nA quantidade deve ser maior ou igual a 3.\n");
                } else {
                    sortearPalavras.sorteio(quantidade);
                }
            } else if (choice == 2) {
                running = false;
            } else {
                System.out.println("\nOpcao invalida.\n ");
            }
        }
        io.close();
    }
}