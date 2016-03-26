package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao01and02 {
    
    void mostrarQuestao001(){
        
        JOptionPane.showMessageDialog(null, "Questão 01\n"
                + "U2\n"
                + "UYT\n"
                + "ASDRUBAL\n"
                + "B52\n"
                + "Rua\n"
                + "CEP\n"
                + "");
    }
    
    void mostrarQuestao002(){
        
        int x = 100;
        int y = 30;
        
        double result = 0.0;
        
        result = (double)x/y; // 
                                // 
        /*
        Divisão de numeros Inteiros teria como resultado um numero inteiro.
        Usei o cast em uma das variaveis para ele obter o resultado em double
        como no exemplo 3.3333333 ... 
        */
        
        JOptionPane.showMessageDialog(null, "resultado " + result);
        
        
    }
    
    
    
}
