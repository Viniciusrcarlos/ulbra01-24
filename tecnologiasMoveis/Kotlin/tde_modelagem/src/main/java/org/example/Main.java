package org.example;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Vinicius", 321, 21, "ADS");
        aluno.mostrarInformacoes();

        System.out.println();

        Praia praia = new Praia("Guarita", "Torres", "25C", "Normal");
        praia.informacoesPraia();

        System.out.println();

        Voo voo = new Voo("Azul", "Porto Alegre", "15/03/2024", 1200);
        voo.informacoesVoo();



    }
}