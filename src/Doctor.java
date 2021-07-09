public class Doctor {
    int id;
    String name;
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
    Doctor(String name){
        System.out.println("Doctor: " + name);
    }

    /**Comportamientos del Doctor
     * Descripción: Muestra el nombre del doctor
     * para ejemplificar el instanciar un objeto
     * */
    public void showName(){
        System.out.println(name);
    }
}
