package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao11 {
   
    void mostrarQuestao011(){
        
        String valor = "";
        Integer k = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de linhas"));
        Integer aux=1;
        
        Integer sondar=1;
        
        Integer i;
        
        for (int j = 0; j < k;) {
            for (i = 1; i <= aux; ) {
                valor += i*sondar + " ";
                i++;
                
            }
        
            sondar++;
            valor += " \n";
            
            if(j == k-1){
                valor += "\nFim das Atividades\n";
            }
            
            j++;
            aux++;
            
            
            
        }
        
        JOptionPane.showMessageDialog(null, valor);
        
        
    }
}
