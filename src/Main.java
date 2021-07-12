import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("EvilAFM","Diagnostic");
        /* Asi se instancia un objeto*/
        System.out.println(myDoctor);
        User user = new Doctor("Ana", "A@ana.com");
        user.showDataUser();
        User userPa = new Patient("Ana", "A@ana.com");
        userPa.showDataUser();
        User user1 = new User("Ana", "A@ana.com") {
            @Override
            public void showDataUser() {
                out.println("Doc");
                out.println("CA");
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
