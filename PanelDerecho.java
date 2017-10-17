import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelDerecho extends JPanel {
	public PanelDerecho() {

	    setLayout( new BorderLayout( ) );
        JLabel imagen = new JLabel( );
        ImageIcon icono = new ImageIcon( "images/logo1.png" );
      
        
        imagen.setIcon( icono );
        //Define el icono que mostrará este componente.
        imagen.setHorizontalAlignment( JLabel.CENTER );
        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
        
        add( imagen, BorderLayout.CENTER );
        //ubicacion de mi imagen dentro del panel
       
        
        setBackground( Color.WHITE);
	
	}
	
}