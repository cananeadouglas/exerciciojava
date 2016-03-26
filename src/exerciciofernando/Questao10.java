package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao10 {

    void mostrarQuestao010() {

        Integer fat = 1;
        
        Integer k;

        String dados = "";

        for (k = 1; k <= 10; k++) {

            fat = fat * k;
            if (k == 9){
                dados += k + " = " + fat + ",\ne\n";
            }else if (k == 10){
                dados += k + " = " + fat + "\n";
            }else{
                dados += k + " = " + fat + ",\n";
            }

        }
        JOptionPane.showMessageDialog(null, dados);

    }

}
