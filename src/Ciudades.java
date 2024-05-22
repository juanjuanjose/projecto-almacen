public class Ciudades {
    private int codigo_ciudad;
    private String nombre;
    private String departamento;

    public Ciudades(int codigo_ciudad, String nombre, String departamento) {
        this.codigo_ciudad = codigo_ciudad;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public int getCodigo_ciudad() {
        return codigo_ciudad;
    }
    public void setCodigo_ciudad(int codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Métodos
    public void adicionar() {
        System.out.println("Ciudad adicionada: " + nombre);
    }

    public void consultar() {
        System.out.println("Consultando ciudad: " + nombre);
    }

    public void modificar() {
        System.out.println("Ciudad modificada: " + nombre);
    }

    public void eliminar() {
        System.out.println("Ciudad eliminada: " + nombre);
    }
}
