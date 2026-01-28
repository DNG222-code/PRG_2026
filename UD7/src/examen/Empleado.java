package examen;

public abstract class Empleado {
    // Atributos de clase Empleado.
    private String nombre;
    private int horasTrabajadas;

    // Métodos de la clase.
    void trabajarHoras(int cantidad) {
        // Si supera las 40h mostrará un aviso por consola.
        if (horasTrabajadas > 40) {
            System.out.println("Has superado las 40 horas.");
        }
    }

    // Sobreescribimos el método toString().
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
                "Horas trabajadas: " + getHorasTrabajadas();
    }

    // Sobreescribimos el método equals para ordenar por horasTrabajadas.
    @Override
    public boolean equals(Object o) {
        // Comparamos el objeto con el atributo horasTrabajadas.
        return getHorasTrabajadas() == ((Empleado)o).getHorasTrabajadas();
    }

    // Método abstracto
    void habilidadEspecial() {

    }

    // Getter de Nombre.
    public String getNombre() {
        return nombre;
    }

    // Getter y Setter.
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public abstract void descripcion();
}
