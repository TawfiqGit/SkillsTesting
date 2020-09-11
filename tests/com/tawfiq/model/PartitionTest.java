package com.tawfiq.model;

import com.tawfiq.model.Partition;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PartitionTest {

    Partition partition;

    @Before
    public void setUp() throws Exception {
        partition = new Partition();
        partition.setTaille(5);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            list.add(i);
        }
        partition.setList(list);
    }

    @Test
    public void setTaille() {
        assertEquals(5,partition.getTaille());
    }

    @Test
    public void setList() {
        ArrayList<Integer> listResult = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            listResult.add(i);
        }
        assertEquals(listResult,partition.getList());
    }
}