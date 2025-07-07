class CubeRunner {
    public static void main(String args[]) {
        Cube cube = (n) -> {
            System.out.println(n * n * n);
        };
        cube.find(3);
    }
}