public class Main {

    public static void main(String[] args) {

        System.out.println(Calculadora.soma(2, 3));
        System.out.println(Calculadora.subtracao(2, 3));

        System.out.println("Exemplo id");
        System.out.println("");

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        System.out.println(a1.id);
        System.out.println(a2.id);
        System.out.println(Aluno.contId);
        
    }
    
}
