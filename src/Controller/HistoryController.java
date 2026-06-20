package Controller;

import DataStructs.HistoryData;
import DataStructs.IObserver;
import Model.GlobalModel;
import View.HistoryView;

public class HistoryController implements IObserver {
    GlobalModel model;
    public HistoryController(GlobalModel model){
        this.model = model;
    }
    @Override
    public void answerNotif(Object args) {
        model.AddToHistory((HistoryData) args);
    }

    public String getHistoryAsString() {
        int i = 0;
        StringBuilder defs = new StringBuilder();
        while (i < model.getHistory().size()){
            defs.append(model.getHistory().toArray()[i].toString());
            defs.append("\n");
            i++;
        }
        return defs.toString();
    }

    public void ShowHistory(HistoryView hv){
        hv.showHistory();
    }
}