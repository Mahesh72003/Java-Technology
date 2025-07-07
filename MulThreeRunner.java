class MulThreeRunner {
    public static void main(String args[]) {
        MultiplyThree mul = (a, b, c) -> {
            System.out.println(a * b * c);
        };
        mul.compute(2, 3, 4);
    }
}