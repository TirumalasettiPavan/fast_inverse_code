package org.example.fastInversecode;

public class FastInverseCodeImplementation {

    public static float invSqrt(float x) {
        float xhalf = 0.5f * x;

        int i = Float.floatToIntBits(x);         // convert float to raw int bits
        i = 0x5f3759df - (i >> 1);               // magic number and bit hack
        x = Float.intBitsToFloat(i);            // convert bits back to float

        // One iteration of Newton-Raphson
        x = x * (1.5f - xhalf * x * x);

        return x;
    }

    public static void main(String[] args) {
        float num = 4.0f;
        float result = invSqrt(num);
        float actual = 1.0f / (float) Math.sqrt(num);

        System.out.println("Fast inverse sqrt of " + num + " ≈ " + result);
        System.out.println("Actual inverse sqrt        ≈ " + actual);
    }
}

