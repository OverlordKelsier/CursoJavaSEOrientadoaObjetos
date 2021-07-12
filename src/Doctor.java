import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; //Autoincrementable y al ser estatica prevalece en todo el problema
    String name;
    private String email, speciality;

    /** Constructor Doctor
     * Para ejemplificar que al invocar la instancia se invoca este metodo constructor
     * Para cuaetiones de ejemplificación se imprime que se a iniciado el constructor
     */
    Doctor(){
        System.out.println("Construyendo el metodo Doctor");
    }

    /** Se instacia el metodo constructor asignandole variables
     * se da pie a una nueva forma de enviar variables a los objetos
     * @param name Se le asigna un nombre al Doctor
     */
    Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
        System.out.println("Doctor: " + name);
        System.out.println("Speciality: "+ speciality);
    }

    /**Comportamientos del Doctor
     * Descripción: Muestra el nombre del doctor
     * para ejemplificar el instanciar un objeto
     * */
    public void showName(){
        System.out.println(name);
    }
    /**Imprime el ID del Doctor*/
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment (Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }



    /** Clase anidada*/
    public static class  AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }




}
