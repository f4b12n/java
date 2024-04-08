package co.com.ps.b3;

import java.util.Scanner;

public class Trabajoenclase2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Por favor ingrese dos numeros");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 * num2);

    }

}
