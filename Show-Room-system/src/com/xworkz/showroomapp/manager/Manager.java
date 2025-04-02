package com.xworkz.showroomapp.manager;
import com.xworkz.showroomapp.staff.Staff;
public class Manager {
    public int managerID;
    public String managerName;
    public Staff[]  staff;

    public void ManagerDisplay()
    {
        System.out.println("");
        System.out.println("the Manager ID  is: "+managerID);
        System.out.println("the Manager Name  is: "+managerName);
        System.out.println("the the list os Staff are: ");
        for(Staff staffs : staff)
        {
            staffs.staffDisplay();
        }
    }

}
