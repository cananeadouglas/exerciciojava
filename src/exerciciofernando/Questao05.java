package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao05 {
    
    void mostrarQuestao005(){
        
        Double semes01 = Double.parseDouble(JOptionPane.showInputDialog("digite 1° semestre"));
        Double semes02 = Double.parseDouble(JOptionPane.showInputDialog("digite 2° semestre"));
        Double semes03 = Double.parseDouble(JOptionPane.showInputDialog("digite 3° semestre"));
        Double semes04 = Double.parseDouble(JOptionPane.showInputDialog("digite 4° semestre"));
        
        Double menor=0.0;
        Double maior=0.0;
        
               
        if(semes01<semes02 && semes01<semes03 && semes01<semes04){
            menor = semes01;
        }else if (semes02<semes03 && semes02<semes04){
            menor = semes02;
        }else if (semes03<semes04){
            menor = semes03;
        }else{
            menor = semes04;
        }
        
        if(semes01>semes02 && semes01>semes03 && semes01>semes04){
            maior = semes01;
        }else if (semes02>semes03 && semes02>semes04){
            maior = semes02;
        }else if (semes03>semes04){
            maior = semes03;
        }else{
            maior = semes04;
        }
        
        JOptionPane.showMessageDialog(null, "O menor Lucro é: " + menor + "\ne a média por Mês é: " + (menor / 3) + ".");
        JOptionPane.showMessageDialog(null, "O maior é Lucro é: " + maior + "\ne a média por Mês é: " + (maior / 3) + ".");
        
    }
    
}
