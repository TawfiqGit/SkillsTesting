package com.tawfiq.controlleur;

import com.tawfiq.model.Partition;
import com.tawfiq.view.PartitionView;

import java.util.ArrayList;

public class PartitionController {

    private Partition model;
    private PartitionView partitionView;

    public PartitionController(Partition partitionModel) {
        this.model = partitionModel;
        this.partitionView = new PartitionView();
    }

    public void showPartition (){
       partitionView.showPartitionList(partition());
    }

    public ArrayList<ArrayList<Integer>> partition(){
        ArrayList<ArrayList<Integer>> listPartion = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0, j=0,k=0;
        while (i<model.getList().size()){
            list.clear();

            for (j=0; j< model.getTaille();j++) {
                if ((j + i) < model.getList().size())
                    list.add(model.getList().get(i + j));
            }

            listPartion.add((ArrayList<Integer>) list.clone());
            i += model.getTaille();
            k++;
        }
        return listPartion;
    }
}
