package com.example.demoo;

import com.example.demoo.interfaces.INourrir;
import com.example.demoo.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dragon d1 = new Dragon("Eragon", 100, 200);
//        d1.crier();
        Monture m1 = new Dragon("Grrr", 200, 300);
//        ((Dragon) m1).voler();
        Cheval ch1 = new Cheval("Petit poney", 10, 20, Sexe.FEMELLE);
//        System.out.println(ch1.getSexe().sexe);
//        System.out.println(ch1.getSexe() == Sexe.MALE);
        Cavalier c1 = new Cavalier("Jean", "Jacques");
        c1.addMonture(ch1);
        c1.addMonture(d1);

        for (Monture m : c1.getMontures().values()) {
            m.crier();
            if (m instanceof Cheval) {
                System.out.println(((Cheval) m).courir());
            }

            if (m instanceof Dragon) {
                ((Dragon) m).voler();
            }

            System.out.println("----------------------------");
        }

        // Fonctionnement date
        LocalDate date = LocalDate.of(1994, 3, 18);
        System.out.println(date.getMonth());
        LocalDate now = LocalDate.now();

        // Fonctionnement
        INourrir trucQuiSeNourrit = c1;
        INourrir autreTrucQuiSeNourrit = ch1;
        trucQuiSeNourrit.seNourrir();
        autreTrucQuiSeNourrit.seNourrir();
    }
}
