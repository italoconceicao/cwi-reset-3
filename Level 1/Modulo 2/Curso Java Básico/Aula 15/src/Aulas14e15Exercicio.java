import java.util.Scanner;

public class Aulas14e15Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media == 10) {
            System.out.println("Aluno aprovado com louvores!");
        } else if (media >= 7 && media < 10) {
            System.out.println("Aluno aprovado com média " + media);
        } else {
            System.out.println("Aluno reprovado com média " + media);
        }
    }
}