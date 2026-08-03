package org.generation.hakathon2.main;

import org.generation.hakathon2.agenda.Agenda;
import org.generation.hakathon2.contact.Contact;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static org.generation.hakathon2.syle.Syles.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contact contact2 = new Contact("Jesus", "Hernandez", "5564373152");
        agenda.addContact(contact2);
        Contact contact1 = new Contact("Elias", "Lopez", "5564275142");
        agenda.addContact(contact1);

        agenda.menu();



    }
}
