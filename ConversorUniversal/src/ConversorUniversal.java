
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ConversorUniversal extends JFrame {
	
	public ConversorUniversal() {
		// Titulo Janela
		setTitle("Conversor Universal");
		// Tamanho Janela
		setSize(525,400);
		// Configura local inicial
		setLocation(1366/2 - 525/2,768/2 - 400/2);
		// Não permite modificar o tamanho dsa Tela
		setResizable(false);
		// Configura a tela
		setLayout();
	}
	
	private void setLayout() {			
		
		criarMenu();
		
	}
	
	private void criarMenu() {
		
		JMenuBar menuBar = new JMenuBar();
		JTabbedPane tabPane = new JTabbedPane();
		Moedas abaMoedas = new Moedas();
		Temperaturas abaTemperaturas = new Temperaturas();
		Comprimentos abaComprimentos = new Comprimentos();
		
		// Cria o menu Arquivo
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);
		
		// Cria os itens do menu
		JMenuItem itemsair = new JMenuItem("Sair",KeyEvent.VK_I);
		itemsair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Fecha a tela
				//frame.setVisible(false);
				//frame.dispose();
				dispatchEvent(new WindowEvent(ConversorUniversal.this, WindowEvent.WINDOW_CLOSING));
			}
		});
		
				
		// Adiciona um separador
		menuArquivo.add(itemsair);
		
		JMenu menuEdit = new JMenu("Editar");
		
		JMenuItem itemlimpacampos = new JMenuItem("Limpar Campos",KeyEvent.VK_I);
		itemlimpacampos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
												

			}
		});
				
			
		JCheckBoxMenuItem checkItemMoedas = new JCheckBoxMenuItem("Exibir Moedas");
		checkItemMoedas.setSelected(true);
		checkItemMoedas.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// JOptionPane.showMessageDialog(null, "Item selecionado? "+checkItemMoedas.isSelected());
				
				if(checkItemMoedas.isSelected()) {
					tabPane.addTab("Moedas", abaMoedas);
				}else {
					tabPane.remove(abaMoedas);
				}
				
			}
		});
		
		JCheckBoxMenuItem checkItemTemperatura = new JCheckBoxMenuItem("Exibir Temperaturas");
		checkItemTemperatura.setSelected(true);
		checkItemTemperatura.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(checkItemTemperatura.isSelected()) {
					tabPane.addTab("Temperaturas", abaTemperaturas);
				}else {
					tabPane.remove(abaTemperaturas);
				}
				
			}
		});
		
		JCheckBoxMenuItem checkItemComprimentos = new JCheckBoxMenuItem("Exibir Comprimentos");
		checkItemComprimentos.setSelected(true);
		checkItemComprimentos.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// JOptionPane.showMessageDialog(null, "Item selecionado? "+checkItemComprimentos.isSelected());
				
				if(checkItemComprimentos.isSelected()) {
					tabPane.addTab("Comprimentos", abaComprimentos);
				}else {
					tabPane.remove(abaComprimentos);
				}
				
			}
		});
				
		
		menuEdit.add(itemlimpacampos);
		menuEdit.addSeparator();
		menuEdit.add(checkItemMoedas);
		menuEdit.add(checkItemTemperatura);
		menuEdit.add(checkItemComprimentos);
		
		
		JMenu menuajuda = new JMenu("Ajuda");
		JMenuItem itemdesenvolvedores = new JMenuItem("Desenvolvedores",KeyEvent.VK_S);
		JMenuItem itemgithub = new JMenuItem("Repositório do Github",KeyEvent.VK_S);
		JMenuItem itemsobre = new JMenuItem("Sobre",KeyEvent.VK_S);
		
		
		menuajuda.add(itemdesenvolvedores);
		menuajuda.add(itemgithub);
		menuajuda.add(itemsobre);
		
		// Adicina o menu na barra
		menuBar.add(menuArquivo);
		menuBar.add(menuEdit);
		menuBar.add(menuajuda);
		
		//Adiciona Menu Bar
		setJMenuBar(menuBar);
		
		
		
		tabPane.setBorder(BorderFactory.createEmptyBorder(35,35,35,35));
		
		
		tabPane.addTab("Moedas", abaMoedas);
		tabPane.addTab("Temperaturas", abaTemperaturas);
		tabPane.addTab("Comprimentos", abaComprimentos);
		
		
		// Adiciona o painel na janela
		add(tabPane);
		
		show();		
		
	}
		
		
}