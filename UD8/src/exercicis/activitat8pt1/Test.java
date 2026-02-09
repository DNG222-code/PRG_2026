package exercicis.activitat8pt1;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        char[] alfabeto = new char[26];
        char[] codigo = new char[26];

        cargarCodec("codec.txt", alfabeto, codigo);

        System.out.println("1. Cifrar mensaje");
        System.out.println("2. Descifrar mensaje");
        System.out.print("Elige opción: ");

        int opcion = sc.nextInt();

        if (opcion == 1) {
            cifrarMensaje(alfabeto, codigo);
        } else if (opcion == 2) {
            descifrarMensaje(alfabeto, codigo);
        } else {
            System.out.println("Opción no válida");
        }

        sc.close();
    }

    // ------------------ MÉTODOS ------------------

    private static void cargarCodec(String fichero, char[] alfabeto, char[] codigo)
            throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fichero));

        String[] linea1 = br.readLine().split(" ");
        String[] linea2 = br.readLine().split(" ");

        for (int i = 0; i < linea1.length; i++) {
            alfabeto[i] = linea1[i].charAt(0);
            codigo[i] = linea2[i].charAt(0);
        }

        br.close();
    }

    private static void cifrarMensaje(char[] alfabeto, char[] codigo)
            throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("mensaje.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("secreto.txt"));

        int c;
        while ((c = br.read()) != -1) {
            char ch = Character.toLowerCase((char) c);
            bw.write(cifrar(ch, alfabeto, codigo));
        }

        br.close();
        bw.close();

        System.out.println("Mensaje cifrado correctamente.");
    }

    private static void descifrarMensaje(char[] alfabeto, char[] codigo)
            throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("secreto.txt"));

        int c;
        while ((c = br.read()) != -1) {
            char ch = Character.toLowerCase((char) c);
            System.out.print(descifrar(ch, alfabeto, codigo));
        }

        br.close();
    }

    private static char cifrar(char c, char[] alfabeto, char[] codigo) {
        for (int i = 0; i < alfabeto.length; i++) {
            if (c == alfabeto[i]) {
                return codigo[i];
            }
        }
        return c;
    }

    private static char descifrar(char c, char[] alfabeto, char[] codigo) {
        for (int i = 0; i < codigo.length; i++) {
            if (c == codigo[i]) {
                return alfabeto[i];
            }
        }
        return c;
    }
}