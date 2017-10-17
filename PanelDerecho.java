
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class PanelDerecho extends JPanel{
	static JTextArea primero, segundo, tercero;
	static JButton mostrar;
	public PanelDerecho() {
		setLayout(new GridBagLayout());
		Border b= BorderFactory.createTitledBorder("Datos");
		setBorder(b);
		GridBagConstraints c = new GridBagConstraints();
		
		primero = new JTextArea();
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
		
		JTextArea tercero = new JTextArea();
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
		
		mostrar = new JButton();
		mostrar.setText("Mostrar Medallistas");
		c.fill = GridBagConstraints.CENTER;
		c.weightx=0.3;
		c.weighty=0.3;
		c.gridx=2;
		c.gridy=3;
		add(mostrar,c);
		
	    mostrar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				try {
					//primerPuesto(lista);
				}
					catch(java.lang.NullPointerException a ) {
						
					}
				}
			});
		
	}

	
public static void primerPuesto(java.util.List<Medallista> lista) {
	for(int i=0; i<lista.size();i++) {
		if(lista.get(i).getPuesto()==1) {
			primero.setText("Nombre"+lista.get(i)+"\nApellido:"+lista.get(i).getApellido()+"\nTipo:"+lista.get(i).getTipo()+"\nNumero:"+lista.get(i).getNumero()+"Puesto:"+lista.get(i).getPuesto());
		}
		
	}
	
}

}

