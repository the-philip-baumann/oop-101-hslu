package ch.hslu.oop.S03.A1_3;

import org.junit.jupiter.api.Test;

class SchleifenTest {

    @Test
    void addition() {
        final Schleifen testee = new Schleifen();

        testee.iterativeAddition();
    }


    @Test
    void iteration() {
        final Schleifen testee = new Schleifen();

        testee.iteration();
    }


    @Test
    void test_printBox() {
        final Schleifen testee = new Schleifen();

        testee.printBox(10, 4);
    }
}