package com.example.demoo.model;

public class Dragon extends Monture{
    public Dragon(String nom, int vitesseMin, int vitesseMax) {
        super(nom, vitesseMin, vitesseMax);
    }

    @Override
    public void crier() {
        System.out.println(super.getNom());
        System.out.println(this.getNom());
        System.out.println("Graoou");
    }

    public void voler() {
        System.out.println("Le dragon s'envole");
        this.crier();
    }
}
