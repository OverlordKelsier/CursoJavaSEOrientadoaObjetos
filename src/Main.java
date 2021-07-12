import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("EvilAFM","Diagnosta");
        /* Asi se instancia un objeto*/
        myDoctor.addAvailableAppointment(new Date(),"4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");
        System.out.println(myDoctor);
        User user = new Doctor("Ana", "A@ana.com");
        user.showDataUser();


        /*for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
        Patient patient = new Patient("Ale", "ale@a.com");
        System.out.println(patient);*/

    }

}
