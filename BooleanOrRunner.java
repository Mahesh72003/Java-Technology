class BooleanOrRunner {
    public static void main(String args[]) {
        BooleanOr orOp = (a, b) -> {
            System.out.println(a || b);
        };
        orOp.compute(true, false);
    }
}


