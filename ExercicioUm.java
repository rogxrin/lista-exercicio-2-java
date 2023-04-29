import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = entrada.nextDouble();

        double maior = Math.max(Math.max(num1, num2), num3);
        System.out.println("O maior número é: " + maior);

        double menor = Math.min(Math.min(num1, num2), num3);
        System.out.println("O menor número é: " + menor);

        double media = (num1 + num2 + num3) / 3;
        System.out.println("A média aritmética é: " + media);
    }
}
