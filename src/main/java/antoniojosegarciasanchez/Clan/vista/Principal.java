/**
 * 
 */
package antoniojosegarciasanchez.Clan.vista;

import java.awt.Component;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author Antoniojose
 *
 */
public class Principal extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton verMiembros;
	private JButton gestionarJefes;
	private JButton gestionarSubordinados;
	private JPanel todo;
	private JLabel cadena;
	
	public Principal() {
		super();
		inizialite();
	}

	private void inizialite() {
		// TODO se crea toda la pantalla con sus componentes
		this.setTitle("Prueba de Codigo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);                                 
        this.setLocationRelativeTo(null);                                                          
        this.setResizable(false);                               
        
        todo = new JPanel();
        todo.setLayout(new BoxLayout(todo, BoxLayout.Y_AXIS));
        
        verMiembros = new JButton("Ver Miembros");
        gestionarJefes = new JButton("Ver Jefes");
        gestionarSubordinados = new JButton("Ver Carcel");
        cadena = new JLabel("Menu");
        
        verMiembros.setActionCommand("miembros");
        gestionarJefes.setActionCommand("jefes");
        gestionarSubordinados.setActionCommand("carcel");
        
        verMiembros.setAlignmentX(Component.CENTER_ALIGNMENT);
        gestionarJefes.setAlignmentX(Component.CENTER_ALIGNMENT);
        gestionarSubordinados.setAlignmentX(Component.CENTER_ALIGNMENT);
        cadena.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        cadena.setBorder(new EmptyBorder(new Insets(20, 0, 30, 0)));
        
        todo.add(cadena);
        todo.add(verMiembros);
        todo.add(gestionarJefes);
        todo.add(gestionarSubordinados);
        
        this.add(todo);
        
        
        this.setVisible(true);
	}

	/**
	 * @return the cadena
	 */
	public JLabel getCadena() {
		return cadena;
	}

	/**
	 * @return the verMiembros
	 */
	public JButton getVerMiembros() {
		return verMiembros;
	}

	/**
	 * @return the gestionarJefes
	 */
	public JButton getGestionarJefes() {
		return gestionarJefes;
	}

	/**
	 * @return the gestionarSubordinados
	 */
	public JButton getGestionarSubordinados() {
		return gestionarSubordinados;
	}

}
