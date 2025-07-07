class MultiplicationRunner {
    public static void main(String args[]) {
        Multiplication mul = (a, b) -> {
            System.out.println(a * b);
        };
        mul.compute(2.5f, 4.0f);
    }
}

