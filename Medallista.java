
public class Medallista {
	int cedula;
	String tipo;
	int edad;
	float peso;
	int altura;
	int celular;
	String direccion;
	String puesto;	
	int numero;
	String nombre;
	String apellido;
	public Medallista(String nombre, String apellido, String tipo, int edad, float peso, int altura, int i, String direccion, String puesto) {
	       this.nombre=nombre;
	       this.apellido=apellido;
	       this.tipo=tipo;
	       this.edad=edad;
	       this.peso=peso;
	       this.altura=altura;
	       this.celular=i;
	       this.direccion=direccion;
	       this.puesto=puesto;
	     
	    }
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	

	}