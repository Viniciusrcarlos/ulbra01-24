package org.example;

public class Voo {
    private String companhiaAerea;
    private String origem;
    private String dataPartida;
    private long precoPassagem;

    public Voo(String companhiaAerea, String origem, String dataPartida, long precoPassagem) {
        this.companhiaAerea = companhiaAerea;
        this.origem = origem;
        this.dataPartida = dataPartida;
        this.precoPassagem = precoPassagem;
    }
    public Voo() {

    }

    public void informacoesVoo() {
        System.out.println("Companhia Aerea: "+this.companhiaAerea);
        System.out.println("Origem: "+this.origem);
        System.out.println("Data da partida: "+this.dataPartida);
        System.out.println("Preco da passagem: R$"+this.precoPassagem);
    }
}
