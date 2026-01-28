package examen;

public class ResponsableSecion extends Empleado implements Actividad, Atencion {
    // Atributos encapsulados.
    private String seccion;
    private int nivelResponsabilidad;

    // Constructor.
    public ResponsableSecion(String seccion, int nivelResponsabilidad) {
        this.seccion = seccion;
        this.setNivelResponsabilidad(nivelResponsabilidad);
    }

    // Método toString()
    @Override
    public String toString() {
        return "Seccion: " + getSeccion() + "\n" +
                "Nivel Responsabilidad: " + getNivelResponsabilidad();
    }

    // Implementamos y heredamos los métodos.
    @Override
    public void trabajar() {

    }

    @Override
    public int trabajarRapido(int ritmo) {
        return Actividad.super.trabajarRapido(ritmo);
    }

    // Sobreescribimos el método atender.
    @Override
    public void atender(Empleado e) {
        System.out.println("Ayuda a un empleado y le suma 2 horas.");
    }

    // Sobreescribimos el método habilidadEspecial.
    @Override
    void habilidadEspecial() {
        System.out.println("Motiva el equipo y reduce 3 horas de cansancio.");
    }

    @Override
    public void descripcion() {

    }

    // Getter de Seccion.
    public String getSeccion() {
        return seccion;
    }

    // Getter y Setter.
    public int getNivelResponsabilidad() {
        return nivelResponsabilidad;
    }

    public void setNivelResponsabilidad(int nivelResponsabilidad) {
        this.nivelResponsabilidad = nivelResponsabilidad;
    }
}
