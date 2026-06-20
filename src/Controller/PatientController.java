package Controller;

import DataStructs.HistoryData;
import DataStructs.HistoryStates;
import DataStructs.Patient;
import DataStructs.PatientQueue;
import DataStructs.Subject;
import Model.GlobalModel;
import View.PatientView;

import java.util.Scanner;

//The Patient Controller, can modify the patients queue and sends a notification to the history
public class PatientController extends Subject
{
    GlobalModel model;
    DoctorController docs;


    public PatientController(GlobalModel model, DoctorController docs)
    {
        this.model = model;
        this.docs = docs;
    }

    void AddPatient(Patient p)
    {
        super.notifyObservers(new HistoryData(p, HistoryStates.Added));
        model.AddPatientToQueue(p);
    }

    Patient RemovePatient()
    {
        Patient p = model.DequeuePatient();
        super.notifyObservers(new HistoryData(p, HistoryStates.Removed));
        return p;
    }

    public void RemovePatientWithMessage(PatientView pv)
    {
        if (model.isPatientQueueEmpty()) {return;}
        pv.PatientRemovedMessage(RemovePatient());
    }

    public Patient searchByName(String nom, String prenom) {
        PatientQueue pq = new PatientQueue();
        Patient r = null;
        if (model.isPatientQueueEmpty()) {
            System.out.println("Patient not found");
            return null;
        }
        while (!model.isPatientQueueEmpty()) {
            Patient p = model.DequeuePatient();
            if (p.getNom().equalsIgnoreCase(nom) && p.getPrenom().equalsIgnoreCase(prenom)){
                r = p;
                pq.add(p);
                break;
            }
            pq.add(p);
        }

        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            model.AddPatientToQueue(p);
        }
        return r;
    }

    public Patient searchByID(int id) {
        PatientQueue pq = new PatientQueue();
        Patient r = null;
        if (model.isPatientQueueEmpty()) {
            System.out.println("Patient not found");
            return null;
        }
        while (!model.isPatientQueueEmpty()) {
            Patient p = model.DequeuePatient();
            if (p.getPatientId() == id){
                r = p;
                pq.add(p);
                break;
            }
            pq.add(p);
        }

        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            model.AddPatientToQueue(p);
        }
        return r;
    }

    public String getPatientQueueAsString()
    {
        return model.PatientQueueString();
    }

    public void ShowPatients(PatientView pv){
        pv.showQueue();
    }

    public void RetrievePatientsFromView(PatientView pv, Scanner scan){
        Patient p = pv.AddPatientText(scan);
        AddPatient(p);
    }
}