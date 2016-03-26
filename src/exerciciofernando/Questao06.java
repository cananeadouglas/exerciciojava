package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao06 {
    
    void mostrarQuestao006(){
        
        String nome="";
        Double nota=0.0;
        Double soma=0.0;
        
        for (int i = 0; i < 4; i++) {
            
            nota = Double.parseDouble(JOptionPane.showInputDialog("digite a " + (i+1) + "° nota."));
            soma += nota;
            
        }
        if (soma/4 >= 0.0 && soma/4 <= 4.0){
            JOptionPane.showMessageDialog(null, + (soma/4) + " Média - Nota Insuficiente");
        }else if (soma/4 >= 4.1 && soma/4 <= 5.9){
            JOptionPane.showMessageDialog(null, + (soma/4) + " Média - Nota Ruim");
        }else if (soma/4 >= 6.0 && soma/4 <= 7.9){
            JOptionPane.showMessageDialog(null, + (soma/4) + " Média - Nota Regular");
        }else if (soma/4 >= 8.0 && soma/4 <= 10.0){
            JOptionPane.showMessageDialog(null, + (soma/4) + " Média - Nota Boa");
        }
        
        
        
    }
}
