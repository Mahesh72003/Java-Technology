package com.xworkz.showroomapp.showroom;
import com.xworkz.showroomapp.manager.Manager;

public class ShowRoom {
    public int showRoomID;
    public String showRoomName;
    public String showRoomLocation;
    public Manager[] Manager;

    public void showRoomDisplay()
    {
        System.out.println("the Show Room Id is "+showRoomID);
        System.out.println("the Show room Name is: "+showRoomName);
        System.out.println("the Show room Location is: "+showRoomLocation);
        System.out.println("the Show room Manager are ");
        for(Manager Managers : Manager)
        {
            Managers.ManagerDisplay();

        }
    }

}
