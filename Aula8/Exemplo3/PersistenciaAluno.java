public interface PersistenciaAluno {

    public void salvar(Aluno aluno);
    public void remover(Aluno aluno);
    public void remover(int ra);
    public void atualizar(Aluno aluno, int ra);
    public Aluno buscarPorNome(String nome);
    public Aluno buscarPorRa(int ra);


    
}
