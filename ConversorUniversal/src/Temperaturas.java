import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temperaturas extends JPanel {
	
	public Temperaturas() {
		
		setLayout();
		
	}
	
	private void setLayout() {
		
		// Início Bloco JComboBox Temperatura Origem
		setLayout(null);
				String nometemperaturasorigem [] = {"Celsius","Fahrenheit","Kelvin"};
						
				JComboBox<String> comboBoxOrigem = new JComboBox<String>(nometemperaturasorigem);
				comboBoxOrigem.setBounds(80, 65, 100, 30);
				// comboBoxOrigem.setSelectedIndex(-1);
								
				// Fim Bloco JComboBox temperatura Origem  
				
				// Início Bloco JComboBox temperatura Destino
						
				String nometemperaturasdestino [] = {"Celsius","Fahrenheit","Kelvin"};
						
				JComboBox<String> comboBoxDestino = new JComboBox<String>(nometemperaturasdestino);
				comboBoxDestino.setBounds(300, 65, 100, 30);
				// comboBoxDestino.setSelectedIndex(-1);
									
				// Fim Bloco JComboBox temperatura Destino 
				
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
				
				// Ação do Botão Converter
				
				bttnconverter.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String moedade = (String) comboBoxOrigem.getSelectedItem();
						String moedapara = (String) comboBoxDestino.getSelectedItem();
						
						double valorde = Double.parseDouble(txtorigem.getText());
						double valorpara = 0;
							
						if(moedade.equals("Celsius")&& moedapara.equals("Fahrenheit")) {
							valorpara = (valorde * 9.0/5.0) + 32.0;
						}
						
						if(moedade.equals("Fahrenheit")&& moedapara.equals("Celsius")) {
							valorpara = (valorde - 32.0) * 5.0/9.0;
						}
						
						if(moedade.equals("Celsius")&& moedapara.equals("Kelvin")) {
							valorpara = valorde + 273.15;
						}
						
						if(moedade.equals("Kelvin")&& moedapara.equals("Celsius")) {
							valorpara = valorde - 273.15;
						}
						
						if(moedade.equals("Fahrenheit")&& moedapara.equals("Kelvin")) {
							valorpara = (valorde - 32.0) * 5.0/9.0 + 273.15;
						}
						
						if(moedade.equals("Kelvin")&& moedapara.equals("Fahrenheit")) {
							valorpara = (valorde - 273.15) * 9.0/5.0 + 32;
						}
						
						txtdestino.setText(String.format("%.2f", valorpara));		
						
					}
				});
				
				// Fim Ação Botão Converter
				
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