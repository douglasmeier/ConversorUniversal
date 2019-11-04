import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Moedas extends JPanel {
	
	public Moedas() {
			
		setLayout();
		
	}
	
	private void setLayout() {
		
		// In�cio Bloco JComboBox Moeda Origem
		setLayout(null);
				String nomemoedasorigem [] = {"Reais","Dolares","Euros"};
						
				JComboBox<String> comboBoxOrigem = new JComboBox<String>(nomemoedasorigem);
				comboBoxOrigem.setBounds(80, 65, 100, 30);
				// comboBoxOrigem.setSelectedIndex(-1);
								
				// Fim Bloco JComboBox Moeda Origem  
				
				// In�cio Bloco JComboBox Moeda Destino
						
				String nomemoedasdestino [] = {"Reais","Dolares","Euros"};
						
				JComboBox<String> comboBoxDestino = new JComboBox<String>(nomemoedasdestino);
				comboBoxDestino.setBounds(300, 65, 100, 30);
				// comboBoxDestino.setSelectedIndex(-1);
									
				// Fim Bloco JComboBox Moeda Destino 
				
				JLabel lblorigem = new JLabel("De: ");
				lblorigem.setForeground(Color.BLACK);
				lblorigem.setBounds(35, 65, 80, 30);
				
				JTextField txtorigem = new JTextField(200);
				txtorigem.setBounds(80, 125, 100, 30);
				  
				JLabel lbldestino = new JLabel("Para: ");
				lbldestino.setForeground(Color.BLACK);
				lbldestino.setBounds(245, 65, 80, 30);
				
				JTextField txtdestino = new JTextField(200);
				txtdestino.setBounds(300, 125, 100, 30);
				txtdestino.setEditable(false);
							
				JButton bttnconverter = new JButton("Converter!!");
				bttnconverter.setBounds(300, 185, 100, 30);
				
				// A��o do Bot�o Converter
				
				bttnconverter.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String moedade = (String) comboBoxOrigem.getSelectedItem();
						String moedapara = (String) comboBoxDestino.getSelectedItem();
						
						double valorde = Double.parseDouble(txtorigem.getText());
						double valorpara = 0;
							
						if(moedade.equals("Reais")&& moedapara.equals("Dolares")) {
							valorpara = valorde / 3.5;
						}
						
						if(moedade.equals("Dolares")&& moedapara.equals("Reais")) {
							valorpara = valorde * 3.5;
						}
						
						if(moedade.equals("Reais")&& moedapara.equals("Euros")) {
							valorpara = valorde / 4.0;
						}
						
						if(moedade.equals("Euros")&& moedapara.equals("Reais")) {
							valorpara = valorde * 4.0;
						}
						
						if(moedade.equals("Dolares")&& moedapara.equals("Euros")) {
							valorpara = valorde / 1.5;
						}
						
						if(moedade.equals("Euros")&& moedapara.equals("Dolares")) {
							valorpara = valorde * 1.5;
						}
						
						txtdestino.setText(String.format("%.2f", valorpara));		
						
					}
				});
				
				// Fim A��o Bot�o Converter
				
				// Adiciona os itens no frame
				add(lblorigem);
				add(lbldestino);
				add(comboBoxOrigem);
				add(comboBoxDestino);
				add(txtorigem);
				add(txtdestino);
				add(bttnconverter);
		
	}
	
		
}