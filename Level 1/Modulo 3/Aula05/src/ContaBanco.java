public class ContaBanco {

    //Attributes:
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Métodos:
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "cc"){
            setSaldo(50);
        } else if (t == "cp") {
            setSaldo(150);
        } else {
            //CÓDIGO PEDINDO PARA DIGITAR NOVAMENTE O TIPO DA CONTA
        }
    }
    public void fecharConta(){
        if (saldo > 0){
            System.out.println("Conta com dinheiro.");
        } else if (saldo < 0){
            System.out.println("Conta em débito.");
        } else {
            setStatus(false);
        }
    }
    public void depositar(double valor){
        if (getStatus()){
            setSaldo(getSaldo() + valor); // igual à: saldo += valor;
        } else {
            System.out.println("Impossível depositar!");
        }
    }
    public void sacar(double valor){
        if (getStatus()){
            if (saldo > valor) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar!");
        }
    }
    public void pagarMensal(){
        double v;
        if (tipo == "cc") {
            v = 12;
        } else if (tipo == "cp"){
            v = 20;
        } else {
            //CÓDIGO PEDINDO PARA DIGITAR NOVAMENTE O TIPO DA CONTA
        }
        if (getStatus()){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
    }

    //Constructor:
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }


    //Setters & Getters:

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return dono;
    }
    public void setDono(String d){
        this.dono = d;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }

}