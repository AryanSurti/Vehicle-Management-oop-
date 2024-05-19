public class ScientificCalculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double squareRoot(double num) {
        if (num < 0) {
            System.out.println("Error: Square root of negative number.");
            return 0;
        } else {
            return Math.sqrt(num);
        }
    }



        }
