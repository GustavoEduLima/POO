package Aula3.Excercicio2;

public class Main {
    public static void main(String[] args) {
        
        CalculadoraAvançada cda = new CalculadoraAvançada();

        System.out.println(cda.PotenciaNumInt(8, 2));
        System.out.println(cda.PotenciaNumDec(10, 3));
        System.out.println(cda.PotenciaNumNeg(-2, 2));
    }
}
