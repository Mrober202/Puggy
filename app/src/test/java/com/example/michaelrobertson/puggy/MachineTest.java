package com.example.michaelrobertson.puggy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class MachineTest {

    Machine machine;

    @Before
    public void before() {
        machine = new Machine();
    }

    @Test
    public void canAddToPuggyBank() {
        assertEquals(101, machine.coinGoesToPuggyBank());
    }
}
