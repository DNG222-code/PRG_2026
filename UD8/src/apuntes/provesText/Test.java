package apuntes.provesText;

import java.io.*;

public class Test {

    public static void main(String[] args) {

        String text = "";
        String path = "UD8/fixers/prova.txt";
//        FileReader fr = null;
        String salt = "\n";

        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

//            int c = br.read();

//            while (c != -1) {
//                System.out.println("Valor númeric de c: " + c);
//                text += (char) c;
//                c = br.read();
//            }

            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);
                text = text + linea + salt;
                linea = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("S'ha produit un error intentant llegir el fitxer: " + e.getMessage());
        } finally {
            // Sempre s'ha de tancar el fitxer.
            if (/*fr*/ br != null) {
                try {
                    /*fr*/ br.close();
                } catch (IOException e) {
                    System.out.println("S'ha produït un error intentant tancar el fitxer: " + e.getMessage());
                }
            }
        }

        System.out.println(text);
    }
}
