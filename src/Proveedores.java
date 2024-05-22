public class Proveedores {
    private int id;
    private String nombre;
    private String codigo_ciudad;
    private String direccion;
    private String telefono;
    private String nombre_contacto;

    public Proveedores(int id, String nombre, String codigo_ciudad, String direccion, String telefono, String nombre_contacto) {
        this.id = id;
        this.nombre = nombre;
        this.codigo_ciudad = codigo_ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre_contacto = nombre_contacto;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo_ciudad() {
        return codigo_ciudad;
    }
    public void setCodigo_ciudad(String codigo_ciudad) {
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
    public String getNombre_contacto() {
        return nombre_contacto;
    }
    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }


    public void adicionar() {
        System.out.println("Proveedor adicionado: " + nombre);
    }

    public void consultar() {
        System.out.println("Consultando proveedor: " + nombre);
    }

    public void modificar() {
        System.out.println("Proveedor modificado: " + nombre);
    }

    public void eliminar() {
        System.out.println("Proveedor eliminado: " + nombre);
    }
}
