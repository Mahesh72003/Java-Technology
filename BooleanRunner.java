class BooleanRunner {
    public static void main(String args[]) {
        Boolean andOp = (a, b) -> {
            System.out.println(a && b);
        };
        andOp.compute(true, false);
    }
}

