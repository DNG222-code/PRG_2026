package activitat6pt3;

public class HoraExacta extends Hora {

    // ==============================================
    // Atributs.
    // ==============================================
    int segons;

    // ==============================================
    // Constructor heredat de la classe Hora.
    // ==============================================
    public HoraExacta(int hora, int minuts, int segons) {
        super(hora, minuts);
        this.segons = segons;
    }

    // ==============================================
    // Métode que assigna si està comprés entre 0 i 59.
    // ==============================================
    boolean setSegons(int segons) {
        if (segons >= 0 && segons <= 59) {
            return true;
        } else {
            return false;
        }
    }

    // ==============================================
    // Métode per a incrementar els segons.
    // ==============================================
    void inc(int hora, int minuts, int segons) {
        this.segons++; // incrementem els segons.

        // Si els segons superen els 59, incrementem els minuts y els segons tornen a 0.
        if (this.segons > 59) {
            this.minuts++;
            this.segons = 0;

            // Si els minuts superen els 59, incrementem l'hora y els minuts tornen a 0.
            if (this.minuts > 59) {
                this.hora++;
                this.minuts = 0;

                // Si les hores superen els 23, les hores tornen a 0.
                if (this.hora > 23) {
                    this.hora = 0;
                }
            }
        }
    }

    // ==============================================
    // Sobreescrivim el toString per mostrar els segons.
    // ==============================================
    @Override
    public String toString() {
        return super.toString() + " : Segons: " + this.segons + "}";
    }

    // ============================================================================
    // Sobreescrivim el mètode equals() per comparar si les dues hores son iguals.
    // ============================================================================
    @Override
    public boolean equals(Object o) {
        HoraExacta hE = (HoraExacta) o;
        boolean sonIguals = hE.hora == this.hora && hE.minuts == this.minuts && hE.segons == this.segons;

        System.out.println("Son les dues hores iguals? ");
        return sonIguals;
    }
}