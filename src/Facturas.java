public class Facturas {
    private int id_factura;
    private String fecha_factura;
    private int nit_cliente;
    private String estado_factura;
    private int id_empleado;

    public Facturas(int id_factura, String fecha_factura, int nit_cliente, String estado_factura, int id_empleado) {
        this.id_factura = id_factura;
        this.fecha_factura = fecha_factura;
        this.nit_cliente = nit_cliente;
        this.estado_factura = estado_factura;
        this.id_empleado = id_empleado;
    }

    public int getId_factura() {
        return id_factura;
    }
    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    public String getFecha_factura() {
        return fecha_factura;
    }
    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }
    public int getNit_cliente() {
        return nit_cliente;
    }
    public void setNit_cliente(int nit_cliente) {
        this.nit_cliente = nit_cliente;
    }
    public String getEstado_factura() {
        return estado_factura;
    }
    public void setEstado_factura(String estado_factura) {
        this.estado_factura = estado_factura;
    }
    public int getId_empleado() {
        return id_empleado;
    }
    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void adicionar() {
        System.out.println("Factura adicionada: " + id_factura);
    }

    public void consultar() {
        System.out.println("Consultando factura: " + id_factura);
    }

    public void modificar() {
        System.out.println("Factura modificada: " + id_factura);
    }

    public void eliminar() {
        System.out.println("Factura eliminada: " + id_factura);
    }

    public double calcular_total() {
        System.out.println("Calculando total de la factura: " + id_factura);
        return 0.0;
    }
}
