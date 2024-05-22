public class DetallePedido {
    private int id_detalle;
    private int id_pedido;
    private int codigo_componente;
    private int cantidad_solicitada;

    public DetallePedido(int id_detalle, int id_pedido, int codigo_componente, int cantidad_solicitada) {
        this.id_detalle = id_detalle;
        this.id_pedido = id_pedido;
        this.codigo_componente = codigo_componente;
        this.cantidad_solicitada = cantidad_solicitada;
    }

    public int getId_detalle() {
        return id_detalle;
    }
    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }
    public int getId_pedido() {
        return id_pedido;
    }
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    public int getCodigo_componente() {
        return codigo_componente;
    }
    public void setCodigo_componente(int codigo_componente) {
        this.codigo_componente = codigo_componente;
    }
    public int getCantidad_solicitada() {
        return cantidad_solicitada;
    }
    public void setCantidad_solicitada(int cantidad_solicitada) {
        this.cantidad_solicitada = cantidad_solicitada;
    }

    public void adicionar() {
        System.out.println("Detalle de pedido adicionado: " + id_detalle);
    }

    public void consultar() {
        System.out.println("Consultando detalle de pedido: " + id_detalle);
    }

    public void modificar() {
        System.out.println("Detalle de pedido modificado: " + id_detalle);
    }

    public void eliminar() {
        System.out.println("Detalle de pedido eliminado: " + id_detalle);
    }
}
