/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ContaBanco;
import java.util.Scanner;

/**
 *
 * @author gabriel.rfarias
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta !");
        int numCont = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();
        System.out.println("Por favor, digite o nome do Cliente !");
        String nome = sc.next();
        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = sc.nextDouble();
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numCont + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
