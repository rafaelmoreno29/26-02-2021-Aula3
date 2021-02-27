/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1sobrecarga;

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
        double num1=0,num2=0;
        Calculadora calc = new Calculadora();
        while(opc != 5){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                                    "1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - DIvidir\n5 -Sair"));
            if(opc < 5){
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Num. 1"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Num. 2"));
            }
            switch(opc){
                case 1: 
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.soma(num1, num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.subtracao(num1, num2));
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.multiplicacao(num1, num2));
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, "Resultado: " + calc.divisao(num1, num2));
                    break;
                case 5: break;
                default: break;
            }
        }
    }
    
}
