/**
 * 
 */
package antoniojosegarciasanchez.Clan.vista;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * @author Antoniojose
 *
 */
public class Miembros extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel cadena;
	private JPanel todo;
	private JPanel arriba;
	private JPanel abajo;
	private JButton atras;
	private JTable tabla;
	private DefaultTableModel modelo2;

	public Miembros() {
		inizialite();
		
	}

	private void inizialite() {
		// TODO se crea toda la pantalla con sus componentes
		this.setTitle("Prueba de Codigo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);                                 
        this.setLocationRelativeTo(null);                                                          
        this.setResizable(false);
        
        cadena = new JLabel("Listado de Miembros");
        
        todo = new JPanel();
        this.add(todo);
        
        arriba = new JPanel();
		arriba.setBorder(new EmptyBorder(new Insets(15, 0, 10, 0)));
		arriba.setLayout(new BoxLayout(arriba, BoxLayout.Y_AXIS));
		cadena.setAlignmentX(Component.CENTER_ALIGNMENT);
		arriba.add(cadena);
		todo.add(arriba);
		
		abajo = new JPanel();
		abajo.setBorder(new EmptyBorder(new Insets(50, 0, 15, 0)));
		abajo.setLayout(new BoxLayout(abajo, BoxLayout.Y_AXIS));
		
		modelo2 = new DefaultTableModel(null,new String [] {"Nombre","Antiguedad","Jefe","Subordinados","Encarcelado"});
		tabla = new JTable(modelo2);
		
		tabla.setAlignmentX(Component.CENTER_ALIGNMENT);
		abajo.add(tabla);
        
        abajo.add(Box.createRigidArea(new Dimension(0, 10)));
        
        atras = new JButton("Volver");
        atras.setActionCommand("volver");
        atras.setAlignmentX(Component.CENTER_ALIGNMENT);
        abajo.add(atras);
        
        todo.add(abajo);
		
        this.setVisible(true);
	}

	
	
	/**
	 * @return the tabla
	 */
	public JTable getTabla() {
		return tabla;
	}

	/**
	 * @param tabla the tabla to set
	 */
	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	/**
	 * @return the modelo2
	 */
	public DefaultTableModel getModelo2() {
		return modelo2;
	}

	/**
	 * @param modelo2 the modelo2 to set
	 */
	public void setModelo2(DefaultTableModel modelo2) {
		this.modelo2 = modelo2;
	}

	/**
	 * @return the atras
	 */
	public JButton getAtras() {
		return atras;
	}

}
