package org.generation.hakathon2.agenda;

public class Agenda {
    private List<Contact> agenda = new Arraylist<>();
    private final int maxContact = 10;

    public Agenda(){

    }

    public List<Contact> getAgenda() {
        return agenda;
    }
    public int getMaxContact(){
        return maxContact;
    }
    //1. Añadir contacto - Margarita
    public void addContact(Contact c){

    }
    //2. Verifica si existe Contacto - Santiago
    public boolean existContact(Contact c){

    }
    //3. Listar contactos - Elías
    public void listContact(){

    }
    //4. Buscar contacto - Elías
    public void searchContact(){
    }
    //5. Eliminar contacto - Jesús
    public void removeContact(){

    }
    //6. Modificar telefono - Andrea
    public void updateTel(String nombre, String apellido, String nuevoTelefono){
        for (int i = 0; i < agenda.size(); i++) {
            Contact contacto = agenda.get(i);
            if (contacto.getNombre().equals(nombre) && contacto.getApellido().equals(apellido)) {
                contacto.setTelefono(nuevoTelefono);
                System.out.println("El numero de telefono se ha modificado correctamente.");
                return;
            }
        }
        System.out.println("No se ha encontrado el contacto ingresado.");
    }

    //7. Agenda llena - Andrea
    public void fullAgenda(){
        if (agenda.size()=> maxContact){
            System.out.println("No hay espacio disponible para nuevos contactos");
        }else {
            System.out.println(""); //duda
        }
    }
    //8. Espacio disponible - Adri
    public void freeSpace(){

    }
}
