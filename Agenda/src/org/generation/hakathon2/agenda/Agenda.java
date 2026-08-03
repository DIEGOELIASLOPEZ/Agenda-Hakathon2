package org.generation.hakathon2.agenda;

public class Agenda {
    private List<Contact> agenda = new ArrayList<>();
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
    public void addContact(Contact c) {
        if (fullAgenda()) {
            System.out.println("La agenda está llena. No se pueden añadir mas contactos.");
        } else if (existContact(c)) {
            System.out.println("El contacto ya existe.");
        } else {
            agenda.add(c);
            System.out.println("Contacto añadido exitosamente.");
        }
    }
    //2. Verifica si existe Contacto - Santiago
    public boolean existContact(Contact c){
        if (c == null) {
            return false;
        }
        for (int i = 0; i < agenda.size(); i++) {
            Contact contactoActual = agenda.get(i);

            if (contactoActual.getNombre().equalsIgnoreCase(c.getNombre()) &&
                    contactoActual.getApellido().equalsIgnoreCase(c.getApellido())) {
                return true;
            }
        }
        return false;

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
