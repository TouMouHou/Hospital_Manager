package DataStructs;

public class Block
{
    private final String nom;
    private Doctor chef = null;

    public Block(String nom)
    {
        this.nom = nom;
    }

    public String getNom()
    {
        return nom;
    }

    @Override
    public String toString() {
        return "Block{" +
                "nom='" + nom + '\'' +
                ", chef=" + chef +
                '}';
    }

    public void setChef(Doctor chef) {
        this.chef = chef;
    }

    public Doctor getChef() {
        return chef;
    }
}