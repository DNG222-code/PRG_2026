package exercicis.activitat10pt8;

import java.time.*;
import java.time.format.*;

public class Client {

    private String nom;
    private LocalDate dataNaixement;

    public Client(String nom, String dataNaixement) {
        this.setNom(nom);
        this.setDataNaixement(dataNaixement);
    }

    public boolean esPosterior(String data) {
        return this.getDataNaixement().isAfter(formatejaData(data, "dd/MM/yy"));
    }

    private LocalDate formatejaData(String data, String pattern) {
        return LocalDate.parse(data, DateTimeFormatter.ofPattern(pattern));
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(String dataNaixement) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNaixement = formatejaData(dataNaixement, "dd/MM/yyyy");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
