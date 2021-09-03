import java.util.Random;

public class exercicioArray {
    public static void main (String[] args){
        int[] primeiroVetor = new int[5];
        int[] segundoVetor = new int[5];
        Random numeroAleatorio = new Random();

        for (int i = 0; i < primeiroVetor.length; i++){
            primeiroVetor[i] = numeroAleatorio.nextInt(5);
        }
        for (int i = 0; i < primeiroVetor.length; i++){
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

        for (int vetor : primeiroVetor)
        System.out.println(vetor);

        System.out.println("");

        for (int vetor : segundoVetor)
            System.out.println(vetor);



    }
}
