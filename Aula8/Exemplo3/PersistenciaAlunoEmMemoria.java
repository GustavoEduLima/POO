import java.util.ArrayList;

public class PersistenciaAlunoEmMemoria implements PersistenciaAluno{

    private ArrayList<Aluno> tabelaAluno = new ArrayList<>();

    @Override
    public void salvar(Aluno aluno) {
        tabelaAluno.add(aluno);        
    }

    @Override
    public void remover(Aluno aluno) {
        if(tabelaAluno.contains(aluno)){
            tabelaAluno.remove(aluno);
        }  else{
            System.out.println("Aluno inexistente");
        }      
    }

    @Override
    public void remover(int ra) {
        Aluno tmp = this.buscarPorRa(ra);
        if(tmp != null){
            tabelaAluno.remove(tmp);
        }else{
            System.out.println("Aluno inexistente");
        }
    }

    @Override
    public void atualizar(Aluno aluno, int ra) {
        Aluno tmp = this.buscarPorRa(ra);
        if(tmp != null){
            tabelaAluno.remove(tmp);
            tabelaAluno.add(aluno);
        }else{
            System.out.println("Aluno inexistente");
        }
    }

    @Override
    public Aluno buscarPorNome(String nome) {
        Aluno tmp;
        for(int cont = 0; cont < tabelaAluno.size(); cont++){
            tmp = tabelaAluno.get(cont);
            if(tmp.nome.equals(nome)){
                return tmp;
            }
        }

        return null;
    }

    @Override
    public Aluno buscarPorRa(int ra) {
        Aluno tmp;
        for(int cont = 0; cont < tabelaAluno.size(); cont++){
            tmp = tabelaAluno.get(cont);
            if(tmp.ra == ra){
                return tmp;
            }
        }

        return null;
    }
    
}
