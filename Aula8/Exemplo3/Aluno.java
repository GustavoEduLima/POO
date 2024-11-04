public class Aluno{
    String nome;
    String curso;
    int ra;
    static int geradorRa = 0;

    public Aluno(){
        geradorRa++;
        this.ra = geradorRa;
    }
}