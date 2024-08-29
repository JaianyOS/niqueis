public enum Palavra {

    BANANA ("banana", 10),
    MORANGO ("morango", 20),
    ESTRELA ("estrela", 40);

    private String palavra;
    private int valor;

    Palavra(String palavra, int valor) {
        this.palavra = palavra;
        this.valor = valor;
    }

    public String getPalavra() {
        return palavra;
    }

    public int getValor() {
        return valor;
    }

}