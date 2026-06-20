package Model;

import DataStructs.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GlobalModel
{
    List<HistoryData> history = new ArrayList<>();
    PatientQueue patientQueue = new PatientQueue();
    List<Doctor> doctorList = new ArrayList<>();
    List<Block> blocks = new ArrayList<>();

    public void AddPatientToQueue(Patient p){
        patientQueue.add(p);
    }

    public Patient DequeuePatient(){
        return patientQueue.poll();
    }

    public boolean isPatientQueueEmpty(){
        return patientQueue.isEmpty();
    }

    public String PatientQueueString(){
        return patientQueue.toString();
    }

    public void AddToHistory(HistoryData data)
    {
        history.add(data);
    }

    public void AddBlock(Block block)
    {
        blocks.add(block);
    }

    public void RemoveBlock(Predicate<? super Block> filter)
    {
        blocks.removeIf(filter);
    }

    public Block SearchBlocks(){
        return blocks.get((int)(Math.random() * (blocks.size()-1)));
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public List<HistoryData> getHistory(){
        return history;
    }

    public List<Doctor> getDoctorList()
    {
        return doctorList;
    }
}