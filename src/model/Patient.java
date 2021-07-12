package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{

    private String birthday, blood;
    private double weight, height;
    private ArrayList<AppointmentDoctor> appointmentDoctors =new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this,doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    /**Metodo constructor de model.Patient
     * Imprime el nombre e Email
     * @param name Es el nombre del Paciente
     * @param email Es el email del Paciente
     */
     public Patient(String name, String email){
        super(name,email);

    }

    /** Todos los Getters y Setters autogenerados por el IDE
     * alt+insert para abrir los constructores
     */

    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + "Kg.";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "birthday='" + birthday + '\'' +
                ", blood='" + blood + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight();
    }

    @Override
    public void showDataUser() {
        System.out.println("Este es un paciente");
    }
}
