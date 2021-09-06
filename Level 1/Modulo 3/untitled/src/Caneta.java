public class Caneta {
    public String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, double p) {//Método Construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();

    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public double getPonta(){
        return this.ponta;
    }public void setPonta(Double p){
        this.ponta = p;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean b){
        this.tampada = b;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
        System.out.println("Ponta: " + this.getPonta());

    }


}
