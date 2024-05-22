public class DetalleFactura {
    private int id_detalle;
    private int id_factura;
    private int codigo_componente;
    private int cantidad_vendida;

    public DetalleFactura(int id_detalle, int id_factura, int codigo_componente, int cantidad_vendida) {
        this.id_detalle = id_detalle;
        this.id_factura = id_factura;
        this.codigo_componente = codigo_componente;
        this.cantidad_vendida = cantidad_vendida;
    }

    public int getId_detalle() {
        return id_detalle;
    }
    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }
    public int getId_factura() {
        return id_factura;
    }
    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    public int getCodigo_componente() {
        return codigo_componente;
    }
    public void setCodigo_componente(int codigo_componente) {
        this.codigo_componente = codigo_componente;
    }
    public int getCantidad_vendida() {
        return cantidad_vendida;
    }
    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public void adicionar() {
        System.out.println("Detalle de factura adicionado: " + id_detalle);
    }

    public void consultar() {
        System.out.println("Consultando detalle de factura: " + id_detalle);
    }

    public void modificar() {
        System.out.println("Detalle de factura modificado: " + id_detalle);
    }

    public void eliminar() {
        System.out.println("Detalle de factura eliminado: " + id_detalle);
    }
}
