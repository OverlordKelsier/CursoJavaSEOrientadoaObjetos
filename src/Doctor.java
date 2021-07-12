public class Doctor {
    static int id = 0; //Autoincrementable y al ser estatica prevalece en todo el problema
    String name;
    String email;
    String speciality;

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
}
