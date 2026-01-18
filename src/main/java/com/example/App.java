package com.example;

import java.util.Scanner;

/**
 * Classe principale pour une calculatrice interactive.
 */
public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculatrice Interactive ===");
        System.out.println("Opérations disponibles:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Puissance (^)");
        System.out.println("6. Racine carrée (sqrt)");
        System.out.println("7. Sinus (sin)");
        System.out.println("8. Cosinus (cos)");
        System.out.println("9. Tangente (tan)");
        System.out.println("10. Logarithme naturel (ln)");
        System.out.println("11. Logarithme base 10 (log10)");
        System.out.println("12. Factorielle (!)");
        System.out.println("0. Quitter");
        System.out.println();

        while (true) {
            System.out.print("Choisissez une opération (0-12): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Au revoir!");
                break;
            }

            try {
                switch (choice) {
                    case 1: // Addition
                        System.out.print("Entrez le premier nombre: ");
                        double a1 = scanner.nextDouble();
                        System.out.print("Entrez le deuxième nombre: ");
                        double b1 = scanner.nextDouble();
                        System.out.println("Résultat: " + a1 + " + " + b1 + " = " + calc.add(a1, b1));
                        break;

                    case 2: // Soustraction
                        System.out.print("Entrez le premier nombre: ");
                        double a2 = scanner.nextDouble();
                        System.out.print("Entrez le deuxième nombre: ");
                        double b2 = scanner.nextDouble();
                        System.out.println("Résultat: " + a2 + " - " + b2 + " = " + calc.sub(a2, b2));
                        break;

                    case 3: // Multiplication
                        System.out.print("Entrez le premier nombre: ");
                        double a3 = scanner.nextDouble();
                        System.out.print("Entrez le deuxième nombre: ");
                        double b3 = scanner.nextDouble();
                        System.out.println("Résultat: " + a3 + " * " + b3 + " = " + calc.mul(a3, b3));
                        break;

                    case 4: // Division
                        System.out.print("Entrez le dividende: ");
                        double a4 = scanner.nextDouble();
                        System.out.print("Entrez le diviseur: ");
                        double b4 = scanner.nextDouble();
                        System.out.println("Résultat: " + a4 + " / " + b4 + " = " + calc.div(a4, b4));
                        break;

                    case 5: // Puissance
                        System.out.print("Entrez la base: ");
                        double a5 = scanner.nextDouble();
                        System.out.print("Entrez l'exposant: ");
                        double b5 = scanner.nextDouble();
                        System.out.println("Résultat: " + a5 + " ^ " + b5 + " = " + calc.power(a5, b5));
                        break;

                    case 6: // Racine carrée
                        System.out.print("Entrez le nombre: ");
                        double a6 = scanner.nextDouble();
                        System.out.println("Résultat: sqrt(" + a6 + ") = " + calc.sqrt(a6));
                        break;

                    case 7: // Sinus
                        System.out.print("Entrez l'angle en radians: ");
                        double a7 = scanner.nextDouble();
                        System.out.println("Résultat: sin(" + a7 + ") = " + calc.sin(a7));
                        break;

                    case 8: // Cosinus
                        System.out.print("Entrez l'angle en radians: ");
                        double a8 = scanner.nextDouble();
                        System.out.println("Résultat: cos(" + a8 + ") = " + calc.cos(a8));
                        break;

                    case 9: // Tangente
                        System.out.print("Entrez l'angle en radians: ");
                        double a9 = scanner.nextDouble();
                        System.out.println("Résultat: tan(" + a9 + ") = " + calc.tan(a9));
                        break;

                    case 10: // Logarithme naturel
                        System.out.print("Entrez le nombre: ");
                        double a10 = scanner.nextDouble();
                        System.out.println("Résultat: ln(" + a10 + ") = " + calc.log(a10));
                        break;

                    case 11: // Logarithme base 10
                        System.out.print("Entrez le nombre: ");
                        double a11 = scanner.nextDouble();
                        System.out.println("Résultat: log10(" + a11 + ") = " + calc.log10(a11));
                        break;

                    case 12: // Factorielle
                        System.out.print("Entrez un entier positif: ");
                        int a12 = scanner.nextInt();
                        System.out.println("Résultat: " + a12 + "! = " + calc.factorial(a12));
                        break;

                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erreur inattendue: " + e.getMessage());
                scanner.nextLine(); // Clear the buffer
            }

            System.out.println();
        }

        scanner.close();
    }
}