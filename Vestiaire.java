package com.example.datacollector.Vestiaire;

public class Vestiaire {
    private int id;
    private String description;
    private String etat;
    private String nom;


    public Vestiaire (int id,  String description, String etat,  String nom) {
        this.id = id;
        this.description = description;
        this.etat = etat;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}