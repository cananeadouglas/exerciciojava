package exerciciofernando;

import javax.swing.JOptionPane;

public class ExercicioFernando {

    public static void main(String[] args) {
        
        Questao01and02 questao0102 = new Questao01and02();
        Questao03and04 questao0304 = new Questao03and04();
        Questao05 questao05 = new Questao05();
        Questao06 questao06 = new Questao06();
        Questao07 questao07 = new Questao07();
        Questao08 questao08 = new Questao08();
        Questao09 questao09 = new Questao09();
        Questao10 questao10 = new Questao10();
        Questao11 questao11 = new Questao11();
        Questao12 questao12 = new Questao12();
        Questao13 questao13 = new Questao13();
        Questao14 questao14 = new Questao14();
        Questao15 questao15 = new Questao15();
        
        
        String opcao="";
        String tela="Digite de 1 ao 15 para ver as respostas\n"
                + "digite sair para sair\n"
                + "\n Lista de Exercicios: José Douglas";
        
        do{
            opcao = JOptionPane.showInputDialog(tela);
            
            if(opcao.equals("1")){
                questao0102.mostrarQuestao001();
            }else if (opcao.equals("2")){
                questao0102.mostrarQuestao002();
            }else if (opcao.equals("3")){
                questao0304.mostrarQuestao003();
            }else if (opcao.equals("4")){
                questao0304.mostrarQuestao004();
            }else if (opcao.equals("5")){
                questao05.mostrarQuestao005();
            }else if (opcao.equals("6")){
                questao06.mostrarQuestao006();
            }else if (opcao.equals("7")){
                questao07.mostrarQuestao007();
            }else if (opcao.equals("8")){
                questao08.mostrarQuestao008();
            }else if (opcao.equals("9")){
                questao09.mostrarQuestao009();
            }else if (opcao.equals("10")){
                questao10.mostrarQuestao010();
            }else if (opcao.equals("11")){
                questao11.mostrarQuestao011();
            }else if (opcao.equals("12")){
                questao12.mostrarQuestao012();
            }else if (opcao.equals("13")){
                questao13.mostrarQuestao013();
            }else if (opcao.equals("14")){
                questao14.mostrarQuestao014();
            }else if (opcao.equals("15")){
                questao15.mostrarQuestao015();
            }else if (opcao.equalsIgnoreCase("sair")){
                JOptionPane.showMessageDialog(null, "até mais");
            }else{
                JOptionPane.showMessageDialog(null, "questão invalida");
            }
            
            
        }while(!opcao.equalsIgnoreCase("sair"));
        
        
        
        
        
        
        
        
        
        
    }
    
}
