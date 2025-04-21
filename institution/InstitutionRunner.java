package com.xworkz.institution;

import com.xworkz.institution.institution.Institution;
import com.xworkz.institution.xworkz.Xworkz;

public class InstitutionRunner {
    public static void main(String[] args) {


        Institution institution = new Institution();
        institution.validateInstitutionDetails();
        institution.conductClass();
        institution.admitStudent();
        institution.provideCertificate();
        institution.takeAttendance();


        Institution parentRef = new Xworkz();
        parentRef.validateInstitutionDetails();
        parentRef.conductClass();
        parentRef.admitStudent();
        parentRef.provideCertificate();
        parentRef.takeAttendance();


        Xworkz xworkz = new Xworkz();
        xworkz.validateInstitutionDetails();
        xworkz.conductClass();
        xworkz.admitStudent();
        xworkz.provideCertificate();
        xworkz.takeAttendance();
        xworkz.conductHackathon();
    }
}
