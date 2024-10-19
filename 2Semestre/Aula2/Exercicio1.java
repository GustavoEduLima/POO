package Aula2;

public class Exercicio1 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Gustavo");
        aluno1.setMatricula("248351");
        aluno1.setCurso("Analise e desenvolvimento de sistemas");

        System.out.println(aluno1.toString());
    }
}
