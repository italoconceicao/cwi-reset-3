import java.util.Scanner;

public class aula18Exercicio2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiroNumero = scan.nextInt();
        System.out.println("Agora digite um número maior que o anterior: ");
        int ultimoNumero = scan.nextInt();

        while (primeiroNumero >= ultimoNumero) {
            System.out.println("Número Inválido");
            System.out.println("O primeiro número foi: " + primeiroNumero + " Digite um número maior.");
            ultimoNumero = scan.nextInt();
        }

        for (++primeiroNumero; primeiroNumero < ultimoNumero; primeiroNumero++) {
            System.out.println(primeiroNumero);
        }

    }
}