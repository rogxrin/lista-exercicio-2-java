import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = entrada.nextDouble();

        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Valor pago é insuficiente para realizar a compra!");
        } else {

            int nota50 = (int) (troco / 50);
            troco = troco % 50;

            int nota20 = (int) (troco / 20);
            troco = troco % 20;

            int nota10 = (int) (troco / 10);
            troco = troco % 10;

            int nota5 = (int) (troco / 5);
            troco = troco % 5;

            int nota2 = (int) (troco / 2);
            troco = troco % 2;

            int nota1 = (int) troco;

            System.out.println("Notas de R$ 50,00: " + nota50);
            System.out.println("Notas de R$ 20,00: " + nota20);
            System.out.println("Notas de R$ 10,00: " + nota10);
            System.out.println("Notas de R$ 5,00: " + nota5);
            System.out.println("Notas de R$ 2,00: " + nota2);
            System.out.println("Notas de R$ 1,00: " + nota1);
        }
    }
}
