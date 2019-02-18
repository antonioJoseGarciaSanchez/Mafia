/**
 * 
 */
package antoniojosegarciasanchez.Clan.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import antoniojosegarciasanchez.Clan.App;
import antoniojosegarciasanchez.Clan.modelo.Miembro;
import antoniojosegarciasanchez.Clan.vista.Jefes;

/**
 * @author Antonio José
 *
 */
public class ControllerJefes implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private Jefes jef;
	private ControllerPrincipal cp;
	
	public ControllerJefes() {
		jef = new Jefes();
		ArrayList<Miembro> listMafiosos = App.getListMafiosos();
		
		jef.getTabla().getColumnModel().getColumn(2).setPreferredWidth(100);
		
		Object O[]=null;
		for (int i = 0; i < listMafiosos.size(); i++) {
			
			jef.getModelo2().addRow(O);
			Miembro getP = (Miembro) listMafiosos.get(i);
			
			if(StringUtils.isBlank(getP.getJefe())){
				jef.getModelo2().setValueAt(getP.getNombre(), i, 0);
				jef.getModelo2().setValueAt(getP.getAntiguedad(), i, 1);
				
				if(getP.getSubordinados().size()>1) {
					String nombre="",aux="";
					for(int j=0;j<getP.getSubordinados().size();j++) {
						nombre=getP.getSubordinados().get(j);
						if(StringUtils.isNotBlank(nombre)) {
							aux=aux+","+nombre+" ";
						}
					}
					jef.getModelo2().setValueAt(aux, i, 2);
				}else if(getP.getSubordinados().size()<1){
					jef.getModelo2().setValueAt("", i, 2);
				}
				
				if(!getP.isEncerrado()) {
					jef.getModelo2().setValueAt("En libertad", i, 3);
				}else {
					jef.getModelo2().setValueAt("En la carcel", i, 3);
				}
			}
		}
		
		jef.setVisible(true);
		jef.getAtras().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String ac = e.getActionCommand();
		
		if(ac.equals("volver")) {
			jef.setVisible(false);
			cp = new ControllerPrincipal();
		}
	}
}
