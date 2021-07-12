public class Patient extends User{

    private String birthday, blood;
    private double weight, height;

    /**Metodo constructor de Patient
     * Imprime el nombre e Email
     * @param name Es el nombre del Paciente
     * @param email Es el email del Paciente
     */
    Patient(String name, String email){
        super(name,email);
        System.out.println("Nombre: " + name + " Email: " + email);

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
}
