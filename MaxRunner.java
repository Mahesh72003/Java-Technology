class MaxRunner {
    public static void main(String args[]) {
        Max max = (a, b) -> {
            System.out.println(Math.max(a, b));
        };
        max.find(25, 40);
    }
}


