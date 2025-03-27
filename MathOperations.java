class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public long divide(long a, long b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public float divide(float a, float b) {
        if (b == 0.0f) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}
