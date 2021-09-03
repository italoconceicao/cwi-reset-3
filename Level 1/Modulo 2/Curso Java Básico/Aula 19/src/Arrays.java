import java.util.Random;

public class Arrays {
    public static void main (String[] args) {

        double[] temperaturas = new double[365]; //no Java, a quantidade de itens de um Array precisa ser declarada
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;


        for (double temp: temperaturas) { //modelo de iteração para o for, no Java
            System.out.println(temp);
        }

        int[] notas = new int[10];
        Random numeroAleatorio = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = numeroAleatorio.nextInt(10);
        }

        System.out.println("Usando o For ''Comum'': ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Usando o For Each: ");
        for (int nota : notas){
            System.out.println(nota);
        }

    }
}
