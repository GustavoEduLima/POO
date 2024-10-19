package Exercicio3;

public class main {
    public static void main(String[] args) {
        
        CalcularSoma cs = new CalcularSoma();
        CalcularSub csu= new CalcularSub();
        CalculadoraDiv cd = new CalculadoraDiv();
        CalculadoraMult cm = new CalculadoraMult();

        System.out.println("Soma: " + cs.calcular(5, 3));
        System.out.println("Subtração: " + csu.calcular(5, 3));
        System.out.println("Multiplicação: " + cm.calcular(5, 3));
        System.out.println("Divisão: " + cd.calcular(5, 3));
        
    }
}
