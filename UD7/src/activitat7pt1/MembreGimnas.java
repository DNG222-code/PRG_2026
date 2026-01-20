package activitat7pt1;

public class MembreGimnas implements Entrenador {

    @Override
    public String donarInstruccions(String instruccio) {
        return Entrenador.super.donarInstruccions(instruccio);
    }

    @Override
    public void avaluarRendiment() {
        System.out.println("Rendimiento del MembreGimnas: ");
    }

    @Override
    public void realitzarEntrenamentPersonalitzat() {
        Entrenador.super.realitzarEntrenamentPersonalitzat();
    }
}
