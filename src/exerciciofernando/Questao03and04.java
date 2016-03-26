package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao03and04 {
    
    void mostrarQuestao003(){
        
        JOptionPane.showMessageDialog(null, "A) True\n"
                                        + "B) True\n"
                                        + "C) True\n"
                                        + "D) False\n"
                                        + "E) False\n"
                                        + "F) False\n"
                                        + "G) True\n"
                                        + "H) False\n");
        
    }
    
    void mostrarQuestao004(){
        
        String letra = "";
        letra = JOptionPane.showInputDialog("digite o sexo M ou F");
        
        if(letra.equalsIgnoreCase("f") || letra.equalsIgnoreCase("m") && letra.length() == 1){
            JOptionPane.showMessageDialog(null, "Opção Correta");
        }else{
            JOptionPane.showMessageDialog(null, "Opção Incorreta, tente novamente");
        }
        
        
    }
    
    
    
    
}
