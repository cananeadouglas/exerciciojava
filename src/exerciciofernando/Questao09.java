package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao09 {

    void mostrarQuestao009() {

        Integer meses;

        meses = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mês"));

        switch (meses) {
            case 1:
                JOptionPane.showMessageDialog(null, "JANEIRO"); break;
            case 2:
                JOptionPane.showMessageDialog(null, "FEVEREIRO"); break;
            case 3:
                JOptionPane.showMessageDialog(null, "MARÇO"); break;
            case 4:
                JOptionPane.showMessageDialog(null, "ABRIL"); break;
            case 5:
                JOptionPane.showMessageDialog(null, "MAIO"); break;
            case 6:
                JOptionPane.showMessageDialog(null, "JUNHO"); break;
            case 7:
                JOptionPane.showMessageDialog(null, "JULHO"); break;
            case 8:
                JOptionPane.showMessageDialog(null, "AGOSTO"); break;
            case 9:
                JOptionPane.showMessageDialog(null, "SETEMBRO"); break;
            case 10:
                JOptionPane.showMessageDialog(null, "OUTUBRO"); break;
            case 11:
                JOptionPane.showMessageDialog(null, "NOVEMBRO"); break;
            case 12:
                JOptionPane.showMessageDialog(null, "DEZEMBRO"); break;
            default:
                JOptionPane.showMessageDialog(null, "NUMERO INEXISTENTE");

        }
    }

}
