package com.example.michaelrobertson.puggy;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class SpinTest {

    Spin spin;

    @Test
    public void spin1Result() throws Exception {
        assertNotNull(spin.spin1Result());
    }
}
