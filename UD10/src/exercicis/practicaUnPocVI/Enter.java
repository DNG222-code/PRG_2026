package exercicis.practicaUnPocVI;

public class Enter {

    Integer valor;

    public Enter(Integer valor) {
        this.valor = valor;
    }

    Enter seguent() {
        return new Enter(this.valor + 1);
    }

    @Override
    public String toString() {
        return "Valor: " + this.valor;
    }
}
