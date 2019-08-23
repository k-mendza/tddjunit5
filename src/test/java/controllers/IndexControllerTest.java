package controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void oupsHandler() {
        assertEquals("notimplemented", indexController.oupsHandler(), "Wrong View Returned");
    }
}
