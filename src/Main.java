public class Main {
    public static void main(String[] args) {
        Addition addition1 = (a, b) -> {
            System.out.print("Addition of two integers : ");
            System.out.println(a + b);
        };
        addition1.add(10, 20);
        addition1.add(12, 2);
    }
}