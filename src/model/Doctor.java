package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    String speciality;


    public Doctor(String name, String email, String speciality){
        super(name, email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital Cruz Roja");
        System.out.println("Departamento: General");
    }
}
