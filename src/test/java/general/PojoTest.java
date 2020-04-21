package general;

import org.junit.jupiter.api.Test;
import pl.pojo.tester.api.assertion.Method;
import test.*;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

public class PojoTest {

    @Test
    void testModels() {
        assertPojoMethodsFor(ChildEntity.class).testing(Method.EQUALS, Method.HASH_CODE).areWellImplemented();
        assertPojoMethodsFor(EntityUnderTest.class).testing(Method.EQUALS, Method.HASH_CODE).areWellImplemented();

    }
}
