import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("EvilAFM","Diagnosta"); /** Asi se instancia un objeto*/
        myDoctor.addAvailableAppointment(new Date(),"4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Doctor myDoctorAnn = new Doctor("Ann","Neurología");
        //showMenu();

        Patient patient = new Patient("Ale", "ale@a.com");

        patient.setWeight(50.0);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());




    }

}
