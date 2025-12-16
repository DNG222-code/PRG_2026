package activitat6pt6;

public class Test {

    public static void main(String[] args) {

        // Instancias de 5 objetos
        Cantante c = new Cantante("Madonna", 60, TipoVoz.TENOR);
        Director d = new Director("Paco", 56, "Rock");
        Solista s = new Solista("Manuel", 45, TipoVoz.MEZZO, "repertorio1", "repertorio2", "repertorio3");
        Coro co = new Coro("U2", 40, TipoVoz.BAJO, 4);
        AsistenteDirector ad = new AsistenteDirector("Juan", 34, "Rock", 5);

        // Array de Personaje
        Personaje[] personajes = {c, d, s, co, ad};

        // Imprimimos información con el for-each
        for (Personaje p : personajes) {
            System.out.println(p);
            System.out.println();
            System.out.println("---------------------------------");
        }
        System.out.println("--------------------------------------------");

        // Llamamos al método abstracto actuar.
        c.actuar(); // la clase Cantante.
        d.actuar(); // la clase Director.
    }
}