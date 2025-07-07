class StringsRunner {
    public static void main(String args[]) {
        Strings concat = (a, b) -> {
            System.out.println(a + b);
        };
        concat.join("Hello, ", "World!");
    }
}
