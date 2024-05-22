public class Cargos {
    private int codigo_cargo;
    private String nombre_cargo;
    private double salario;

    public Cargos(int codigo_cargo, String nombre_cargo, double salario) {
        this.codigo_cargo = codigo_cargo;
        this.nombre_cargo = nombre_cargo;
        this.salario = salario;
    }

    public int getCodigo_cargo() {
        return codigo_cargo;
    }
    public void setCodigo_cargo(int codigo_cargo) {
        this.codigo_cargo = codigo_cargo;
    }
    public String getNombre_cargo() {
        return nombre_cargo;
    }
    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos
    public void adicionar() {
        System.out.println("Cargo adicionado: " + nombre_cargo);
    }

    public void consultar() {
        System.out.println("Consultando cargo: " + nombre_cargo);
    }

    public void modificar() {
        System.out.println("Cargo modificado: " + nombre_cargo);
    }

    public void eliminar() {
        System.out.println("Cargo eliminado: " + nombre_cargo);
    }
}
