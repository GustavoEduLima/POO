package sistemarh;

// Subclasse
public class Desenvolvedor extends Funcionario {
    String linguagemDeProgramacao;

    void programar() {
        System.out.println(nome + " está programando em " + linguagemDeProgramacao);
    }

    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

        

}

