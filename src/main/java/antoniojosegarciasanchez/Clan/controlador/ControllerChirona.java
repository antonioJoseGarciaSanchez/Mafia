package antoniojosegarciasanchez.Clan.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

import org.apache.commons.lang3.StringUtils;

import antoniojosegarciasanchez.Clan.App;
import antoniojosegarciasanchez.Clan.modelo.Miembro;
import antoniojosegarciasanchez.Clan.vista.Chirona;

/**
 * @author Antoniojose
 *
 */
public class ControllerChirona implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private Chirona c;
	private ControllerPrincipal cp;
	
	public ControllerChirona() {
		c = new Chirona();
		c.getEncarcelar().addActionListener(this);
		c.getAtras().addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String ac = e.getActionCommand();
		
		if(ac.equals("volver")) {
			
			c.setVisible(false);
			cp = new ControllerPrincipal();
			
		}else if(ac.equals("añadir")) {
			
			MyDialogPopup jlog = new MyDialogPopup();
			jlog.setModal(true);
			jlog.setVisible(true);
			String nombre = jlog.sName;
			
			ArrayList<Miembro> listMafiosos = App.getListMafiosos();
			for (int i = 0; i < listMafiosos.size(); i++) {
				Miembro getP = (Miembro) listMafiosos.get(i);
				if(StringUtils.equalsIgnoreCase(nombre, getP.getNombre())) {
					getP.setEncerrado(true);
					App.sevilla1.setMiembrosEncerrados(getP);
				}
				if(getP.getSubordinados().size()>0) {
					String nom="",aux="";
					for(int j=0;j<getP.getSubordinados().size();j++) {
						nom=getP.getSubordinados().get(j);
						if(StringUtils.isNotBlank(nombre)) {
							aux=aux+nombre+" ";
						}
					}
				}
				if(getP.isEncerrado()) {
					String idJefe = getP.getJefe();
				}else {
					String idJefe = getP.getJefe();
				}
				
				
			}

		}
	}
	
	class MyDialogPopup extends JDialog {
		public String sName;
		
		public MyDialogPopup() {
			setBounds(100, 100, 296, 175);
			setTitle("Encarcelar preso");
			setLocationRelativeTo(null);
			getContentPane().setLayout(null);
			// Create Input
			final JTextField name = new JTextField();
			name.setBounds(57, 36, 175, 20);
			getContentPane().add(name);
			// Button OK
			JButton btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sName = name.getText();
					dispose();
				}
			});
			btnOK.setBounds(70, 93, 78, 23);
			getContentPane().add(btnOK);
			// Button Cancel
			JButton btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sName = "";
					dispose();
				}
			});
			btnCancel.setBounds(158, 93, 74, 23);
			getContentPane().add(btnCancel);
		}
	}

}
