package Aula3.Exercicio1;

public class Teste {
    public static void main(String[] args) {
        
        Conversor cvs = new Conversor();

        System.out.println(cvs.converterMetros(2.5) + " centímetros");
        System.out.println(cvs.converterHoras(3.5) + " minutos"); 
        System.out.println(cvs.converterDias(2) + " horas"); 
    }
}