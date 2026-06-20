package Controller;

import DataStructs.Block;
import DataStructs.Doctor;
import DataStructs.IObserver;
import Model.GlobalModel;
import View.BlockView;

import java.util.Scanner;

//this acts as a controller for the Block class
public class Hospital implements IObserver
{
    GlobalModel model;
    public Hospital(GlobalModel model){
        this.model = model;
    }

    @Override
    public void answerNotif(Object args)
    {
        Doctor doc = (Doctor)args;

        // FIXED: Improved block assignment logic
        // Instead of random selection, find the first available block without a chef
        Block assignedBlock = null;

        for (Block b : model.getBlocks()) {
            if (b.getChef() == null) {
                assignedBlock = b;
                break;
            }
        }

        // If all blocks have a chef, assign to the first block (fallback)
        if (assignedBlock == null && !model.getBlocks().isEmpty()) {
            assignedBlock = model.getBlocks().getFirst();
        }

        // Only assign if we found a block
        if (assignedBlock != null) {
            assignedBlock.setChef(doc);
            doc.AssignBlock(assignedBlock);
        }
    }

    public String getBlockListAsString() {
        int i = 0;
        StringBuilder defs = new StringBuilder();
        while (i < model.getBlocks().size()){
            defs.append(model.getBlocks().toArray()[i].toString());
            defs.append("\n");
            i++;
        }
        return defs.toString();
    }

    public void ShowBlocks(BlockView bv){
        bv.showBlocks();
    }

    public void RetrieveBlocksFromView(BlockView pv, Scanner scan){
        Block b = pv.AddBlockText(scan);
        model.AddBlock(b);
    }
}