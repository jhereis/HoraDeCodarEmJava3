public class Carro {

    static int quantidade_portas;
    static int quantidade_rodas; // pode chegar até 26
    static String cor; // Roxo, Prata
    static String pintura;
    static String placa;
    static String marca;
    static double velocidade_maxima;
    static String modelo;

    public static void acelerar(){
        System.out.println("O carro está acelerarando.");
    }

    public static void pop(){
        System.out.println("remover um item dentro do array");
    }


    public static void desacelerar() {
        System.out.println("O carro está desacelerarando.");
    }

    public static void efeito_sonoro() {
        System.out.println("FOOOOOIIIIIIIIIIIMMMMMMMMMM");
    }

    public static void main(String[] args) {
        acelerar();
    }

}
