import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int menor, maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        int numeroSorteado = (int) (Math.random() * (maior - menor + 1)) + menor;

        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é " + numeroSorteado + " e é par.");
        } else {
            System.out.println("O número sorteado é " + numeroSorteado + " e é ímpar.");
        }
    }
}
