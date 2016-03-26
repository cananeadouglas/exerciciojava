package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao12 {

    void mostrarQuestao012() {

        Integer numSecreto = 77, chute, numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para o Nível 1: três chances\n"
                                                      + "Digite 2 para o Nível 2: cinco chances\n"
                                                      + "Digite 3 para o Nível 3: oito chances\n\n"
                                                        + " numero entre 50 e 120\n"));

        if (numero == 1) {
            for (int i = 0; i < 3; i++) {
                chute = Integer.parseInt(JOptionPane.showInputDialog("Digite seu chute:"));
                if (chute > numSecreto) {
                    JOptionPane.showMessageDialog(null, "Chute maior");
                } else if (chute < numSecreto) {
                    JOptionPane.showMessageDialog(null, "Chute menor");
                } else {
                    JOptionPane.showMessageDialog(null, "Parabens!!! \n\nVocê acertou o chute na " + (i + 1) + " tentativa");

                }

            }
        } else if (numero == 2) {
            for (int i = 0; i < 5; i++) {
                chute = Integer.parseInt(JOptionPane.showInputDialog("Digite seu chute:"));
                if (chute > numSecreto) {
                    JOptionPane.showMessageDialog(null, "Chute maior");
                } else if (chute < numSecreto) {
                    JOptionPane.showMessageDialog(null, "Chute menor");
                } else {
                    JOptionPane.showMessageDialog(null, "Parabens!!! \n\nVocê acertou o chute na " + (i + 1) + " tentativa");

                }
            }
        } else if (numero == 3) {
            for (int i = 0; i < 8; i++) {
                chute = Integer.parseInt(JOptionPane.showInputDialog("Digite seu chute:"));
                if (chute > numSecreto) {
                    JOptionPane.showMessageDialog(null, "Chute maior");
                } else if (chute < numSecreto) {
                    JOptionPane.showMessageDialog(null, "Chute menor");
                } else {
                    JOptionPane.showMessageDialog(null, "Parabens!!! \n\nVocê acertou o chute na " + (i + 1) + " tentativa");

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Essa opção não existe");
            
        }

    }

}
