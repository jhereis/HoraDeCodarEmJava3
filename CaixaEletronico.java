import java.util.Scanner;

class Main {

  /* Aqui criamos uma variavel global. Global significa que o elemento pode ser acessado por qualquer método. Para tornar global, utilizamos a palavra static.
  */
  static double saldo = 100;

  /*  Um método simples que só exibe uma mensagem ao usuário e em seguida chama a função principal. */
  public static void ver_saldo() {
    System.out.println("Seu saldo atual é: " + saldo);

    //O método "main" pode receber comandos diretamente da linha de comando. Quando isso não ocorre, usamos a palavra "null" para avisar que nada será passado
    main(null);
  }

  /*  Método para receber informado pelo usuário, processar e levar a uma mensagem de sucesso ou a repetição da função */
  public static void fazer_deposito() {

    System.out.println("Qual o valor a ser depositado?");
    Scanner valor = new Scanner(System.in);
    Double deposito = valor.nextDouble();

    // Not a Number
    boolean checaNumero = deposito.isNaN(); // o método isNaN retorna checa se o valor informado é um Não-Número e retorna verdadeiro ou falso.

    if (checaNumero || deposito <= 0) {
      System.out.println("Por favor, informe um número válido:");
      fazer_deposito();
    } else {
      saldo += deposito;
      ver_saldo();
    }

    valor.close();
  }

  public static void fazer_saque() {
    System.out.println("Qual o valor para saque?");
    Scanner valor = new Scanner(System.in);
    Double saque = valor.nextDouble();

    boolean checaNumero = saque.isNaN();

    if (checaNumero || saque < 0) {
      System.out.println("Por favor, informe um número válido:");
      fazer_saque();
    } else {
      saldo -= saque;
      ver_saldo();

      valor.close();
    }
  }

  public static void erro() {
    System.out.println("Por favor, informe um número entre 1 e 4");
    main(null);
  }

  public static void sair() {
    System.out.println("Você deseja sair? S/N");

    Scanner sair = new Scanner(System.in);
    String escolha = sair.nextLine();

    if (escolha.equals("S")) {
      System.out.println("Até logo.");
      System.exit(0);
    } else if (escolha.equals("N")) {
      main(null);
    } else {
      System.out.println("Desculpe, mas não compreendi.");
      sair();
    }

    sair.close();

  }

  public static void main(String[] args) {
    System.out.println("Selecione uma opção 1.) Saldo 2.) Depósito 3.) Saque 4.) Sair");

    Scanner in = new Scanner(System.in);
    int escolha = in.nextInt();

    if (escolha == 1) {
      ver_saldo();
    } else if (escolha == 2) {
      fazer_deposito();
    } else if (escolha == 3) {
      fazer_saque();
    } else if (escolha == 4) {
      sair();
    } else {
      erro();
    }

    in.close();
  }


}