import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
                  int conta;
                  int agencia;
                  double saldo = 300.5;
                  String nome;
                      
                  try (Scanner scanner = new Scanner(System.in)) {
                    System.out.println("Por favor, digite seu nome: ");
                       nome = scanner.next();
                       System.out.println("Por favor, digite sua conta: ");
                       conta = scanner.nextInt();
                       System.out.println("Por favor, digite sua agência: ");
                       agencia = scanner.nextInt();
                }

                       System.out.println("Olá, "+nome+", obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+ " Conta: "+conta+" e seu saldo: "+saldo+" já está disponível para saque." );



            }
        }