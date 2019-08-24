package model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class PersonTest {

    private static final Person PERSON = new Person(1L,"Joe","Buck");

    @Test
    void groupedAssertion() {
        // given

        // when

        // then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", PERSON.getFirstName(), "First name failed"),
                () -> assertEquals("Buck", PERSON.getLastName(), "Last name failed"));
    }
}
