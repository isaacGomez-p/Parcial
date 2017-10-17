import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana() {
		this.iniciar();
		componente();
		this.pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public Ventana iniciar() {
		Dimension d = new Dimension(1000,700);
		this.setSize(d);
		this.setPreferredSize(d);
		
		this.getContentPane().setLayout(new BorderLayout());
		return this;
	}
	public void componente() {
		panelIzquierdo = new PanelIzquierdo();
		add(panelIzquierdo,BorderLayout.WEST);
		
		panelDerecho = new PanelDerecho();
		add(panelDerecho,BorderLayout.EAST);
	}
}
