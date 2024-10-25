public class MathUtils {
    /**
     * 
     * @throws IllegalArgumentException 
     */
    public static int factorial(int n) throws IllegalArgumentException {
        
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        if (n > 16) {
            throw new IllegalArgumentException("Factorial calculation limited to numbers <= 16 to prevent overflow");
        }
        
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}

