public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Vermelha", 0.7 );
        Caneta c2 = new Caneta("BRW", "Roxa", 0.3);




        c1.status();
        c2.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        //se tentasse usar diretamente a variavel modelo ou ponta ocasionaria em erro por terem a visibilidade de privado.



    }




}
