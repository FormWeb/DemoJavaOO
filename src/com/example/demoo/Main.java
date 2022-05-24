package com.example.demoo;

import com.example.demoo.model.*;

public class Main {
    public static void main(String[] args) {
        Dragon d1 = new Dragon("Eragon", 100, 200);
        d1.crier();
        Monture m1 = new Dragon("Grrr", 200, 300);
        Cheval ch1 = new Cheval("Petit poney", 10, 20, Sexe.FEMELLE);
        System.out.println(ch1.getSexe().sexe);
        System.out.println(ch1.getSexe() == Sexe.MALE);
    }
}
