package Aula3; 

public class AC1 {
    public static void main(String[] args) {
        
        CursoBasico basico = new CursoBasico("Matemática", 
                                            200);
        CursoAvançado avancado = new CursoAvançado("Programação Java", 
                                                300, 50);
        Especialização especializacao = new Especialização("Data Science",
                                500, 100, 150);

        System.out.println("Curso Básico: " + basico.getNomeCurso() + ", Mensalidade: R$ " + basico.calcularMensalidade());
        
        System.out.println("Curso Avançado: " + avancado.getNomeCurso() + ", Mensalidade: R$ " + avancado.calcularMensalidade());
        
        System.out.println("Curso de Especialização: " + especializacao.getNomeCurso() + ", Mensalidade: R$ " + especializacao.calcularMensalidade());
    }
}
