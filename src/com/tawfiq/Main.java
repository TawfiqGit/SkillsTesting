package com.tawfiq;

import com.tawfiq.controlleur.PartitionController;
import com.tawfiq.model.Partition;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> createList(){
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++){
            inputList.add(i);
        }
        return inputList;
    }

    public static void main(String[] args) {
        Partition model  = new Partition();
        model.setTaille(8);
        model.setList(createList());

        PartitionController controller = new PartitionController(model);
        controller.showPartition();
    }
}
