/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GraalVm;

import static lambda.Describe.describe;
import static lambda.Describe.it;
import static org.junit.Assert.assertEquals;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        describe("describe AppLication's Components", () -> {

            describe("describe Login Functionality", () -> {
                it("it should let user login with valid credentilas", () -> {
                    assertEquals(true, true);
                });

            });

        }

        );
    }
}