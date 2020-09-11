package com.tawfiq.view;

import com.tawfiq.view.PartitionView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PartitionViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    PartitionView partitionView;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        partitionView = new PartitionView();
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void systemOutPrintlnTest() {
        System.out.print("stringTest");
        assertEquals("stringTest", outContent.toString());
    }
}