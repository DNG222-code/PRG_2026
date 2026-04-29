package exercicis.activitat10pt8;

import java.time.*;
import java.time.format.*;

public class Client {

    private String nom;
    private LocalDate dataNaixement;
    private String DNI;

    public Client(String nom, String dataNaixement, String DNI) {
        this.setNom(nom);
        this.setDataNaixement(dataNaixement);
        this.setDNI(DNI);
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
