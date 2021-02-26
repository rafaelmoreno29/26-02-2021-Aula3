/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3lista1ex2n2;

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
        String ra, nome;
        float ac1, ac2, ag, af;
        Aluno aluno = null;
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Aluno\n2 - Mostrar Aluno\n3 - Sair"));
            switch(opc){
                case 1:
                    ra = JOptionPane.showInputDialog("RA");
                    nome = JOptionPane.showInputDialog("Nome");
                    ac1 = Float.parseFloat(JOptionPane.showInputDialog("Ac1"));
                    ac2 = Float.parseFloat(JOptionPane.showInputDialog("Ac2"));
                    ag = Float.parseFloat(JOptionPane.showInputDialog("Ag"));
                    af = Float.parseFloat(JOptionPane.showInputDialog("Af"));
                    aluno = new Aluno();
                    aluno.setRa(ra);
                    aluno.setNome(nome);
                    aluno.setAc1(ac1);
                    aluno.setAc2(ac2);
                    aluno.setAf(af);
                    aluno.setAg(ag);
                    break;
                case 2:
                    if(aluno != null)
                        JOptionPane.showMessageDialog(null, aluno.imprimir());
                    break;
                case 3: break;
                default: break;
            }
        }
    }
    
}
