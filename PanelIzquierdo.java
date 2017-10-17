
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

public class PanelIzquierdo extends JPanel{
	static List<Medallista> lista;
	public PanelIzquierdo() {
		Border borde = BorderFactory.createTitledBorder( "REGISTRO DE MEDALLISTAS" );
	    setBorder( borde );
		setLayout(new GridBagLayout());
		GridBagConstraints contenido = new GridBagConstraints();
		
		JLabel etiqueta2 = new JLabel("");
		contenido .fill = GridBagConstraints.CENTER;
		contenido.weightx = 0.1;
		contenido.weighty = 0.1;
		contenido .gridx = 0;
		contenido .gridy = 0;
		add(etiqueta2, contenido);

		JLabel foto = new JLabel("");
		ImageIcon icono = new ImageIcon( "img/juegos.jpg" );
		foto.setHorizontalAlignment( JLabel.CENTER );
		foto.setIcon(icono);
		foto.setForeground(Color.BLACK);
		Border borde1 = BorderFactory.createTitledBorder( "FOTO" );
		foto.setBorder(borde1);
		foto.setSize(52,65);
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.gridx = 0;
		contenido.gridy = 0;
		add(foto, contenido);
		
		JLabel etiqueta = new JLabel("NOMBRE  ");
		etiqueta.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.weighty = 0.03;
		contenido.gridx = 0;
		contenido.gridy = 1;
		add(etiqueta, contenido);
		
		JTextField cajadetexto = new JTextField();
		cajadetexto.setText("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.gridx = 1;
		contenido.gridy = 1;
		add(cajadetexto, contenido);
		
		JLabel etiqueta1 = new JLabel("APELLIDO ");
		etiqueta1.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.weighty = 0.03;
		contenido.gridx = 0;
		contenido.gridy = 2;
		add(etiqueta1, contenido);
		
		JTextField cajadetexto1 = new JTextField();
		cajadetexto1.setText("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.gridx = 1;
		contenido.gridy = 2;
		add(cajadetexto1, contenido);

		JLabel etiqueta3 = new JLabel("TIPO DE IDENTIFICACION ");
		etiqueta3.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;	
		contenido.gridx = 0;
		contenido.gridy = 3;
		add(etiqueta3, contenido);
		

		
		JComboBox selectoremp = new JComboBox();
		selectoremp.setModel(new DefaultComboBoxModel(new String[] {"CC","TI","CE"}));
		selectoremp.setSelectedIndex(0);
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.00003;
		contenido.gridx = 1;
		contenido.gridy = 3;
		add(selectoremp, contenido);
		
		JLabel etiqueta4 = new JLabel("NUMERO: ");
		etiqueta3.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;	
		contenido.gridx = 0;
		contenido.gridy = 4;
		add(etiqueta4, contenido);
		
		JTextField numero = new JTextField();
		cajadetexto1.setText("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.gridx = 1;
		contenido.gridy = 4;
		add(numero, contenido);
		
		JLabel etiqueta5 = new JLabel("EDAD: ");
		etiqueta3.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;	
		contenido.gridx = 0;
		contenido.gridy = 5;
		add(etiqueta5, contenido);
		
		JTextField edad = new JTextField();
		cajadetexto1.setText("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.gridx = 1;
		contenido.gridy = 5;
		add(edad, contenido);
		
		JLabel etiqueta6 = new JLabel("PESO: ");
		etiqueta3.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;	
		contenido.gridx = 0;
		contenido.gridy = 6;
		add(etiqueta6, contenido);
		
		JTextField peso = new JTextField();
		cajadetexto1.setText("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.gridx = 1;
		contenido.gridy = 6;
		add(peso, contenido);
		
		JLabel etiqueta7 = new JLabel("ALTURA: ");
		etiqueta3.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;	
		contenido.gridx = 0;
		contenido.gridy = 7;
		add(etiqueta7, contenido);
		
		JTextField altura = new JTextField();
		cajadetexto1.setText("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.gridx = 1;
		contenido.gridy = 7;
		add(altura, contenido);
		
		JLabel etiqueta8 = new JLabel("CELULAR: ");
		etiqueta3.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;	
		contenido.gridx = 0;
		contenido.gridy = 8;
		add(etiqueta8, contenido);
		
		JTextField celular = new JTextField();
		cajadetexto1.setText("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.gridx = 1;
		contenido.gridy = 8;
		add(celular, contenido);
		
		JLabel etiqueta9 = new JLabel("DIRECCION: ");
		etiqueta3.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;	
		contenido.gridx = 0;
		contenido.gridy = 9;
		add(etiqueta9, contenido);
		
		JTextField direccion = new JTextField();
		cajadetexto1.setText("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.03;
		contenido.gridx = 1;
		contenido.gridy = 9;
		add(direccion, contenido);
		
		JLabel etiqueta10 = new JLabel("PUESTO: ");
		etiqueta3.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.HORIZONTAL;	
		contenido.gridx = 0;
		contenido.gridy = 10;
		add(etiqueta10	, contenido);
		
		JComboBox selector = new JComboBox();
		selector.setModel(new DefaultComboBoxModel(new String[] {"PRIMER PUESTO","SEGUNDO PUESTO","TERCER PUESTO"}));
		selectoremp.setSelectedIndex(0);
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx = 0.00003;
		contenido.gridx = 1;
		contenido.gridy = 10;
		add(selector, contenido);
		
		JButton registrar = new JButton();
		registrar.setText("REGISTRAR");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 11;
		add(registrar, contenido);

		
		JLabel mostrar = new JLabel("");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.ipady = 0;       //reset to default
		contenido.weighty = 0;   //request any extra vertical space
		contenido.anchor = GridBagConstraints.PAGE_END; //bottom of space
		contenido.insets = new Insets(10,5,10,5);  //top padding
		contenido.gridx = 1;       //aligned with button 2
		contenido.gridwidth = 2;   //2 columns wide
		contenido.gridy = 9;       //third row
		add(mostrar, contenido);
		
	
	    registrar.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){  
					try {
	                            if(cajadetexto.getText().equals("") || cajadetexto1.getText().equals("") || numero.getText().equals("")|| edad.getText().equals("") || peso.getText().equals("") || altura.getText().equals("")|| celular.getText().equals("") || direccion.getText().equals("") ) {
						JOptionPane.showMessageDialog(null, "Error por favor complete las casillas", "error", JOptionPane.ERROR_MESSAGE); 
					}
	                            else{
	               
					lista.add(new Medallista(cajadetexto.getText(),cajadetexto1.getText(),selectoremp.getToolTipText(),Integer.parseInt(edad.getText()),Float.parseFloat(peso.getText()),Integer.parseInt(altura.getText()),Integer.parseInt(celular.getText()),direccion.getText(),selector.getToolTipText())); 
	                            } 
					}catch (java.lang.NumberFormatException s) {
						JOptionPane.showMessageDialog(null, "Revisar los datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
					}
	                            
	                             
				}}
			);
		
		
		
		
	}		
	}



