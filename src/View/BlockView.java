package View;

import Controller.Hospital;
import DataStructs.Block;
import Model.GlobalModel;

import java.util.Scanner;

public class BlockView
{
    Hospital controller;
    GlobalModel model;
    public BlockView(Hospital controller, GlobalModel model)
    {
        this.controller = controller;
        this.model = model;
    }
    public void showBlocks(){
        if (model.getBlocks().isEmpty()){
            System.out.println("This Hospital is literally empty, plz, add some blocks");
            return;
        }
        System.out.println("---- List of Blocks in the hospital ----");
        System.out.println(controller.getBlockListAsString());
    }

    public Block AddBlockText(Scanner scan)
    {
        System.out.print("Enter the name of the block: ");
        scan.nextLine();
        String name = scan.nextLine();
        return new Block(name);
    }
}