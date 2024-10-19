package Aula1;

public class Exercicio2 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.titulo = "Memorias Postumas de Bras Cubas";
        livro1.autor = "Machado de Assis";
        livro1.paginas = 368;

        livro2.titulo = "Roube como artista";
        livro2.autor = "Austin Kleon";
        livro2.paginas = 160;

        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Número de páginas: " + livro1.paginas);
        System.out.println();

        System.out.println("Livro 2:");
        System.out.println("Título: " + livro2.titulo);
        System.out.println("Autor: " + livro2.autor);
        System.out.println("Número de páginas: " + livro2.paginas);
    }
}
