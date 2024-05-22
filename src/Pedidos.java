public class Pedidos {
    private int id_pedido;
    private int nit_cliente;
    private String fecha_pedido;
    private String estado_pedido;
    private int id_empleado;

    public Pedidos(int id_pedido, int nit_cliente, String fecha_pedido, String estado_pedido, int id_empleado) {
        this.id_pedido = id_pedido;
        this.nit_cliente = nit_cliente;
        this.fecha_pedido = fecha_pedido;
        this.estado_pedido = estado_pedido;
        this.id_empleado = id_empleado;
    }

    public int getId_pedido() {
        return id_pedido;
    }
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    public int getNit_cliente() {
        return nit_cliente;
    }
    public void setNit_cliente(int nit_cliente) {
        this.nit_cliente = nit_cliente;
    }
    public String getFecha_pedido() {
        return fecha_pedido;
    }
    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }
    public String getEstado_pedido() {
        return estado_pedido;
    }
    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }
    public int getId_empleado() {
        return id_empleado;
    }
    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void adicionar() {
        System.out.println("Pedido adicionado: " + id_pedido);
    }

    public void consultar() {
        System.out.println("Consultando pedido: " + id_pedido);
    }

    public void modificar() {
        System.out.println("Pedido modificado: " + id_pedido);
    }

    public void eliminar() {
        System.out.println("Pedido eliminado: " + id_pedido);
    }
}
