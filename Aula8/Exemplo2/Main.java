import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Bicicleta b = new Bicicleta();
        // Bicicleta b2 = new Bicicleta();
        // Halter h = new Halter();
        // Equipamento e = new Bicicleta();

        // ArrayList<Bicicleta> listaDeBicicletas = new ArrayList<>();
        // listaDeBicicletas.add(b2);
        // listaDeBicicletas.add(b);

        // b.setDataAquisicao("212121");
        // b.setPreco(2000.00);
        // b.setPotencia(10.0);

        // h.setDataAquisicao("9787878");
        // h.setPreco(300.00);
        // h.setPeso(7000.00);

        // System.out.println("B1");
        // System.out.println(b);
        // System.out.println(b.custoMensal());

        // System.out.println("H");
        // System.out.println(h);
        // System.out.println(h.custoMensal());

        // e.setDataAquisicao("4545454");
        // e.setPreco(2000.00);

        // System.out.println("B2 = E");
        // System.out.println(e.custoMensal());

        // Exemplo de List (ArrayList)
        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Ana");
        listaDeNomes.add("Bruno");
        listaDeNomes.add("Carlos");
        listaDeNomes.add("Ana"); // Permite duplicatas
        String nome = listaDeNomes.get(3);
        System.out.println(nome);
        System.out.println("Lista: " + listaDeNomes);

        // Exemplo de Set (HashSet)
        HashSet<String> conjuntoDeNomes = new HashSet<>();
        conjuntoDeNomes.add("Ana");
        conjuntoDeNomes.add("Bruno");
        conjuntoDeNomes.add("Carlos");
        conjuntoDeNomes.add("Ana"); // Não permite duplicatas
        System.out.println("Conjunto: " + conjuntoDeNomes);

        // Exemplo de Map (HashMap)
        HashMap<String, Integer> idadePorNome = new HashMap<>();
        idadePorNome.put("Ana", 28);
        idadePorNome.put("Bruno", 35);
        idadePorNome.put("Carlos", 30);
        int idadeRecuperada = idadePorNome.get("Carlos");
        System.out.println(idadeRecuperada);
        System.out.println("Mapa de Idades: " + idadePorNome);

        // Exemplo de Queue (LinkedList)
        LinkedList<String> filaDeNomes = new LinkedList<>();
        filaDeNomes.add("Ana");
        filaDeNomes.add("Bruno");
        filaDeNomes.add("Carlos");
        System.out.println("Fila: " + filaDeNomes);
        filaDeNomes.poll(); // Remove o primeiro elemento
        System.out.println("Fila após remoção: " + filaDeNomes);


    }
    
}
