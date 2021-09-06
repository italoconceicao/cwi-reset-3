public class Mario {

    double altura;
    String corRoupa;
    String nacionalidade;
    String habilidades[] = {"pular", "correr", "atacar"};


    void status(){
        System.out.println("Sua altura é: " + altura);
        System.out.println("A cor da sua roupa é: " + corRoupa);
        System.out.println("Sua nacionalidade é: " + nacionalidade);
    }
    void listarHabilidades(){
        System.out.print("Suas habilidades são: ");
        for(int i = 0; i < habilidades.length; i++) {
            System.out.println(habilidades[i]);

        }

    }
}
