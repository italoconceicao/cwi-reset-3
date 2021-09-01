import java.util.Scanner;

public class aula18Exercicio {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 10: ");
        int numero = scan.nextInt();


                if (numero >= 1 && numero <= 10) {
                    System.out.println(numero);
                } else { while (numero < 1 || numero > 10) {
                    System.out.println("Número Inválido");
                    System.out.println("Digite novamente um número entre 1 e 10: ");
                    numero = scan.nextInt(); }
                    System.out.println(numero);

                }



    }
}