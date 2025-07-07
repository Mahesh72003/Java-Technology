class StringLenCompareRunner {
    public static void main(String args[]) {
        StringCompare cmp = (a, b) -> {
            System.out.println(a.length() > b.length());
        };
        cmp.check("Hello", "Hi");
    }
}
