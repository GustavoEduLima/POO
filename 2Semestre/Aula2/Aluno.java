package Aula2;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return "Aluno{" + "nome='" + nome + '\'' + ", matricula='" + matricula + '\'' + ", curso='" + curso + '\'' +'}';
    }           
}

