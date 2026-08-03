package org.generation.hakathon2.main;

import org.generation.hakathon2.agenda.Agenda;
import org.generation.hakathon2.contact.Contact;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static org.generation.hakathon2.style.Style.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.menu();
    }
}
