package exercicis.activitat10pt8;

import java.time.LocalDate;

public class DadesClient {

    // Atributos.
    private String nom;
    private LocalDate dataNaixement;

    // Métodos de la clase.
    DadesClient(Client c) {

    }

    int edad() {
        return this.getDataNaixement().until(LocalDate.now()).getYears();
    }

    // Sobreescritura del toString.
    @Override
    public String toString() {
        return "Nom: " + this.getNom() + ", Anys: " + this.edad() + "\n";
    }

    // Getters i setters.
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }
}
