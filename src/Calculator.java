import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Calculator extends JFrame  implements ActionListener  {

private JTextField tpfuel,tufuel,thlong,tctravel;//// pole ceny paliwa i uzycia paliwa	
private JLabel lpfuel,Jufuel,lhlong,lctravel;
private JButton oblicz,wyjscie;
private float cena,odleglosc,uzycie,wynik;
public Calculator (){
	
	
	setSize(400,400);
	setTitle("Kalkulator Paliwowy");
	setLayout(null);
	
	
	tpfuel = new JTextField("");
	tpfuel.setBounds(150, 60, 200, 20);
    add(tpfuel);
    
    
    lpfuel = new JLabel("Cena paliwa");
    lpfuel.setBounds(40, 50, 300, 100);
    add(lpfuel);

    tufuel = new JTextField("");
    tufuel.setBounds(150, 90, 200, 20);
    add(tufuel);
    
    
    Jufuel = new JLabel("U¿ycie paliwa ");
    Jufuel.setBounds(40, 20, 300, 100);
    add(Jufuel);
    
    thlong = new JTextField("");
    thlong.setBounds(150, 125, 200, 20);
    add(thlong);
    
    
    lhlong = new JLabel("Odleg³oœæ ");
 lhlong.setBounds(40, 90, 300, 100);
    add(lhlong);
    
    
    
    tctravel = new JTextField("");
    tctravel.setBounds(150, 150, 200, 20);
    add(tctravel);
    
    
    lctravel = new JLabel("Koszt Podró¿y ");
    lctravel.setBounds(40, 115, 300, 100);
    add(lctravel);
    
    
    
    oblicz = new JButton ("Oblicz");
    oblicz.setBounds(50, 200, 300, 50);
   
    
    oblicz.addActionListener(this);
    
    
    add(oblicz);
 
    wyjscie = new JButton ("Wyjscie z Kalkulatora"); 
    wyjscie.setBounds(50,250,300,50) ;
    wyjscie.addActionListener(this);
    add(wyjscie);
         

}


	public static void main(String []args){
	
	
    Calculator okienko = new Calculator();	
	okienko.setDefaultCloseOperation(EXIT_ON_CLOSE);
	okienko.setVisible(true);
	
	
}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();
		if(zrodlo==oblicz)
		{
		cena =  Float.parseFloat(tpfuel.getText());
		uzycie =  Float.parseFloat(tufuel.getText()); 
		odleglosc =  Float.parseFloat(thlong.getText()); 
     
	    wynik = odleglosc*uzycie/100*cena  ; 	
        tctravel.setText(String.valueOf(wynik));
	    
		}
	
		else if(zrodlo==wyjscie)
		{
			
			dispose();
			
		}
	
	}
	
	



}
