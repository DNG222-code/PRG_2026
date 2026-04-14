package corregits.practicaUnPoc1;

public class Test {

    public static void main(String[] args) {
        Salutacio<String> salutacioNoms = s -> "Hola " + s + "!";

//        System.out.println(salutacioNoms.saludar("Pepe"));
//        System.out.println(salutacioNoms.saludar("Juan"));
//        System.out.println(salutacioNoms.saludar("Ana"));
//        System.out.println(salutacioNoms.saludar("Maria"));

        Salutacio<Client> salutacioClients = c -> "Hola " + c.getNom() + "!";
        System.out.println(salutacioClients.saludar(new Client("Pere", 33)));
        System.out.println(salutacioClients.saludar(new Client("Juan", 22)));
    }
}
