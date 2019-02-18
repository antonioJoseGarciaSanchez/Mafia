package antoniojosegarciasanchez.Clan;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import antoniojosegarciasanchez.Clan.controlador.ControllerPrincipal;
import antoniojosegarciasanchez.Clan.modelo.Carcel;
import antoniojosegarciasanchez.Clan.modelo.Miembro;

/**
 * 
 */

/**
 * @author Antoniojose
 *
 */
public class App {
	
	
	private static final String FICHERO = "src/main/java/datos.json";
	private static Logger logger = Logger.getLogger("Clan.App");
	public static Carcel sevilla1;
	static ArrayList<Miembro> listMafiosos;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Arranque de la aplicacion
		ControllerPrincipal cp = new ControllerPrincipal();
		sevilla1 = new Carcel();
		listMafiosos = mapearFichero();
	}

	/**
	 * Crea una lista con todos los miembros pertenecientes al clan
	 * @return ArrayList<Miembro>
	 */
	public static ArrayList<Miembro> mapearFichero() {
		String file;
		ArrayList<Miembro> listMiembrosClan = null;
		try {
			
			file = new String(Files.readAllBytes(Paths.get(FICHERO)),"UTF-8");
			JSONParser parser = new JSONParser();
			parser.parse(file);
			JSONObject jsonObject = (JSONObject) parser.parse(file);
			
			JSONArray listMiembros = (JSONArray) jsonObject.get("members");
			
			listMiembrosClan = new ArrayList<Miembro>();
			
			for (int i = 0; i < listMiembros.size(); i++) {
				Object aux = listMiembros.get(i);
				JSONObject mafioso = (JSONObject) aux;
				
				Miembro miembro = crearMafioso(mafioso);
				listMiembrosClan.add(miembro); 
			}
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			logger.log(Level.WARNING, "Formato del encoding del fichero pasado no es compatible",e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.log(Level.WARNING, "Se ha producido un error inesperado de lectura o escritura sobre el fichero.", e);
		} catch (ParseException e) {
			logger.log(Level.WARNING, "Se ha producido un error inesperado al parsear el archivo json.", e);
		}
		return listMiembrosClan;	
		
	}
	
	/**
	 * Crea un Objeto Miembro con los atributos obtenidos en el parseo del archivo json
	 * @param miembroClan JSONObject
	 * @return Miembro
	 */
	private static Miembro crearMafioso(JSONObject miembroClan) {
		
		String nombre 	= (String) miembroClan.get("name");
		Long antiguedad = (Long) miembroClan.get("seniority");
		String jefe 	= (String) miembroClan.get("boss");
		List<String> subordinados = (List<String>) miembroClan.get("subordinates");

		Miembro miembro = new Miembro(nombre, antiguedad, jefe, subordinados);
		
		return miembro;
	}

	/**
	 * @return the sevilla1
	 */
	public static Carcel getSevilla1() {
		return sevilla1;
	}

	/**
	 * @param sevilla1 the sevilla1 to set
	 */
	public static void setSevilla1(Carcel sevilla1) {
		App.sevilla1 = sevilla1;
	}

	/**
	 * @return the listMafiosos
	 */
	public static ArrayList<Miembro> getListMafiosos() {
		return listMafiosos;
	}

	/**
	 * @param listMafiosos the listMafiosos to set
	 */
	public static void setListMafiosos(ArrayList<Miembro> listMafiosos) {
		App.listMafiosos = listMafiosos;
	}
}