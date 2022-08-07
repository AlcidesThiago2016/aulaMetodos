package one.digitalinnovation.exceptions;

import javax.swing.*;

public class uncheckedException {

    public static void main(String[] args) {

        boolean continueLooping = true;

        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: "+ resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Entrada inválida, informe um numero inteiro!" + e.getMessage());
                //e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Impossivel dividir um numero por 0!");
            }
            finally {
                System.out.println("Chegou no Finally!");
            }

        }while (continueLooping);

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}
