import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class KolokwiumSortowanie extends JFrame implements ActionListener {
	
	JTextField pole_a;
	JTextField pole_b;
	JTextField pole_c;
	
	JButton sortuj;

	public static void main(String[] args) {
		
		KolokwiumSortowanie frame = new KolokwiumSortowanie();
		frame.initUI();
		
	}

	public void initUI() {
		
		pole_a = new JTextField();
		pole_b = new JTextField();	
		pole_c = new JTextField();
		
		sortuj = new JButton("Sortuj!");
		sortuj.addActionListener(this);
		
		this.add(pole_a);
		this.add(pole_b);
		this.add(pole_c);
		this.add(sortuj);
		
		this.setLayout(new GridLayout(4, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setTitle("Sortowanie");
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(sortuj.equals(e.getSource())) {
			sortuj();
		}

}

	private void sortuj() {
		try {
			
		String pierwszaLiczba = pole_a.getText();
		int pole_liczba1 = Integer.parseInt(pierwszaLiczba); //x
		
		String drugaLiczba = pole_b.getText();
		int pole_liczba2 = Integer.parseInt(drugaLiczba);// y
		
		String trzeciaLiczba = pole_c.getText();
		int pole_liczba3 = Integer.parseInt(trzeciaLiczba);//z
		
		if(pole_liczba1 >= pole_liczba2) {
			
			if (pole_liczba2 >= pole_liczba3) {
				
				pole_a.setText(trzeciaLiczba);
				pole_b.setText(drugaLiczba);
				pole_c.setText(pierwszaLiczba);
				
			}
			if(pole_liczba3 >= pole_liczba1) {
				
				pole_a.setText(drugaLiczba);
				pole_b.setText(pierwszaLiczba);
				pole_c.setText(trzeciaLiczba);
				
			}
			if(pole_liczba1 > pole_liczba3) {
				
				pole_a.setText(drugaLiczba);
				pole_b.setText(trzeciaLiczba);
				pole_c.setText(pierwszaLiczba);
				
			}
			
			
		}
		
		 if (pole_liczba2 > pole_liczba1) {
			 
			 if (pole_liczba3 >= pole_liczba2) {
				 
				pole_a.setText(pierwszaLiczba);
				pole_b.setText(drugaLiczba);
				pole_c.setText(trzeciaLiczba);
				 
			 }
			 
			 if (pole_liczba3 >= pole_liczba1) {
				 
				pole_a.setText(drugaLiczba);
				pole_b.setText(pierwszaLiczba);
				pole_c.setText(trzeciaLiczba);
					
			 }
			 
			 if (pole_liczba1 > pole_liczba3) {
				 
				pole_a.setText(drugaLiczba);
				pole_b.setText(trzeciaLiczba);
				pole_c.setText(pierwszaLiczba);
				
			 }
		 }
		
	}
		catch (Exception e){
			
			pole_a.setText("Chcesz mi zjebaæ program? Podaj liczbê ca³kowit¹!");
			pole_b.setText("Chcesz mi zjebaæ program? Podaj liczbê ca³kowit¹!");
			pole_c.setText("Chcesz mi zjebaæ program? Podaj liczbê ca³kowit¹!");
			
		}		
		
	}
}	
