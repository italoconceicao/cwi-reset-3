import java.util.Scanner;

public class aula18Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10: ");
        int numeroTabuada = scan.nextInt();
        while (numeroTabuada < 1 || numeroTabuada > 10) {
            System.out.println("Número Inválido");
            System.out.println("Digite um número de 1 a 10: ");
            numeroTabuada = scan.nextInt();
        }
        System.out.println("TABUADA DO " + numeroTabuada + ":");

        System.out.println(numeroTabuada + " x 1 = " + numeroTabuada * 1);
        System.out.println(numeroTabuada + " x 2 = " + numeroTabuada * 2);
        System.out.println(numeroTabuada + " x 3 = " + numeroTabuada * 3);
        System.out.println(numeroTabuada + " x 4 = " + numeroTabuada * 4);
        System.out.println(numeroTabuada + " x 5 = " + numeroTabuada * 5);
        System.out.println(numeroTabuada + " x 6 = " + numeroTabuada * 6);
        System.out.println(numeroTabuada + " x 7 = " + numeroTabuada * 7);
        System.out.println(numeroTabuada + " x 8 = " + numeroTabuada * 8);
        System.out.println(numeroTabuada + " x 9 = " + numeroTabuada * 9);
        System.out.println(numeroTabuada + " x 10 = " + numeroTabuada * 10);



    }
}

/* Uma solução melhor:

import java.util.Scanner;

class Exercicio4Aula9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número que deseja gerar a tabuada:");
        int numero = scan.nextInt();

        System.out.println("Tabuada do " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}

 */