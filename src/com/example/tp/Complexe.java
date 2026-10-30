
package com.example.tp;

public class Complexe {

    private double reel;
    private double imaginaire;

    // Constructeur
    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    // Addition de deux nombres complexes
    public Complexe plus(Complexe autre) {
        double nouveauReel = this.reel + autre.reel;
        double nouvellePartieImaginaire =
                this.imaginaire + autre.imaginaire;

        return new Complexe(nouveauReel, nouvellePartieImaginaire);
    }

    // Soustraction de deux nombres complexes
    public Complexe moins(Complexe autre) {
        double nouveauReel = this.reel - autre.reel;
        double nouvellePartieImaginaire =
                this.imaginaire - autre.imaginaire;

        return new Complexe(nouveauReel, nouvellePartieImaginaire);
    }

    // Formater un nombre sans afficher .0 si c'est un entier
    private String formaterNombre(double nombre) {
        if (nombre == Math.rint(nombre)) {
            return String.format(java.util.Locale.US, "%.0f", nombre);
        }
        return String.valueOf(nombre);
    }

    // Représentation du nombre complexe sous forme de texte
    @Override
    public String toString() {
        String partieReelle = formaterNombre(reel);
        String partieImaginaire = formaterNombre(Math.abs(imaginaire));

        if (imaginaire >= 0) {
            return partieReelle + " +" + partieImaginaire + "i";
        } else {
            return partieReelle + " -" + partieImaginaire + "i";
        }
    }
}
