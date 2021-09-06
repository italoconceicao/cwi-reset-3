public class Visibilidade {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
//        c1.ponta = 0.5;
        c1.carga = 80;
//        c1.tampada = true;
        c1.status();
        c1.rabiscar();
    }
}
