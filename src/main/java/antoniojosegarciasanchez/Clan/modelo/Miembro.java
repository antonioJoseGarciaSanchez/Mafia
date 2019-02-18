/**
 * 
 */
package antoniojosegarciasanchez.Clan.modelo;

import java.util.List;

/**
 * @author Antoniojose
 *
 */
public class Miembro {
	
	private String nombre;
	private Long antiguedad;
	private String jefe;
	private List<String> subordinados;
	private boolean encerrado;
	
	public Miembro() {
		
	}

	/**
	 * @param nombre
	 * @param antiguedad
	 * @param jefe
	 * @param subordinados
	 */
	public Miembro(String nombre, Long antiguedad, String jefe, List<String> subordinados) {
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.jefe = jefe;
		this.subordinados = subordinados;
	}

	/**
	 * @param nombre
	 * @param antiguedad
	 * @param jefe
	 * @param subordinados
	 * @param encerrado
	 */
	public Miembro(String nombre, Long antiguedad, String jefe, List<String> subordinados, boolean encerrado) {
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.jefe = jefe;
		this.subordinados = subordinados;
		this.encerrado = encerrado;
	} 

	/**
	 * @return the encerrado
	 */
	public boolean isEncerrado() {
		return encerrado;
	}

	/**
	 * @param encerrado the encerrado to set
	 */
	public void setEncerrado(boolean encerrado) {
		this.encerrado = encerrado;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the antiguedad
	 */
	public Long getAntiguedad() {
		return antiguedad;
	}

	/**
	 * @param antiguedad the antiguedad to set
	 */
	public void setAntiguedad(Long antiguedad) {
		this.antiguedad = antiguedad;
	}

	/**
	 * @return the jefe
	 */
	public String getJefe() {
		return jefe;
	}

	/**
	 * @param jefe the jefe to set
	 */
	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	/**
	 * @return the subordinados
	 */
	public List<String> getSubordinados() {
		return subordinados;
	}

	/**
	 * @param subordinados the subordinados to set
	 */
	public void setSubordinados(List<String> subordinados) {
		this.subordinados = subordinados;
	}
	
	

}
