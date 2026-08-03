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

    }
    //7. Agenda llena - Andrea
    public void fullAgenda(){

    }
    //8. Espacio disponible - Adri
    public void freeSpace(){
        int availablesSpaces = maxContact - agenda.size();

        if (availablesSpaces == 0) {
            System.out.println("La agenda está llena. No hay espacios disponibles.");
            { else {
                System.out.println("Espacios disponibles: " + availablesSpaces);
            }
        }
    }
}
