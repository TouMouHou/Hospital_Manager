package View;

import Controller.PatientController;
import DataStructs.Patient;
import Model.GlobalModel;

import java.util.Scanner;

// search wel historik w select ta3 patientController
public class PatientView {

    PatientController controller;
    GlobalModel model;

    public PatientView(PatientController controller, GlobalModel model)
    {
        this.controller = controller;
        this.model = model;
    }

    //this for search by full name
    public void ifExistPatient(String nom, String prenom)
    {
        Patient p = controller.searchByName(nom, prenom);
        if (p != null)
            System.out.println("Patient exists: " + p.toString());
        else
            System.out.println("Patient not found.");
    }

    //this to search by ID
    public void ifExistPatient(int patientId)
    {
        Patient p = controller.searchByID(patientId);
        if (p != null)
            System.out.println("Patient exists");
        else
            System.out.println("Patient not found");
    }

    //this to show all the patient
    public void showQueue()
    {
        if (model.isPatientQueueEmpty()) {System.out.println("There is no patient :c\n");return;}
        System.out.println("---- Patients Queue ----");
        System.out.println(controller.getPatientQueueAsString());
    }

    public Patient AddPatientText(Scanner scan){
        System.out.print("Enter patient's first name: ");
        scan.nextLine();
        String firstName = scan.nextLine();

        System.out.print("Enter patient's last name: ");
        String lastName = scan.nextLine();

        System.out.print("Enter patient's phone number: ");
        String phone = scan.nextLine();

        System.out.print("Enter patient's gender: ");
        String gender = scan.nextLine();

        System.out.print("Enter patient's blood type (e.g., A+, O-): ");
        String bloodType = scan.nextLine();

        System.out.print("Is it an emergency state ?");
        boolean emergency = scan.nextBoolean();

        return new Patient(firstName, lastName, phone, gender, bloodType, emergency);
    }

    public void PatientRemovedMessage(Patient p){
        // FIXED: Added missing space before "with"
        System.out.println(p.getNom() + " " + p.getPrenom() + " with ID: " + p.getPatientId() + " Was examined/treated.");
    }
}