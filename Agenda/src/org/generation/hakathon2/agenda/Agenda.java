package org.generation.hakathon2.agenda;

import org.generation.hakathon2.contact.Contact;

import javax.swing.plaf.PanelUI;
import java.util.*;

import static org.generation.hakathon2.style.Style.*;


public class Agenda {
    private List<Contact> agenda = new ArrayList<>();
    private final int maxContact = 10;

    public Agenda() {

    }

    public List<Contact> getAgenda() {
        return agenda;
    }

    public int getMaxContact() {
        return maxContact;
    }

    //1. Añadir contacto - Margarita
    public void addContact(Contact c) {
        agenda.add(c);

    }

    //2. Verifica si existe Contacto - Santiago
    public boolean existContact(Contact c) {
        return true;
    }

    //3. Listar contactos - Elías
    public void listContact() {
//        Muestra todos los contactos de la agenda en el siguiente formato: Nombre Apellido - Teléfono.
//        Ordena los contactos alfabéticamente por nombre y apellido antes de mostrarlos.

        // Ordena la lista completa por el Nombre
        agenda.sort(Comparator.comparing(Contact::getNombre));

        for (Contact contacto : agenda) {
            System.out.println(contacto.getFullName() + " - " + contacto.getTelefono());

        }


    }

    //4. Buscar contacto - Elías
    public String searchContact(String name, String lastName) {

        for (Contact contacto : agenda) {
            if (contacto.getNombre().equals(name) && contacto.getApellido().equals(lastName)) {
                return "Telefono: " + contacto.getTelefono();
            }

        }
        return "Usuario no Encontrador";
    }

    //5. Eliminar contacto - Jesús
    public void removeContact() {

    }

    //6. Modificar telefono - Andrea
    public void updateTel(String nombre, String apellido, String nuevoTelefono) {

    }

    //7. Agenda llena - Andrea
    public void fullAgenda() {

    }

    //8. Espacio disponible - Adri
    public void freeSpace() {

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        String telefono;
        String enter;
        boolean salir = false;
        int opcion;
        while (!salir) {
            // Encabezado estilizado
            System.out.println(CYAN + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
            System.out.println(CYAN + BOLD + "║            AGENDA DE CONTACTOS               ║" + RESET);
            System.out.println(CYAN + BOLD + "╚══════════════════════════════════════════════╝" + RESET);
            System.out.println(BLUE + "1. " + RESET + "Añadir Contacto");
            System.out.println(BLUE + "2. " + RESET + "Verificar Contacto");
            System.out.println(BLUE + "3. " + RESET + "Listar Contactos");
            System.out.println(BLUE + "4. " + RESET + "Buscar Contacto");
            System.out.println(BLUE + "5. " + RESET + "Eliminar Contacto");
            System.out.println(BLUE + "6. " + RESET + "Moficcar Telefono de un Contacto");
            System.out.println(BLUE + "7. " + RESET + "Espacio Disponible");
            System.out.println(RED + "8. SALIR" + RESET);
            System.out.print(BOLD + "Selecciona una opción " + CYAN + "" + RESET);
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println(GREEN + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
                    System.out.println(GREEN + BOLD + "║              AÑADIR CONTACTO                 ║" + RESET);
                    System.out.println(GREEN + BOLD + "╚══════════════════════════════════════════════╝" + RESET);

                    System.out.print("Nombre del contacto: ");
                    nombre = scanner.nextLine();
                    System.out.print("Apellido del contacto: ");
                    apellido = scanner.nextLine();
                    System.out.print("Telefono del contacto: ");
                    telefono = scanner.nextLine();
                    System.out.print(PURPLE + "\nPresiona ENTER para continuar..." + RESET);
                    enter = scanner.nextLine();
                case 2:
                    System.out.println(GREEN + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
                    System.out.println(GREEN + BOLD + "║            VERIFICAR CONTACTO                ║" + RESET);
                    System.out.println(GREEN + BOLD + "╚══════════════════════════════════════════════╝" + RESET);
                    System.out.print(PURPLE + "\nPresiona ENTER para continuar..." + RESET);
                    enter = scanner.nextLine();
                    break;
                case 3:
                    System.out.println(GREEN + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
                    System.out.println(GREEN + BOLD + "║            LISTA DE CONTACTOS                ║" + RESET);
                    System.out.println(GREEN + BOLD + "╚══════════════════════════════════════════════╝" + RESET);
                    listContact();
                    System.out.print(PURPLE + "\nPresiona ENTER para continuar..." + RESET);
                    enter = scanner.nextLine();
                    break;
                case 4:
                    System.out.println(GREEN + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
                    System.out.println(GREEN + BOLD + "║           \uD83D\uDD0D BUSCAR CONTACTOS                ║" + RESET);
                    System.out.println(GREEN + BOLD + "╚══════════════════════════════════════════════╝" + RESET);

                    System.out.println("Buscar Contactos");
                    System.out.print("Nombre del Contacto: ");
                    nombre = scanner.nextLine();
                    System.out.print("Apellido del Contacto: ");
                    apellido = scanner.nextLine();

                    System.out.println(searchContact(nombre, apellido));
                    System.out.println(PURPLE + "\nPresiona ENTER para continuar..." + RESET);
                    scanner.nextLine();
                    System.out.print(PURPLE + "\nPresiona ENTER para continuar..." + RESET);
                    enter = scanner.nextLine();
                    break;
                case 5:
                    System.out.println(GREEN + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
                    System.out.println(GREEN + BOLD + "║            ELIMINAR CONTACTOS                ║" + RESET);
                    System.out.println(GREEN + BOLD + "╚══════════════════════════════════════════════╝" + RESET);
                    System.out.print(PURPLE + "\nPresiona ENTER para continuar..." + RESET);
                    enter = scanner.nextLine();
                    break;
                case 6:
                    System.out.println(GREEN + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
                    System.out.println(GREEN + BOLD + "║             MODIFICAR TELEFONO               ║" + RESET);
                    System.out.println(GREEN + BOLD + "╚══════════════════════════════════════════════╝" + RESET);
                    System.out.print(PURPLE + "\nPresiona ENTER para continuar..." + RESET);
                    enter = scanner.nextLine();
                    break;
                case 7:
                    System.out.println(GREEN + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
                    System.out.println(GREEN + BOLD + "║             ESPACIO DISPONIBLE                ║" + RESET);
                    System.out.println(GREEN + BOLD + "╚══════════════════════════════════════════════╝" + RESET);
                    System.out.print(PURPLE + "\nPresiona ENTER para continuar..." + RESET);
                    enter = scanner.nextLine();
                    break;
                case 8:
                    System.out.println(RED + BOLD + "╔══════════════════════════════════════════════╗" + RESET);
                    System.out.println(RED + BOLD + "║         SALIENDO DE LA AGENDA \uD83C\uDFC3\uD83D\uDEAA           ║" + RESET);
                    System.out.println(RED + BOLD + "╚══════════════════════════════════════════════╝" + RESET);
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no dispobible");
                    break;
            }

        }
    }
}
