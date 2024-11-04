package Aula1;

public class Exercicio1 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "Gustavo Edu";
        aluno1.matricula = "214466";
        aluno1.curso = "Analise e desenvolvimento de sistemas";
        
        aluno2.nome = "Murilo Edu";
        aluno2.matricula = "213344";
        aluno2.curso = "Engenharia da computação";

        aluno3.nome = "Amauri";
        aluno3.matricula = "217788";
        aluno3.curso = "Gestão de TI";

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Curso: " + aluno1.curso);
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Matrícula: " + aluno2.matricula);
        System.out.println("Curso: " + aluno2.curso);
        System.out.println();

        System.out.println("Aluno 3:");
        System.out.println("Nome: " + aluno3.nome);
        System.out.println("Matrícula: " + aluno3.matricula);
        System.out.println("Curso: " + aluno3.curso);

    }
}
