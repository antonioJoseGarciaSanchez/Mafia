/**
 * 
 */
package antoniojosegarciasanchez.Clan.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import antoniojosegarciasanchez.Clan.vista.Jefes;
import antoniojosegarciasanchez.Clan.vista.Principal;

/**
 * @author Antoniojose
 *
 */
public class ControllerPrincipal implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private Principal cp;
	private ControllerMiembros m;
	private ControllerJefes j;
	
	public ControllerPrincipal() {
		cp = new Principal();
		cp.getVerMiembros().addActionListener(this);
		cp.getGestionarJefes().addActionListener(this);
		cp.getGestionarSubordinados().addActionListener(this);;
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO accion que realiza los botones
		String ac = e.getActionCommand();
		
		if(ac.equals("miembros")) {
			
			m = new ControllerMiembros();
			cp.setVisible(false);
			
		}else if(ac.equals("jefes")) {
				
			j = new ControllerJefes();
			cp.setVisible(false);
				
		}else if(ac.equals("carcel")) {
					
				
		}
	}

}
