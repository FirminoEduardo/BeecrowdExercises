package exercise1003.SimpleSum;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int soma;

        a = sc.nextInt();
        b = sc.nextInt();
        soma = a + b;

        System.out.print("SOMA = /n" + soma);
    }
}
