package proyecto_2;

public enum DiaSem {
	
;	LUNES(1, "horrible");
	MARTES(2, "na");
	MIERCOLES(3, "tampoco");
	JUEVES(4, "juernesss");
	VIERNES(5, "full joda");
	SABADO(6, "wii");
	DOMINGO(7, "mimir");
	
	
	private int numDia; 
	private String comentarioDia;
	private diaSem (int a, String b)
	{
		this.numDia=a;
		this.comentarioDia= b;
	}
	
	public int devolverNumDia()
	{
		return this.numDia;
	}
	 public String devolverComentario()
	 {
		 return this.comentario;
	 }
}
	Class Calendario {
		private diaSem dia = diaSem.DOMINGO;
		private int numDia= diaSem.DOMINGO.devolvernumDia();
		private String comentario = diaSem.DOMINGO.devolverComentario();
	}