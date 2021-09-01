public class LoopFor {
    public static void main (String[] args){
        //for "normal":
        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);
        }

        //for com mais de uma variável:
        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }

        //for com partes ausentes:
        int count = 0;
        for ( ;count < 5; ){
            System.out.println("Valor de count: " + count);
            count += 2;
        }

    }
}
