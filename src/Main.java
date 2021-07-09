import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor(); /** Asi se instancia un objeto*/
        myDoctor.name = "Alejandro EvilAFM";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        showMenu();
    }

}
