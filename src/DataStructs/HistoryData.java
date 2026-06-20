package DataStructs;

//The Data Stored inside of the history
public class HistoryData
{
    Patient p;
    HistoryStates state;

    public HistoryData(Patient p, HistoryStates state)
    {
        this.p = p;
        this.state = state;
    }

    public String toString() {
        return state + " -> " + p.getNom() + " " + p.getPrenom();
    }

    public HistoryStates getState(){
        return state;
    }

    public Patient getPatient(){
        return p;
    }
}
