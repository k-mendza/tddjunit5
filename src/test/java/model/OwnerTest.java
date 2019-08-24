package model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class OwnerTest {

    @Test
    void dependentAssertions() {
        //given
        Owner owner = new Owner(1L, "Joe", "Buck");
        //when
        owner.setCity("City");
        owner.setTelephone("111222333");
        //then
        assertAll("Owner Class test",
                () -> assertAll("Person properties",
                        () -> assertEquals("Joe", owner.getFirstName(), "Wrong firstName value"),
                        () -> assertEquals("Buck", owner.getLastName(), "Wrong lastName value")),
                () -> assertAll("Owner properties",
                        () -> assertEquals("City", owner.getCity(), "Wrong city value"),
                        () -> assertEquals("111222333", owner.getTelephone(), "Wrong telephone value")
                ));
    }

}
