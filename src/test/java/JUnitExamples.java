import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    BeforeEach");
    }

    @Test
    void firstTest() {
        System.out.println("        Here 1st Test");
    }

    @Test
    void secondTest() {
        System.out.println("        Here 2nd Test");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("    AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

}
