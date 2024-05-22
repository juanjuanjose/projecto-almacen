public class EntradaAlmacen {
    private int id;
    private String fecha_entrada;
    private int codigo_componente;
    private int cantidad_comprada;
    private int codigo_proveedor;

    public EntradaAlmacen(int id, String fecha_entrada, int codigo_componente, int cantidad_comprada, int codigo_proveedor) {
        this.id = id;
        this.fecha_entrada = fecha_entrada;
        this.codigo_componente = codigo_componente;
        this.cantidad_comprada = cantidad_comprada;
        this.codigo_proveedor = codigo_proveedor;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFecha_entrada() {
        return fecha_entrada;
    }
    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
    public int getCodigo_componente() {
        return codigo_componente;
    }
    public void setCodigo_componente(int codigo_componente) {
        this.codigo_componente = codigo_componente;
    }
    public int getCantidad_comprada() {
        return cantidad_comprada;
    }
    public void setCantidad_comprada(int cantidad_comprada) {
        this.cantidad_comprada = cantidad_comprada;
    }
    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }
    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public void adicionar() {
        System.out.println("Entrada de almacén adicionada: " + id);
    }

    public void consultar() {
        System.out.println("Consultando entrada de almacén: " + id);
    }

    public void modificar() {
        System.out.println("Entrada de almacén modificada: " + id);
    }

    public void eliminar() {
        System.out.println("Entrada de almacén eliminada: " + id);
    }
}
