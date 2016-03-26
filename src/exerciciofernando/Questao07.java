package exerciciofernando;

import javax.swing.JOptionPane;

public class Questao07 {
    
    void mostrarQuestao007(){
        
        Double peso=0.0;
        Double altura=0.0;
        String sexo="";
        
        Double imc = 0.0;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("digite seu peso"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("digite sua altura"));
        sexo = JOptionPane.showInputDialog("digite seu Sexo, se é M ou F");
                
        imc = peso / (altura * altura);
        
        if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") && sexo.length() == 1){
                if (sexo.equals("f")){
                    if(imc < 19.1){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " abaixo do peso. Sexo: " + sexo);
                    }else if (imc >= 19.1 && imc < 25.8){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " abaixo ideal. Sexo: " + sexo);
                    }else if (imc >= 25.8 && imc < 27.3){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " um pouco acima do peso. Sexo: " + sexo);
                    }else if (imc >= 27.3 && imc < 31.1){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " acima do peso ideal. Sexo: " + sexo);
                    }else if (imc >= 31.1){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " Obeso. Sexo: " + sexo);
                    }
                }else if (sexo.equals("m")){
                    if(imc < 20.7){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " abaixo do peso. Sexo: " + sexo);
                    }else if (imc >= 20.7 && imc < 26.4){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " abaixo ideal. Sexo: " + sexo);
                    }else if (imc >= 26.4 && imc < 27.8){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " um pouco acima do peso. Sexo: " + sexo);
                    }else if (imc >= 27.8 && imc < 32.3){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " acima do peso ideal. Sexo: " + sexo);
                    }else if (imc >= 32.3){
                        JOptionPane.showMessageDialog(null, "IMC valor = "+ imc + " Obeso. Sexo: " + sexo);
                    }
                }
        }else{
            
        }
    }
}
