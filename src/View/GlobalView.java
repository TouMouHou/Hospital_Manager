package View;

import java.util.Scanner;

public class GlobalView
{
    private static volatile GlobalView uniqueInstance;

    private GlobalView(){}

    public static GlobalView getInstance()
    {
        if (uniqueInstance == null)
        {
            synchronized (GlobalView.class)
            {
                if (uniqueInstance == null)
                {
                    uniqueInstance = new GlobalView();
                }
            }
        }
        return uniqueInstance;
    }

    Scanner scan = new Scanner(System.in);

    public void ShowPatientSearchSelectionMessage()
    {
        System.out.println("1 - by ID.\n2 - by Name");
    }

    public void WelcomeMessage(){
        System.out.println("-------------------------------------------------------\n\n\n\n\n                    HOSPITAL MANAGER                        \n\n\n\n\n-------------------------------------------------------\n");
    }

    public void GuideMessage(int[] selector){

        System.out.println("1 - Show The Current Patient Queue.\n2 - Show The Current Doctors List.\n3 - Show The Hospitals Blocks List.\n4 - Show The History of changes to the patient List.\n5 - Check if a patient exists\n6 - Add a patient.\n7 - Add a Doctor.\n8 - Add a Block.\n9 - Remove the patient with the highest priority.\n10 - Remove a specific Doctor\n\n\n any other selected number will exit the program");
        selector[0] = scan.nextInt();
    }

    public Scanner getScan() {
        return scan;
    }

    public int SearchWithIDMessage(){
        System.out.println("Enter the patients ID: \n");
        return GlobalView.getInstance().getScan().nextInt();
    }

    public String SearchWithName(){
        System.out.println("Enter the patients Name: \n");
        GlobalView.getInstance().getScan().nextLine();
        return GlobalView.getInstance().getScan().nextLine();
    }

    public String SearchWithLastName(){
        System.out.println("Enter the patients Last: \n");
        return GlobalView.getInstance().getScan().nextLine();
    }
}
