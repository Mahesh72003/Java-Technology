package com.xworkz.showroomapp;

import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.ShowRoom;
import com.xworkz.showroomapp.staff.Staff;

public class ShowRoomRunner {

public static void main(String Bata[])
{
    Staff[] Staffs =new Staff[2];
    Staff staff1=new Staff();
    staff1.staffID=101;
    staff1.staffName="Rajesh Kumar";
    staff1.staffAddress="123 MG Road, Bengaluru";
    Staffs[0]=staff1;

    Staff staff2=new Staff();
    staff2.staffID=102;
    staff2.staffName="Amit Verma";
    staff2.staffAddress="678 lig jp Nager Bengaluru";
    Staffs[1]=staff2;

    Manager[] managers =new Manager[2];
    Manager manager1 =new Manager();
    manager1.managerID=02;
    manager1.managerName="Ram";
    manager1.staff=Staffs;
    managers[0]=manager1;


    ShowRoom ref=new ShowRoom();
    ref.showRoomID=93;
    ref.showRoomName="Bata";
    ref.showRoomLocation="Banglore";
    ref.Manager= managers;
    ref.showRoomDisplay();

}


}
