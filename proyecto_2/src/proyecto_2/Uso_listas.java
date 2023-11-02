package proyecto_2;
import java.util.*;
public class Uso_listas {
	//CREACION DE LISTAS	
	public static ArrayList <Auto> listadoAutos= new ArrayList<Auto>();
	//creacion de pilas
	public static Stack<Auto> pilaAutos = new Stack<Auto>();
	//creacion de cola
	public static LinkedList<Auto> colaAutos = new LinkedList<Auto>();
	
	
	public static HashMap <Integer, String> miDiccionario = new HashMap<Integer,String>();
	
	
	public static void main(String[] args) {
			
		miDiccionario.put(46046955, "Coty morano");
		miDiccionario.put(4234, "juana");
		miDiccionario.put(46789, "lidia");
		miDiccionario.put(3456, "luka");
		miDiccionario.put(47899, "ño");
		
		Iterator it = miDiccionario.keySet().iterator();
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("DNI: " + key + " Nombre: " + miDiccionario.get(key));
		}
		
		
		
		
		
		
		
		
		
		//cree 5 objetos de tipo auto
		Auto auto1= new Auto("M129", "BMW", "VIENTO", "2.5", "NAFTA");
		Auto auto2= new Auto("N130", "CULISUELTA", "GOD", "1.6", "NAFTA");
		Auto auto3= new Auto("M132", "FORD", "VKM", "2.5", "DIESEL");
		Auto auto4= new Auto("M156", "MUK", "PIOLA", "1.5", "NAFTA");
		Auto auto5= new Auto("M189", "BKE", "JEJE", "2.0", "HIBRIDO");
		
		
		listadoAutos.add(auto1);
		listadoAutos.add(auto2);
		listadoAutos.add(auto3);
		listadoAutos.add(auto4);
		listadoAutos.add(auto5);
		
		pilaAutos.push(auto1);
		pilaAutos.push(auto2);
		pilaAutos.push(auto3);
		pilaAutos.push(auto4);
		pilaAutos.push(auto5);
		
		colaAutos.offer(auto1);
		colaAutos.offer(auto2);
		colaAutos.offer(auto3);
		colaAutos.offer(auto4);
		colaAutos.offer(auto5);
		
		
		System.out.println(listadoAutos.size());
		System.out.println(pilaAutos.size());
		System.out.println(colaAutos.size());
		
		for (int i=0; i<3;i++)
		{
			//System.out.println(listadoAutos.get(i).resumenAuto());//accedo al primer auto con el i
			//System.out.println(pilaAutos.pop().resumenAuto());
		}
		
		
		
	}

}


class Auto{
		 
	private String codigo;
	private String marca;
	private String modelo;
	private String motor;
	private String combustible;

	

	public Auto (String codigo, String marca, String modelo, String motor, String combustible)
	{
		this.codigo=codigo;
		this.marca= marca;
		this.modelo=modelo;
		this.motor=motor;
		this.combustible=combustible;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	 public String resumenAuto(){
		 return getMarca() + " - " + getModelo() + " - " + getMotor() + " - " + getCombustible();
	 }
}