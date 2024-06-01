import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String nome = "Fábio ";
    String conta = "conta corrente";
    double saldo = 1000;
    int laco = 0;
    while (laco != 4) {
      System.out.println("""
          *************************
          ***  Menu de opção    ***
          *  1 - consultar saldo  *
          *  2 - Depositar valor  *
          *  3 - Retirar valor    *
          *  4 - Sair             * """);
      Scanner menu = new Scanner(System.in);

      System.out.println("*************************\n*** Digite sua opção: ***");
      int opcao = menu.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("*************************\n*** Consultar Saldo   ***\n* Saldo atual: " + saldo + "   *");
          laco = opcao;
          break;
        case 2:
          Scanner depositar = new Scanner(System.in);
          System.out.println("*************************\n*** Valor do deposito ***");
          int pix = depositar.nextInt();
          int novoSaldo = (int) (saldo + pix);
          saldo = (int) (novoSaldo);
          System.out.println("*************************\n* Deposito com sucesso  *\n*     Titular " + nome
              + "    *\n*  Saldo atual: " + novoSaldo + "    *");
          laco = opcao;
          break;
        case 3:
          Scanner retirar = new Scanner(System.in);
          System.out.println("*************************\n*** Valor do retirada ***");
          int sacar = retirar.nextInt();
          if (sacar <= saldo) {
            saldo = (int) (saldo - sacar);
            System.out.println("*************************\n*  Saque com sucesso    *\n*     Titular " + nome
                + "    *\n*  Saldo atual: " + saldo + "   *");
            laco = opcao;
            break;
          } else {
            System.out.println("*************************\n*  Saldo insuficiente   *\n*     Titular " + nome
                + "    *\n*  Saldo atual: " + saldo + "   *");
            laco = opcao;
            break;
          }
        case 4:
          System.out.println(
              "*************************\n* Obrigado por utilizar *\n*     nosso sistema     *\n************************* ");
          laco = 4;
          break;
        default:
          System.out.println("Opção inválida! ");
      }
    }
  }
}
