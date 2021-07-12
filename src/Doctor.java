import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String  speciality;

    /** Se instacia el metodo constructor asignandole variables
     * se da pie a una nueva forma de enviar variables a los objetos
     */
    Doctor(String name, String email){
        super(name,email);
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
