class SubDoubleRunner {
    public static void main(String args[]) {
        SubDouble sub = (a, b) -> {
            System.out.println(a - b);
        };
        sub.calculate(10.5, 2.3);
    }
}


