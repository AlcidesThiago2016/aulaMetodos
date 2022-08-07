package one.digitalinnovation.metodos;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
        System.out.println();
        //Calculadora

        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        System.out.println();
        //Calculadora
        System.out.println("Emprestimo");
        Emprestimo.calcular(1300,3);
        Emprestimo.calcular(1580,2);
        Emprestimo.calcular(1560,6);
    }
}
