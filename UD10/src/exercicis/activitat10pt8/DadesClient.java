package exercicis.activitat10pt8;

import java.time.LocalDate;

public class DadesClient {

    // Atributos.
    private String nom;
    private LocalDate dataNaixement;
    private String DNI;

    // Métodos de la clase.
    DadesClient(Client c) {
        this.setNom(c.getNom());
        this.setDataNaixement(c.getDataNaixement());
        this.setDNI(getDNI());
    }

    int edad() {
        return this.getDataNaixement().until(LocalDate.now()).getYears();
    }

    // Sobreescritura del toString.
    @Override
    public String toString() {
        return "Nom: " + this.getNom() + ", Anys: " + this.edad() + ", DNI: " + this.getDNI() + "\n";
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
