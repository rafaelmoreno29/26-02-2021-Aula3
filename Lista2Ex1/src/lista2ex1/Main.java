/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex1;


import java.util.ArrayList;
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
        int numero, idade;
        String nome;
        char sexo;
        double valorAutomovel;
        Apolice apolice = null;
        ArrayList<Apolice> listApolice = new ArrayList<Apolice>();
        String msg = "";
        while (opc != 4) {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("1 - Criar Apólice\n2 - Mostrar Todas\n"
                            + "3 - Mostrar por número\n4 - Sair"));

            switch (opc) {
                case 1:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
                    nome = JOptionPane.showInputDialog("Nome");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
                    sexo = JOptionPane.showInputDialog("Sexo").toUpperCase().charAt(0);
                    valorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Valor Auto."));
                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    listApolice.add(apolice);
                    break;
                case 2:
                    msg ="";
                    for (Apolice ap : listApolice) {
                        msg += ap.imprimir() + "\n---------\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
                    for(Apolice ap : listApolice){
                        if(ap.getNumero() == numero){
                            JOptionPane.showMessageDialog(null, ap.imprimir());
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }

}
