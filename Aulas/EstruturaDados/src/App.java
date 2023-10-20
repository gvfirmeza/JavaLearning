import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack; 

public class App {
    public static void main(String[] args) throws Exception {
        //vetores();
        //arraylist();
        //linkedlist();
        //pilhas();
        //conjuntos();
        mapas();
    }

    public static void vetores() {
        // int[] x;
        // x = new int[5];
        int tamanho = 5;
        int[] arrayInteiros = new int[tamanho];
        arrayInteiros[2] = 2;
        System.out.println(arrayInteiros);

        String[] letras = {"a", "e","r"};
        System.out.println(letras);
        System.out.println(letras.length);

        System.out.println(letras[2]);
        letras[2] = "f";
        System.out.println(letras[2]);

        //percorrendo array
        for (int i = 0; i < tamanho; i++) {
            System.out.println(arrayInteiros[i]);
        }

        // for letra in letras
        for (String letra : letras) {
            System.out.println(letra);
        }

        letras = aumentaVetor(letras);
        System.out.println(letras.length);
    }

    public static String[] aumentaVetor (String[] vetor) {
        String[] novoVetor = new String[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }

        return novoVetor;
    }

    public static void arraylist() {
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros);

        numeros.add(8);
        numeros.add(3);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.get(1));

        numeros.remove(0);
        System.out.println(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        //verfifica se o numero 8 está presente no array
        System.out.println(numeros.contains(8));
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);

        //adiciona um novo elemento no indice 0
        numeros.add(0, 16);
        System.out.println(numeros);

        //modifica o elemento no indice 0
        numeros.set(0, 999);
        System.out.println(numeros);

        //limpa o array
        numeros.clear();
        System.out.println(numeros.size());
    }

    public static void linkedlist () {
        LinkedList<String> carros = new LinkedList<>();
        System.out.println(carros);

        carros.add("gol");
        carros.add(0, "corsa");

        System.out.println(carros);

        System.out.println(carros.indexOf("gol"));

        // !-- pop e push são + eficientes q o add e remove --!
        //remove o primeiro da lista
        carros.pop();
        System.out.println(carros);

        //adiciona no primeiro elemento da lista
        carros.push("palio");
        System.out.println(carros);
    }

    public static void pilhas() {
        Stack<Double> notas = new Stack<>();

        notas.push(4.5);
        notas.push(8.8);
        System.out.println(notas.peek());

        notas.push(0.7);
        System.out.println(notas.peek());

    }

    public static void conjuntos() {
        HashSet<String> frutas = new HashSet<>();
        
        //hashset n é ordenado
        frutas.add("maçã");
        frutas.add("laranja");
        frutas.add("uva");
        System.out.println(frutas);

        //nao inclui elementos iguais
        frutas.add("uva");
        System.out.println(frutas);

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.remove("laranja");
        System.out.println(frutas);        
    }

    public static void mapas() {
        HashMap<String, String> alunos = new HashMap<>();

        alunos.put("2314", "oooo");
        alunos.put("5731", "jaula");

        System.out.println(alunos);
        System.out.println(alunos.get("2314"));
        System.out.println(alunos.get("2310")); // null

        alunos.remove("5731");

        System.out.println(alunos.containsKey("1111"));
        System.out.println(alunos.containsKey("jaula"));
        System.out.println(alunos.containsKey("alegria"));

        System.out.println(alunos.size());

        for (String matricula : alunos.keySet()) {
            System.out.println(matricula);
            System.out.println(alunos.get(matricula));
        }

        for (String nome : alunos.values()) {
            System.out.println(nome);
        }
    }
}
