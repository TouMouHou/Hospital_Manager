package Controller;

import DataStructs.Block;
import DataStructs.Doctor;
import DataStructs.Subject;
import Model.GlobalModel;
import View.DoctorView;

import java.util.Scanner;

public class DoctorController extends Subject
{
    GlobalModel model;
    public DoctorController(GlobalModel model){
        this.model = model;
    }

    public void AddDoctor(Doctor doc)
    {
        model.getDoctorList().add(doc);
        super.notifyObservers(doc);
    }

    public void RemoveDoctor(Doctor doc)
    {
        model.getDoctorList().remove(doc);
    }

    public Doctor searchDoctor(String nom, String prenom)
    {
        for (Doctor d : model.getDoctorList())
        {
            if (d.getNom().equalsIgnoreCase(nom) && d.getPrenom().equalsIgnoreCase(prenom))
                return d;
        }
        return null;
    }

    public String getDoctorsListAsString()
    {
        int i = 0;
        StringBuilder defs = new StringBuilder();
        while (i < model.getDoctorList().size()){
            defs.append(model.getDoctorList().toArray()[i].toString());
            defs.append("\n");
            i++;
        }
        return defs.toString();
    }

    public void ShowDoctors(DoctorView dv){
        dv.showDoctors();
    }

    public void RetrieveDoctorsFromView(DoctorView dv, Scanner scan){
        if (model.getBlocks().isEmpty()) {dv.EmptyBlocksWarningMessage(); return;}
        Doctor d = dv.AddDoctorText(scan);
        AddDoctor(d);
    }

    public void RemoveDoctorWithMessage(DoctorView dv, Scanner scan){
        if (model.getDoctorList().isEmpty()) {return;}
        String[] name_lastname = dv.DoctorRemoveMessage(scan);
        Doctor doc = dv.ifExistDoctor(name_lastname[0], name_lastname[1]);
        if (doc == null) {return;}

        // FIXED: Only remove doctor from their assigned block, not all blocks
        // If the doctor is a chef of a block, remove them from that block only
        for (Block block : model.getBlocks()) {
            if (block.getChef() != null && block.getChef().equals(doc)) {
                block.setChef(null);
                break;  // Exit after finding and removing from the doctor's block
            }
        }

        RemoveDoctor(doc);
    }
}