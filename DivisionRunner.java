class DivisionRunner {
    public static void main(String args[]) {
        Division  div = (a, b) -> {
            System.out.println(a / b);
        };
        div.perform(9.0f, 3.0f);
    }
}
