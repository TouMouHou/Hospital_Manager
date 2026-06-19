package DataStructs;

import java.util.Arrays;

public class Patient extends Person implements Comparable<Patient> {
    private String blood;
    private boolean emergency;
    private String illnessOrInjury;
    private int patientId = 0;

    public Patient(String firstName, String lastName, String phone, String gender, String bloodType, boolean emergency)
    {
        super(firstName, lastName, phone, gender);
        this.emergency = emergency;
        blood = bloodType;
    }
    public String getBlood()
    {
        return blood;
    }
    public void setBlood(String blood)
    {
        this.blood = blood;
    }
    public boolean isEmergency()
    {
        return emergency;
    }
    public void setEmergency(boolean emergency)
    {
        this.emergency = emergency;
    }
    public String getIllnessOrInjury()
    {
        return illnessOrInjury;
    }
    public void setIllnessOrInjury(String illnessOrInjury)
    {
        this.illnessOrInjury = illnessOrInjury;
    }
    public void setPatientId(int id)
    {
        patientId = id;
    }

    public int getPatientId() {return patientId;}

    @Override
    public String toString()
    {
        return "Patient{" +
                "blood=" + blood +
                ", emergency=" + emergency +
                ", illnessOrInjury='" + illnessOrInjury +
                ", patientId='" + patientId + '\'' +
                '}';
    }

    @Override
    public int compareTo(Patient comparedPat)
    {
        return Boolean.compare(comparedPat.emergency, this.emergency);
    }
}