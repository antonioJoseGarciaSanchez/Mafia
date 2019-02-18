/**
 * 
 */
package antoniojosegarciasanchez.Clan.modelo;

import java.util.List;

/**
 * @author Antonio José
 *
 */
public class Carcel {
	
	private List<Miembro> miembrosEncerrados;
	
	public Carcel() {
		super();
	}

	/**
	 * @return the miembrosEncerrados
	 */
	public List<Miembro> getMiembrosEncerrados() {
		return miembrosEncerrados;
	}

	/**
	 * @param miembrosEncerrados the miembrosEncerrados to set
	 */
	public void setMiembrosEncerrados(List<Miembro> miembrosEncerrados) {
		this.miembrosEncerrados = miembrosEncerrados;
	}
	
	/**
	 * @param mafioso Miembro to set atributo encerrado a true
	 */
	public void entrarCarcel(Miembro mafioso) {
		mafioso.setEncerrado(true);
	}
	
	/**
	 * @param mafioso Miembro to set atributo encerrado a false
	 */
	public void salirCarcel(Miembro mafioso) {
		mafioso.setEncerrado(false);
	}
}
