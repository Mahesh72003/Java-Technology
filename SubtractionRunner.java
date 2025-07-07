class SubRunner {
    public static void main(String args[]) {
        Sub sub = (a, b) -> {
            System.out.println(a - b);
        };
        sub.operate(30, 15);
    }
}


