package com.xworkz.institution;

import com.xworkz.institution.institution.Institution;
import com.xworkz.institution.xworkz.Xworkz;

public class InstitutionRunner {
    public static void main(String[] args) {
        Institution institution = new Institution();
        institution.validateInstitutionDetails();

        Xworkz xworkz = new Xworkz();
        xworkz.validateInstitutionDetails();
    }
}
