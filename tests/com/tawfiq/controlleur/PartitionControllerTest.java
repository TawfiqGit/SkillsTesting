package com.tawfiq.controlleur;

import com.tawfiq.controlleur.PartitionController;
import com.tawfiq.model.Partition;
import com.tawfiq.view.PartitionView;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PartitionControllerTest {

    @Test
    public void showPartition() {
        ArrayList<ArrayList<Integer>> listsPartition = new ArrayList<>();
        listsPartition.add(new ArrayList<>(Arrays.asList(1,2,3)));
        listsPartition.add(new ArrayList<>(Arrays.asList(4,5,6)));
        listsPartition.add(new ArrayList<>(Arrays.asList(7,8,9)));

        PartitionView partitionView = new PartitionView();
        partitionView.showPartitionList(listsPartition);
    }

    @Test
    public void partition() {
        Partition partition = new Partition();
        partition.setTaille(2);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        partition.setList(list);

        PartitionController partitionController = new PartitionController(partition);

        ArrayList<ArrayList<Integer>> listsPartition = new ArrayList<>();
        listsPartition.add(new ArrayList<>(Arrays.asList(1, 2)));
        listsPartition.add(new ArrayList<>(Arrays.asList(3, 4)));
        listsPartition.add(new ArrayList<>(Arrays.asList(5)));

        assertEquals(listsPartition, partitionController.partition());
    }
}