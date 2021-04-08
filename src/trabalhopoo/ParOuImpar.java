/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParOuImpar;

import javax.swing.JOptionPane;




/**
 *
 * @author felip
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
      
       
      
       
      if(num % 2 ==0){
      JOptionPane.showMessageDialog(null, "O número " + num + " é par.");
      } else {
          JOptionPane.showMessageDialog(null, " O número " + num + " é ímpar.");
      }
      }
}
      
           
     
