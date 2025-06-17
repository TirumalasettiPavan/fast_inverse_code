package org.example.fastInversecode;

public class FastInverseCodeImplementation {

    public static void main(String[] args) {
        float number = 4.0f;

        // Calculate square root using built-in method
        float sqrtValue = (float) Math.sqrt(number);

        // Calculate inverse of square root
        float inverseSqrt = 1 / sqrtValue;

        System.out.println("Square root of " + number + " is: " + sqrtValue);
        System.out.println("Inverse of square root is: " + inverseSqrt);
    }
}

