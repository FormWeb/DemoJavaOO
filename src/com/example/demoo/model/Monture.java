package com.example.demoo.model;

import com.example.demoo.interfaces.INourrir;

import java.util.List;

public abstract class Monture implements INourrir {
    private String nom;
    private int vitesseMin;
    protected int vitesseMax;

    public Monture(String nom, int vitesseMin, int vitesseMax) {
        this.nom = nom;
        this.vitesseMin = vitesseMin;
        this.vitesseMax = vitesseMax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVitesseMin() {
        return vitesseMin;
    }

    public void setVitesseMin(int vitesseMin) {
        this.vitesseMin = vitesseMin;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public abstract void crier();

    @Override
    public void seNourrir() {
        System.out.println("Nomnom");
    }
}
