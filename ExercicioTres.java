import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor do coeficiente a: ");
        double a = sc.nextDouble();
        
        System.out.print("Informe o valor do coeficiente b: ");
        double b = sc.nextDouble();
        
        System.out.print("Informe o valor do coeficiente c: ");
        double c = sc.nextDouble();
        
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            double x = -c/b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.printf("A raiz da equação é: %.2f", x);
        } else {
            double delta = Math.pow(b, 2) - 4*a*c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double x1 = -b/(2*a);
                double x2 = x1;
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.printf("As raízes da equação são: %.2f e %.2f", x1, x2);
            } else {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.printf("As raízes da equação são: %.2f e %.2f", x1, x2);
            }
        }
        
        sc.close();
    }

}
