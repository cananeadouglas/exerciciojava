package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao13 {

    void mostrarQuestao013() {

        Integer x = null;
        Double nota = 0.0;
        Double soma = 0.0;
        Integer i = 1;

        x = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de alunos"));

        while (i <= x) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("digite a " + i + "° nota"));
            soma += nota;
            i++;
        }

        JOptionPane.showMessageDialog(null, "A média Aritmétrica da turma é: " + soma / x);

    }

}
