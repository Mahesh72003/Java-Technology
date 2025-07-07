class CompareIntegersRunner {
    public static void main(String args[]) {
        CompareIntegers cmp = (a, b) -> {
            System.out.println(a > b);
        };
        cmp.isGreater(15, 10);
    }
}

