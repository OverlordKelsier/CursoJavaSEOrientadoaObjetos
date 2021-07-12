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
        User userpa = new Patient("Ana", "A@ana.com");
        userpa.showDataUser();
        User user1 = new User("Ana", "A@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doc");
                System.out.println("CA");
            }
        };
        user1.showDataUser();


        /*for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
        Patient patient = new Patient("Ale", "ale@a.com");
        System.out.println(patient);*/

    }

}
