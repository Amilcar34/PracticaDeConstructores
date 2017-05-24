package concesionaria;

public class Vehiculo {

	private int ruedas;
	private int alto;
	private int ancho;
	private int largo;
	int puertas;
	int ccMotor;
	private String color;
	private int pistones;
	
	public Vehiculo(){
		
		ruedas = 4;
		alto = 200;
		ancho = 300;
		largo = 400;
		puertas = 4;

	}
	
	public int devuelve_ruedas()  //GETTER - metodo que capta valor 
		{return ruedas;}				//devuelve el valor de ruedas
	
	
	public void establece_color()  //Setter - metodo que define valor
		{this.color = "verde";}	//le doy valor al atrivuto "color" y eso que no esta ne el constructor
	
	public String devuelve_color()						//Getter 
		{return "El color del Vehiculo es " + color;}  //le dijimos que devolvia un tipo de dato (String) por eso el "return"
	
	
	public void establese_puertas()  //setter
		{this.puertas = 4;}
	
	public String devuelve_puertas()  //getter
		{return "El vehiculo tiene " + puertas + " puertas";}
	
	
	public String devuelve_medidas()    //getter
		{return "El coche tiene un ancho de " + ancho/100 
				+ " Mts, un largo de " + largo/100 
				+ " Mts y un alto de " + alto/100 + " Mts.";}


	public void establece_usuario_pistones(int usuario_pistones)  //SETTER por parametros
	{this.pistones = usuario_pistones;}  //por parametro le paso "usuario_pistones" = atrivuto "pistones"
	
	public int devolver_pistones()  //GETTER
	{return pistones;}
}
