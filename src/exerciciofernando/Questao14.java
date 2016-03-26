package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao14 {

    void mostrarQuestao014() {

        String dados = "";
        Integer i;

        for (int n = 1; n <= 100; n++) {

            Boolean ehPrimo = true;

            i = 2;
            
            while ((ehPrimo == true) && (i <= (n / 2))) {
            
                if ((n % i) == 0) {
                    ehPrimo = false;
                } else {
                    i++;
                }

            }

            if (ehPrimo == true) {
                dados += "" + n + "\n";
            }

        }
        JOptionPane.showMessageDialog(null, dados);
    }

}
