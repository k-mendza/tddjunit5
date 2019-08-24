package controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("controller")
class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", indexController.index(), "Wrong View Returned");
    }

    @Test
    void oopsHandler() {
        assertThrows(ValueNotFoundException.class, () -> indexController.oopsHandler());
    }
}
