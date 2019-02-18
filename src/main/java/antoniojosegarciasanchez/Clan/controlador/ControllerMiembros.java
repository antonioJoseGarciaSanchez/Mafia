/**
 * 
 */
package antoniojosegarciasanchez.Clan.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.apache.commons.lang3.StringUtils;

import antoniojosegarciasanchez.Clan.App;
import antoniojosegarciasanchez.Clan.modelo.Miembro;
import antoniojosegarciasanchez.Clan.vista.Miembros;

/**
 * @author Antoniojose
 *
 */
public class ControllerMiembros implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private Miembros m;
	private ControllerPrincipal cp;
	
	public ControllerMiembros() {
		
		m = new Miembros();
		ArrayList<Miembro> listMafiosos = App.getListMafiosos();
		
		m.getTabla().getColumnModel().getColumn(3).setPreferredWidth(140);
		
		Object O[]=null;
		for (int i = 0; i < listMafiosos.size(); i++) {
			
			m.getModelo2().addRow(O);
			Miembro getP = (Miembro) listMafiosos.get(i);
			
			m.getModelo2().setValueAt(getP.getNombre(), i, 0);
			m.getModelo2().setValueAt(getP.getAntiguedad(), i, 1);
			m.getModelo2().setValueAt(getP.getJefe(), i, 2);
			
			if(getP.getSubordinados().size()>1) {
				String nombre="",aux="";
				for(int j=0;j<getP.getSubordinados().size();j++) {
					nombre=getP.getSubordinados().get(j);
					if(StringUtils.isNotBlank(nombre)) {
						aux=aux+nombre+" ";
					}
				}
				m.getModelo2().setValueAt(aux, i, 3);
			}else if(getP.getSubordinados().size()==0){
				m.getModelo2().setValueAt("", i, 3);
			}
			
			if(!getP.isEncerrado()) {
				m.getModelo2().setValueAt("En libertad", i, 4);
			}else {
				m.getModelo2().setValueAt("En la carcel", i, 4);
			}
		 }
		
		m.setVisible(true);
		m.getAtras().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String ac = e.getActionCommand();
		
		if(ac.equals("volver")) {
			m.setVisible(false);
			cp = new ControllerPrincipal();
		}
	}

}
