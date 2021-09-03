// e a quantidade de pessoas maiores de idade.
import java.util.Scanner;

public class exercicioArray2 {

    public static void main(String[] args){

        int[] idades = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade das dez pessoas: ");
        for (int i = 0; i < idades.length; i++){
            idades[i] = scan.nextInt();
        }
        int maiorDeIdade = 0;

        for(int idade : idades) {
            if (idades[idade] >= 18) {
                maiorDeIdade++;
            }
        }
        System.out.println("");
        System.out.println("As idades das pessoas são: ");
        System.out.println("");
        for(int idade : idades) {
            System.out.println(idade);
        }
        System.out.println("");
        System.out.println("ao todo, " + maiorDeIdade + " pessoa(s) é/são maior(es) de idade. ");
    }
}