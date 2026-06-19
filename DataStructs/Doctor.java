package DataStructs;

public class Doctor extends Person
{
    private String specialization;
    Block assignedBlock;

    public Doctor(String nom, String prenom, String telephone, String gender, String specialization)
    {
        super(nom, prenom, telephone, gender);
        this.specialization = specialization;
    }

    @Override
    public String toString()
    {
        return "Doctor{" +
                "specialization='" + specialization + '\'' +
                "block='" + assignedBlock.getNom() + '\'' +
                '}';
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }
    public void AssignBlock(Block block){
        assignedBlock = block;
    }
}