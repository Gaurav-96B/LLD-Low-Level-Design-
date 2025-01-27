public class Main {
    public static void main(String[] args) {
        // Example 1: (3 + 5) * 2
        Expression expression1 = new Multiply(
            new Add(new Number(3), new Number(5)),
            new Number(2)
        );

        // Example 2: 10 - (2 * 3)
        Expression expression2 = new Subtract(
            new Number(10),
            new Multiply(new Number(2), new Number(3))
        );

        // Evaluate and print the results
        System.out.println("Result of (3 + 5) * 2: " + expression1.interpret()); // Output: 16
        System.out.println("Result of 10 - (2 * 3): " + expression2.interpret()); // Output: 4
    }
}
