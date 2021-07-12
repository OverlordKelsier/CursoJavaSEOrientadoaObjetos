import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor(); /** Asi se instancia un objeto*/
        myDoctor.name = "Alejandro EvilAFM";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAnn = new Doctor("Ann","Neurología");
        myDoctorAnn.showId();
        //showMenu();

        Patient patient = new Patient("Ale", "ale@a.com");

        patient.setWeight(50.0);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
    }

}
