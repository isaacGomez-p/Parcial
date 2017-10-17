import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	//static PanelIzquierdo panelIzquierdo;
	static PanelDerecho panelDerecho;
	public Ventana() {
		this.iniciar();
		componente();
		this.pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public Ventana iniciar(){
		
		Dimension dims = new Dimension(750, 700);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );//ORGANIZAR ARRIBA
		//this.setResizable(false); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
//<<<<<<< Updated upstream
		
}
//=======
	
	
//>>>>>>> Stashed changes
	public void componente() {
		PanelIzquierdo panelIzquierdo = new PanelIzquierdo();
		add(panelIzquierdo,BorderLayout.NORTH);
		
		PanelDerecho panelDerecho = new PanelDerecho();
		add(panelDerecho,BorderLayout.EAST);
	}
}
