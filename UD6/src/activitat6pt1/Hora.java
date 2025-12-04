package activitat6pt1;

public class Hora {

    // ==============================================
    // Métodes.
    // ==============================================
    int hora;
    int minuts;

    // ==============================================
    // Constructor
    // ==============================================
    public Hora(int hora, int minuts) {
        this.hora = hora;
        this.minuts = minuts;
    }

    // ==============================================
    // Métode per incrementar l'hora i minuts.
    // ==============================================
    void inc(int hora, int minuts) {
        this.minuts++;

        if (this.minuts > 59) {
            this.minuts = 0;
            this.hora++;

            if (this.hora > 23) {
                this.hora = 0;
            }
        }
    }

    // ==============================================
    // Comprovem si han cambiat els minuts.
    // ==============================================
    boolean setMinuts(int minuts) {
        if (minuts >= 0 && minuts <= 59) {
            return true;
        } else {
            return false;
        }
    }

    // ==============================================
    // Comprovem si han cambiat les hores.
    // ==============================================
    boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            return true;
        } else {
            return false;
        }
    }

    // ==============================================
    // Métode toString. Sobreescrit.
    // ==============================================
    @Override
    public String toString() {
        return "Hora: {" + hora + ":" + " Minuts: " + minuts + "}";
    }
}