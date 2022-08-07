package one.digitalinnovation.exceptions;

import javax.swing.*;
import java.io.*;

public class checkedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que você deseja imprimir!"+ e.getCause());
        }finally {
            System.out.println("Chegou no Finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while (line != null);

        bw.flush();
        br.close();
    }
}
