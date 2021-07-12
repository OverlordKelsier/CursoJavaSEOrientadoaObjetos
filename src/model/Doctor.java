package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String  speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    /** Se instacia el método constructor asignandole variables
     * se da pie a una nueva forma de enviar variables a los objetos
     */
    public Doctor(String name, String email){
        super(name,email);
    }


    public void addAvailableAppointment (String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return "\nSpeciality='" + speciality + '\'' +
                "\nAvailable=" + availableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital : CR");
    }

    /** Clase anidada*/
    public static class  AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time){
            try {
                this.date = format.parse(date);
            }catch (ParseException e){
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
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

        @Override
        public String toString() {
            return "AvailableAppointment: \nDate=" + date + "\nTime='" + time;
        }
    }




}
