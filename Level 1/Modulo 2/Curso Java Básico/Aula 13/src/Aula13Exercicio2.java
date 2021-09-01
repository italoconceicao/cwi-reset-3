import java.util.Scanner;

public class Aula13Exercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextInt();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextInt();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scan.nextInt();
        System.out.println("A média é: " + (nota1 + nota2 + nota3 + nota4) / 4);

    }
}
