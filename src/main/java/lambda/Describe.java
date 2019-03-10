package lambda;

import lambda.TestRunner;

public class Describe {

    public static void describe(String TestName, TestRunner test) {
        System.out.println("Running suite\n\t" + TestName);
        runActual(test);
    }

    public static void it(String TestName, TestRunner test) {
        System.out.println("\tRunning Test\n\t\t" + TestName);
        runActual(test);
    }

    private static void runActual(TestRunner test) {
        test.runCode();
    }
}
