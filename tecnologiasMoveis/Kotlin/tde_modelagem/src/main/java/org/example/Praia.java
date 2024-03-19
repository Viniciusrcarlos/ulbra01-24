package org.example;

public class Praia {
    private String nome;
    private String localizacao;
    private String temperaturaAgua;
    private String tipoAreia;

    public Praia(String nome, String localizacao, String temperaturaAgua, String tipoAreia) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.temperaturaAgua = temperaturaAgua;
        this.tipoAreia = tipoAreia;
    }
    public Praia() {

    }

    public void informacoesPraia() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Localizacao: "+this.localizacao);
        System.out.println("Temperatuda da agua: "+this.temperaturaAgua);
        System.out.println("Tipo de areia: "+this.tipoAreia);
    }


}
