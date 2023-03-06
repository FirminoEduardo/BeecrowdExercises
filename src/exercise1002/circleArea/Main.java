package exercise1002.circleArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double n = 3.14159;
        double raio = 0;
        double area;

        System.out.print("Informe o raio: ");
        raio = sc.nextDouble();

        area = n * (Math.pow(raio, 2));
        System.out.printf("A= %.4f", area);
    }
}