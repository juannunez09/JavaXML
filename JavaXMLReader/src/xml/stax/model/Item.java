package xml.stax.model;

public class Item {
    private String nombre;
    private String telefono;
    private String comentarios;
    private String cliente;

   
    public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
    public String toString() {
        return "Item [nombre=" + nombre + ", telefono=" + telefono + ", comentarios="
                + comentarios  + "]";
    }
}