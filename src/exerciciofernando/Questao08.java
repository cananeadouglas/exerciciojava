package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao08 {

    void mostrarQuestao008() {

        Integer digite;
        Double saldo = 100.0, deposito, saque;
        
        do {
            digite = Integer.parseInt(JOptionPane.showInputDialog("1- Para saldo\n"
                    + "2- Para deposito\n"
                    + "3- Para saque\n"
                    + "4- Para sair\n"));
            
            switch (digite) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldo + " Reais"); break;

                case 2:
                    deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado"));
                    saldo = saldo + deposito;
                    JOptionPane.showMessageDialog(null, "Seu novo agora saldo é: " + saldo + " Reais"); break;

                case 3:
                    saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
                    if (saque > saldo) {
                        JOptionPane.showMessageDialog(null, "não é possível fazer essa transação saldo insuficiente");

                    } else {
                        saldo -= saque;
                        JOptionPane.showMessageDialog(null, "Seu novo agora saldo é: " + saldo + " Reais");

                    } break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Programa fechado"); break;

                default:
                    JOptionPane.showMessageDialog(null, "valor inválido digite novamente");

            }
        } while (digite != 4);

    }
}
