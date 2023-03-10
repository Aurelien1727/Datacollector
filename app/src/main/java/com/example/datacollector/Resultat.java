package com.example.datacollector;

import java.util.List;

public class Resultat{

    private List<String> adresse_destination;
    private List<String> adresse_source;
    private List<Rows> rows;
    private String status;

    public List<String> getAdresse_destination() {
        return adresse_destination;
    }

    public void setAdresse_destination(List<String> adresse_destination) {
        this.adresse_destination = adresse_destination;
    }

    public List<String> getAdresse_source() {
        return adresse_source;
    }

    public void setAdresse_source(List<String> adresse_source) {
        this.adresse_source = adresse_source;
    }

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(List<Rows> rows) {
        this.rows = rows;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class Distance{

        private String text;

        private int valeur;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getValeur() {
            return valeur;
        }

        public void setValeur(int valeur) {
            this.valeur = valeur;
        }
    }
    public class Duree{

        private String text;

        private int valeur;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getValeur() {
            return valeur;
        }

        public void setValeur(int valeur) {
            this.valeur = valeur;
        }
    }

    public class Elements{

        private Distance distance;
        private Duree duree;

        private String status;

        public com.example.datacollector.Resultat.Duree getDuree() {
            return duree;
        }
    }

        public void setDistance(com.example.datacollector.Resultat.Distance distance) {
            this.distance = distance;
        }

        public com.example.datacollector.Resultat.Duree getDuree() {
            return duree;
        }

        public void setDuree(com.example.datacollector.Resultat.Duree duree) {
            this.duree = duree;
        }

        public String getStatus() {
            return status;
        }
    }

    public class Rows{
        private List<Elements> elements;

        public List<Elements> getElements() {
            return elements;
        }

        public void setElements(List<Elements> elements) {
            this.elements = elements;
        }
    }
}