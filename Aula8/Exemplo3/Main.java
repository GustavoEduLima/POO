public class Main {

    public static void main(String[] args) {
        Aluno a = new Aluno();

       PersistenciaAluno p = new PersistenciaAlunoDB();

        p.salvar(a);
    }
    
}
