public class Patient {
    static int id;
    String name, email, address, phoneNumber, birthday, blood;
    double weight, height;

    /**Metodo constructos de Patient
     * Imprime el nombre e Email
     * @param name Es el nombre del Paciente
     * @param email Es el email del Paciente
     */
    Patient(String name, String email){
        this.name = name;
        this.email = email;
        System.out.println("Nombre: " + name + "Email: " + email);
        id++;
    }
}
