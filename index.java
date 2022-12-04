import java.util.Scanner;
public class Main {
  static String letra;
  static int alunos;
  public static void main(String[] args) {

  // exercicio 1
    /*System.out.println("Informe um valor");
    Scanner scan = new Scanner(System.in);
    int valorUm = scan.nextInt();
    System.out.println("Informe um segundo valor");
    int valorDois = scan.nextInt();

    while(valorDois <= 0){
      System.out.println("Informe um valor maior que 0");
      valorDois = scan.nextInt();
    }

    System.out.println("O resultado da divisão é " + (valorUm / valorDois));*/

    //exercicio 2
    /*int nmr = 30;
    System.out.println("Contagem regressiva");
    while(nmr >= 0){
      System.out.println(nmr);
      nmr--;
    }
   System.out.println("Explosão");*/

    //exercicio 3
    /*System.out.println("ordem decrescente");
    for(int i = 10; i > 0; i--){
      System.out.println(i);
    }*/

    //exercicio 4
    /*System.out.println("Informe um número");
    Scanner scan = new Scanner(System.in);
    int valorUm = scan.nextInt();
    System.out.println("Informe um segundo número");
    int valorDois = scan.nextInt();

    int soma = 0;
    int quantidade = 0;
    for(int Um = valorUm; Um < valorDois; Um++){
      soma = soma + Um;
      quantidade = quantidade + 1;
    }
    System.out.println("A média será " + (soma / quantidade));
    */

    //exercicio 5
    /*do{
      System.out.println("Informe uma nota");
    Scanner scan = new Scanner(System.in);
    float valorUm = scan.nextInt();
    System.out.println("Informe uma segunda nota");
    float valorDois = scan.nextInt();

    float media = (valorUm + valorDois)/2;
     System.out.println("A média dos números informados é: " + media);

    if(media >= 9.5){
      System.out.println("Parabéns, você foi aprovado");
      alunos ++;
    }
    else{
      System.out.println("Desculpe, você foi reprovado");
    }
     
    System.out.println("Deseja calcular a média de outro aluno? 1.S 2.N");
     letra = scan.next();
    } while(letra.toUpperCase().equals("S"));
    System.out.println("Quantidade de alunos aprovados: " + alunos);*/
  }
}
