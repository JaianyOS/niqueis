import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortearPalavras {
    private Random random;

    public SortearPalavras (){
        random = new Random();
    }
    public void sorteio(int quantidade) {


        Palavra[] palavras = Palavra.values();
        List<Palavra> lista = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            lista.add(palavras[random.nextInt(palavras.length)]);
        }

        int pontuacaoTotal = lista.stream().mapToInt(Palavra::getValor).sum();

        System.out.println("\nPalavras sorteadas: \n");
        lista.forEach(p -> System.out.print("| " + p.getPalavra() + " "));
        System.out.println("\nPontuacao Total: " + pontuacaoTotal);

        long count = lista.stream().distinct().count();
        if (count ==1){
            int bonus = pontuacaoTotal * 100;
            System.out.println("\nPontuacao total com bonus: " + bonus);
        }

    }
}
