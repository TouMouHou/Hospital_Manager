import Controller.Hospital;
import Controller.DoctorController;
import Controller.HistoryController;
import Controller.PatientController;
import Model.GlobalModel;
import View.*;

public class Main {

    static void main(String[] args)
    {
        GlobalModel model;
        DoctorController dc;
        PatientController pc;
        HistoryController hc;
        Hospital bc;
        PatientView pv;
        DoctorView dv;
        BlockView bv;
        HistoryView hv;

        model = new GlobalModel();
        dc = new DoctorController(model);
        pc = new PatientController(model, dc);
        hc = new HistoryController(model);
        bc = new Hospital(model);

        pv = new PatientView(pc, model);
        dv = new DoctorView(dc, model);
        bv = new BlockView(bc, model);
        hv = new HistoryView(hc, model);

        pc.addObserver(hc);
        dc.addObserver(bc);


        GlobalView.getInstance().WelcomeMessage();
        //Main Function Here isn't Important, don't give it too much attention
        boolean stillRunning = true;
        int[] selector = {0};


        while (stillRunning)
        {
            GlobalView.getInstance().GuideMessage(selector);
            switch (selector[0]){
                case 1:
                    pc.ShowPatients(pv);
                    break;
                case 2:
                    dc.ShowDoctors(dv);
                    break;
                case 3:
                    bc.ShowBlocks(bv);
                    break;
                case 4:
                    hc.ShowHistory(hv);
                    break;
                case 5:
                    GlobalView.getInstance().ShowPatientSearchSelectionMessage();
                    selector[0] = GlobalView.getInstance().getScan().nextInt();
                    switch (selector[0])
                    {
                        case 1:
                            pv.ifExistPatient(GlobalView.getInstance().SearchWithIDMessage());
                            break;
                        case 2:
                            pv.ifExistPatient(GlobalView.getInstance().SearchWithName(), GlobalView.getInstance().SearchWithLastName());
                            break;
                        default:
                            GlobalView.getInstance().ShowPatientSearchSelectionMessage();
                            break;
                    }
                    break;
                case 6:
                    pc.RetrievePatientsFromView(pv, GlobalView.getInstance().getScan());
                    break;
                case 7:
                    dc.RetrieveDoctorsFromView(dv, GlobalView.getInstance().getScan());
                    break;
                case 8:
                    bc.RetrieveBlocksFromView(bv, GlobalView.getInstance().getScan());
                    break;
                case 9:
                    pc.RemovePatientWithMessage(pv);
                    break;
                case 10:
                    dc.RemoveDoctorWithMessage(dv, GlobalView.getInstance().getScan());
                    break;
                default:
                    stillRunning = false;
                    break;
            }
        }
    }
}