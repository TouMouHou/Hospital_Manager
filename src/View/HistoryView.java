package View;

import Controller.HistoryController;
import Model.GlobalModel;

public class HistoryView
{
    HistoryController controller;
    GlobalModel model;
    public HistoryView(HistoryController controller, GlobalModel model){
        this.controller = controller;
        this.model = model;
    }
    public void showHistory()
    {
        if (model.getHistory().isEmpty()) {System.out.println("No changes we're applied to the patients queue.\n"); return;}
        System.out.println("---- The History of changes in the Patient Queue ----\n");
        System.out.println(controller.getHistoryAsString());
    }


}