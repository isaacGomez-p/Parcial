import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelIzquierdo  extends JPanel{
	PanelIzquierdo(){
    setLayout( new BorderLayout( ) );
    JLabel imagen = new JLabel( );
    ImageIcon icono = new ImageIcon( "images/retiroplata.png" );
  
    
    imagen.setIcon( icono );
    //Define el icono que mostrará este componente.
    imagen.setHorizontalAlignment( JLabel.CENTER );
    //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
    
    add( imagen, BorderLayout.CENTER );
    //ubicacion de mi imagen dentro del panel
   
    
    setBackground( Color.WHITE);
	}
}
