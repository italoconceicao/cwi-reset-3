import java.util.Scanner;

public class Aula13Exercicio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora: ");
        double porHora = scan.nextInt();
        System.out.println("Digite quantoas horas você trabalhou no referido mês: ");
        double horasTrabalhadas = scan.nextInt();
        System.out.println("Seu salário no referido mês é: " + (porHora * horasTrabalhadas));

    }
}
