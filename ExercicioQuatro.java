import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o código da operação (1 - perímetro do círculo, 2 - área do círculo, 3 - volume da esfera): ");
        int codigo = sc.nextInt();
        
        System.out.print("Informe o valor do raio: ");
        double raio = sc.nextDouble();
        
        switch (codigo) {
            case 1:
                double perimetro = 2 * Math.PI * raio;
                System.out.printf("O perímetro do círculo é: %.2f", perimetro);
                break;
            case 2:
                double area = Math.PI * Math.pow(raio, 2);
                System.out.printf("A área do círculo é: %.2f", area);
                break;
            case 3:
                double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
                System.out.printf("O volume da esfera é: %.2f", volume);
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }
        
        sc.close();
    }

}
