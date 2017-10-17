
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelDerecho extends JPanel{
	
	public PanelDerecho() {
		setLayout(new GridBagLayout());
		Border b= BorderFactory.createTitledBorder("Datos");
		setBorder(b);
		GridBagConstraints c = new GridBagConstraints();
		
		JList primero = new JList();
		c.fill = GridBagConstraints.CENTER;
		c.weightx= 0.3;
		c.weighty=0.3;
		c.gridx=1;
		c.gridy=0;
		add(primero,c);
		
		JLabel imagen = new JLabel();
		ImageIcon icono = new ImageIcon("img/oro.jpg");
		imagen.setIcon(icono);
		imagen.setHorizontalAlignment(JLabel.CENTER);
		c.fill = GridBagConstraints.CENTER;
		c.weightx=0.3;
		c.weighty=0.3;
		c.gridx=2;
		c.gridy=0;
		add(imagen,c);
		
		JList segundo = new JList();
		c.fill = GridBagConstraints.CENTER;
		c.weightx= 0.3;
		c.weighty=0.3;
		c.gridx=2;
		c.gridy=1;
		add(segundo,c);
		
		JLabel imagen2 = new JLabel();
		ImageIcon icono2 = new ImageIcon("img/plata.jpg");
		imagen2.setIcon(icono2);
		imagen2.setHorizontalAlignment(JLabel.CENTER);
		c.fill = GridBagConstraints.CENTER;
		c.weightx=0.3;
		c.weighty=0.3;
		c.gridx=1;
		c.gridy=1;
		add(imagen2,c);
		
		JList tercero = new JList();
		c.fill = GridBagConstraints.CENTER;
		c.weightx= 0.3;
		c.weighty=0.3;
		c.gridx=1;
		c.gridy=2;
		add(tercero,c);
		
		JLabel imagen3 = new JLabel();
		ImageIcon icono3 = new ImageIcon("img/bronce.jpg");
		imagen3.setIcon(icono3);
		imagen3.setHorizontalAlignment(JLabel.CENTER);
		c.fill = GridBagConstraints.CENTER;
		c.weightx=0.3;
		c.weighty=0.3;
		c.gridx=2;
		c.gridy=2;
		add(imagen3,c);
		
		JButton mostrar = new JButton();
		mostrar.setText("Mostrar Medallistas");
		c.fill = GridBagConstraints.CENTER;
		c.weightx=0.3;
		c.weighty=0.3;
		c.gridx=2;
		c.gridy=3;
		add(mostrar,c);
		
	}
public void primerPuesto() {
	
}

}

