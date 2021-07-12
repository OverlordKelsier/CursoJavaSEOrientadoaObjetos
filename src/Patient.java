public class Patient {
    static int id;
    private String name, email, address, phoneNumber, birthday, blood;
    private double weight, height;

    /**Metodo constructor de Patient
     * Imprime el nombre e Email
     * @param name Es el nombre del Paciente
     * @param email Es el email del Paciente
     */
    Patient(String name, String email){
        this.name = name;
        this.email = email;
        System.out.println("Nombre: " + name + " Email: " + email);
        id++;
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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Patient.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length()>8){
            System.out.println("debes poner 8 digitos máximo");
        }else if (phoneNumber.length() == 8){
        this.phoneNumber = phoneNumber;}
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
