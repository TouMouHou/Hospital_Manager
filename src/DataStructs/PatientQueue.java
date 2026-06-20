package DataStructs;



import java.util.PriorityQueue;

//A modified PriorityQueue<Patient> to add specific program functionality
public class PatientQueue extends PriorityQueue<Patient>
{
    @Override
    public boolean add(Patient patient)
    {
        patient.setPatientId(this.size()+1);
        return super.add(patient);
    }

    @Override
    public Patient poll()
    {
        return super.poll();
    }

    @Override
    public String toString() {
        int i = 0;
        StringBuilder defs = new StringBuilder();
        while (i < this.size()){
            defs.append(this.toArray()[i].toString());
            defs.append("\n");
            i++;
        }
        return defs.toString();
    }
}