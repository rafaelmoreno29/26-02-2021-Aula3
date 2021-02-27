/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2sobrecarga;

import javax.swing.JOptionPane;

/**
 *
 * @author Moreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        String nome, curso;
        int ra, anoIngresso;
        double ac1,ac2,ag,af;
        Aluno aluno = null;
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Aluno\n2 - Calcular Média\n3 -Sair"));
            switch(opc){
                case 1: 
                    ra = Integer.parseInt(JOptionPane.showInputDialog("RA"));
                    nome = JOptionPane.showInputDialog("Nome");
                    curso = JOptionPane.showInputDialog("Curso");
                    anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Ano Ingresso"));
                    aluno = new Aluno(ra, nome, curso, anoIngresso);
                    break;
                case 2: 
                    if(aluno.getAnoIngresso() <= 2019){
                        ac1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
                        ac2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
                        JOptionPane.showMessageDialog(null, "Média: " + aluno.calcularMedia(ac1, ac2));
                    }
                    else{
                        ac1 = Double.parseDouble(JOptionPane.showInputDialog("Ac1"));
                        ac2 = Double.parseDouble(JOptionPane.showInputDialog("Ac2"));
                        ag = Double.parseDouble(JOptionPane.showInputDialog("Ag"));
                        af = Double.parseDouble(JOptionPane.showInputDialog("Af"));
                        JOptionPane.showMessageDialog(null, "Média: " + aluno.calcularMedia(ac1, ac2, ag, af));
                    }
                    break;
                case 3: break;
                default: break;
            }
        }
        
    }
    
}
