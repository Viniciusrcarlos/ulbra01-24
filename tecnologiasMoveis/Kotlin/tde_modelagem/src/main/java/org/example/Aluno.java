package org.example;

public class Aluno {

    private String nome;
    private long matricula;
    private int idade;
    private String curso;

    public Aluno(String nome, long matricula, int idade, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }
    public Aluno() {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Idade: "+this.idade);
        System.out.println("Curso: "+this.curso);
    }

}
