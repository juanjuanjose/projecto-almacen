public class Empleados {
    private int id_empleado;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Empleados(int id_empleado, String nombre, String apellido, String direccion, String telefono) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId_empleado() {
        return id_empleado;
    }
    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
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
        System.out.println("Empleado adicionado: " + nombre);
    }

    public void consultar() {
        System.out.println("Consultando empleado: " + nombre);
    }

    public void modificar() {
        System.out.println("Empleado modificado: " + nombre);
    }

    public void eliminar() {
        System.out.println("Empleado eliminado: " + nombre);
    }
}
