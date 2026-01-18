package com.example;

import java.lang.Math;

/**
 * Classe Calculator implémentant les opérations d'une calculatrice complète.
 * Cette classe fournit des méthodes pour l'addition, la soustraction,
 * la multiplication, la division, puissance, racine carrée, fonctions trigonométriques, etc.
 */
public class Calculator {

    /**
     * Additionne deux nombres.
     * @param a premier opérande
     * @param b deuxième opérande
     * @return la somme de a et b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Soustrait deux nombres.
     * @param a premier opérande
     * @param b deuxième opérande
     * @return la différence a - b
     */
    public double sub(double a, double b) {
        return a - b;
    }

    /**
     * Multiplie deux nombres.
     * @param a premier opérande
     * @param b deuxième opérande
     * @return le produit de a et b
     */
    public double mul(double a, double b) {
        return a * b;
    }

    /**
     * Divise deux nombres.
     * @param a dividende
     * @param b diviseur
     * @return le quotient de a divisé par b
     * @throws IllegalArgumentException si b est zéro
     */
    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    /**
     * Calcule la puissance a^b.
     * @param a base
     * @param b exposant
     * @return a élevé à la puissance b
     */
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    /**
     * Calcule la racine carrée.
     * @param a nombre positif
     * @return la racine carrée de a
     * @throws IllegalArgumentException si a est négatif
     */
    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(a);
    }

    /**
     * Calcule le sinus.
     * @param a angle en radians
     * @return sin(a)
     */
    public double sin(double a) {
        return Math.sin(a);
    }

    /**
     * Calcule le cosinus.
     * @param a angle en radians
     * @return cos(a)
     */
    public double cos(double a) {
        return Math.cos(a);
    }

    /**
     * Calcule la tangente.
     * @param a angle en radians
     * @return tan(a)
     */
    public double tan(double a) {
        return Math.tan(a);
    }

    /**
     * Calcule le logarithme naturel.
     * @param a nombre positif
     * @return ln(a)
     * @throws IllegalArgumentException si a <= 0
     */
    public double log(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Cannot calculate logarithm of non-positive number");
        }
        return Math.log(a);
    }

    /**
     * Calcule le logarithme en base 10.
     * @param a nombre positif
     * @return log10(a)
     * @throws IllegalArgumentException si a <= 0
     */
    public double log10(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Cannot calculate logarithm of non-positive number");
        }
        return Math.log10(a);
    }

    /**
     * Calcule la factorielle.
     * @param n entier positif ou nul
     * @return n!
     * @throws IllegalArgumentException si n est négatif
     */
    public double factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of negative number");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}