public class Mario {

    //Atributos:
    private String nome;
    private int idade;
    private double altura;
    private int peso;
    private String corDaRoupa;
    private int estamina;

    //Construtores:
    public Mario(){
        this.nome = "Mario Bros";
        this.idade = 40;
        this.estamina = 100;
        this.altura = 1.50;
    }
    public Mario(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.estamina = 100;
        this.altura = altura;
    }

    //Setters e Getters:
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double a){
        this.altura = a;
    }
    public int getPeso(){
        return this.peso;
    }
    public void setPeso(int p){
        this.peso = p;
    }
    public String getCorDaRoupa(){
        return this.corDaRoupa;
    }
    public void setCorDaRoupa(String c){
        this.corDaRoupa = c;
    }
    public int getEstamina(){
        return this.estamina;
    }
    public void setEstamina(int e){
        this.estamina = e;
    }


    //Metodos:
    void caracteristicas(){
        System.out.println("CARACTERÍSTICAS: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Idade: " + this.idade);
        System.out.println("Estamina: " + this.estamina);
        System.out.println("Cor da Roupa: " + this.corDaRoupa);
    }
    void poderes(){
        System.out.print("Habilidades: ");
        System.out.println("Pular, Correr, Voar, Bola de fogo, etc...");
    }

}
