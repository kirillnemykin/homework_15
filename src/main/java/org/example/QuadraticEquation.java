package org.example;

public class QuadraticEquation {

    private int coefficientAtPower2;
    private int coefficientAtPower1;
    private int coefficientAtPower0;
    private double[] roots;

    public QuadraticEquation(int coefficientAtPower2, int coefficientAtPower1, int coefficientAtPower0) {
        this.coefficientAtPower2 = coefficientAtPower2;
        this.coefficientAtPower1 = coefficientAtPower1;
        this.coefficientAtPower0 = coefficientAtPower0;

        if (coefficientAtPower2 == 0) {
            throw new IllegalArgumentException("Quadratic equation doesn't exist");
        }
    }

    public double[] solution() {
        double discriminant;

        discriminant = Math.pow(coefficientAtPower1, 2) - 4*coefficientAtPower2*coefficientAtPower0;

        if (discriminant > 0) {
            roots = new double[2];
            roots[0] = (-coefficientAtPower1 + Math.sqrt(discriminant))/(2*coefficientAtPower2);
            roots[1] = (-coefficientAtPower1 - Math.sqrt(discriminant))/(2*coefficientAtPower2);
        }

        else if (discriminant == 0) {
            roots = new double[1];
            roots[0] = (-coefficientAtPower1) / (2*coefficientAtPower2);
        }

        else roots = null;

        return roots;
    }
}



