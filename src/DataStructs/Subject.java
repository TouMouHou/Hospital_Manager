package DataStructs;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer)
    {
        observers.add(observer);
    }
    public void removeObserver(IObserver observer)
    {
        observers.remove(observer);
    }

    public void notifyObservers(Object data)
    {
        for (IObserver obs: observers)
        {
            obs.answerNotif(data);
        }
    }
}