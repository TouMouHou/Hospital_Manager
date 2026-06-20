package View;

import Controller.DoctorController;

import DataStructs.Doctor;
import Model.GlobalModel;

import java.util.Scanner;

public class DoctorView
{
    DoctorController controller;
    GlobalModel model;
    public DoctorView(DoctorController controller, GlobalModel model)
    {
        this.controller = controller;
        this.model = model;
    }

    public Doctor ifExistDoctor(String nom, String prenom)
    {
        Doctor doctor = controller.searchDoctor(nom, prenom);
        if (doctor != null)
            System.out.println("Doctor exists: " + doctor.toString());
        else
            System.out.println("Doctor not found");
        return doctor;
    }

    public void showDoctors()
    {
        if (model.getDoctorList().isEmpty()) {System.out.println("There is no doctor in this hospital, add one"); return;}
        System.out.println("---- The List of existing Doctors ----");
        System.out.println(controller.getDoctorsListAsString());
    }

    public Doctor AddDoctorText(Scanner scan){

        System.out.print("Enter doctor's last name: ");
        scan.nextLine();
        String nom = scan.nextLine();

        System.out.print("Enter doctor's first name: ");
        String prenom = scan.nextLine();

        System.out.print("Enter doctor's telephone number: ");
        String telephone = scan.nextLine();

        System.out.print("Enter doctor's gender: ");
        String gender = scan.nextLine();

        System.out.print("Enter doctor's specialization: ");
        String spec = scan.nextLine();


        return new Doctor(nom, prenom, telephone, gender, spec);
    }

    public void EmptyBlocksWarningMessage(){
        System.out.print("Can't add a doc because there are no blocks he can work in :c, add blocks plz\n");
    }

    public String[] DoctorRemoveMessage(Scanner scan)
    {
        System.out.print("Enter doctor's last name: ");
        scan.nextLine();
        String nom = scan.nextLine();

        System.out.print("Enter doctor's first name: ");
        String prenom = scan.nextLine();

        return new String[]{nom, prenom};
    }
}