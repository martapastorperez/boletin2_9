
package boletin2_9;

import javax.swing.JOptionPane;


public class Boletin2_9 {

  
    public static void main(String[] args) {

    double billetes100,billetes20,billetes5,moedas1,totalEuros;
    billetes100=Double.parseDouble(JOptionPane.showInputDialog("cantidad de billetes de 100"));
    billetes20=Double.parseDouble(JOptionPane.showInputDialog("cantidad de billetes de 20"));
    billetes5=Double.parseDouble(JOptionPane.showInputDialog("cantidad de billetes de 5"));
    moedas1=Double.parseDouble(JOptionPane.showInputDialog("cantidad de moedas de 1"));
    totalEuros=billetes100*100+billetes20*20+billetes5*5+moedas1;
    JOptionPane.showMessageDialog(null, "o total de euros="+totalEuros);
    
    }
    
}
