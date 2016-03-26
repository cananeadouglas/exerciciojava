package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao15 {

    void mostrarQuestao015() {

        Integer x = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de vetor"));
        Integer y;

        Integer banco[] = new Integer[x];
        String valores = "Vetor: [ ";
        Boolean existe = false;
        Integer contador = 0;

        do {

            y = Integer.parseInt(JOptionPane.showInputDialog("digite numero para armazenar"));

            for (int i = 0; i < x; i++) {

                if (banco[i] == y) {
                    existe = true;
                }

            }

            if (existe == true) {
                JOptionPane.showMessageDialog(null, "existente");
                existe = false;
            } else if (existe == false) {
                banco[contador] = y;
                contador++;
            }

        } while (contador < x);

        for (int i = 0; i < banco.length; i++) {
            if (i == x - 1) {
                valores += " e " + banco[i] + " ]";
            } else if (i == x - 2) {
                valores += banco[i] + " ";
            } else {
                valores += banco[i] + ", ";
            }

        }

        JOptionPane.showMessageDialog(null, valores);

    }

}
