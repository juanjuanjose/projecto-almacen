public class Clientes {
    private int nit_cliente;
    private String nombre;
    private String apellido;
    private int codigo_ciudad;
    private String direccion;
    private String telefono;

    public Clientes(int nit_cliente, String nombre, String apellido, int codigo_ciudad, String direccion, String telefono) {
        this.nit_cliente = nit_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo_ciudad = codigo_ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getNit_cliente() {
        return nit_cliente;
    }
    public void setNit_cliente(int nit_cliente) {
        this.nit_cliente = nit_cliente;
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
    public int getCodigo_ciudad() {
        return codigo_ciudad;
    }
    public void setCodigo_ciudad(int codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void adicionar() {
        System.out.println("Cliente adicionado: " + nombre);
    }

    public void consultar() {
        System.out.println("Consultando cliente: " + nombre);
    }

    public void modificar() {
        System.out.println("Cliente modificado: " + nombre);
    }

    public void eliminar() {
        System.out.println("Cliente eliminado: " + nombre);
    }
}
