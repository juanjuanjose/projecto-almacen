public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases y llamar a sus métodos

        // Ejemplo para Proveedores
        Proveedores proveedor = new Proveedores(1, "Proveedor1", "001", "Calle 123", "123456789", "Juan Perez");
        proveedor.adicionar();
        proveedor.consultar();
        proveedor.modificar();
        proveedor.eliminar();

        InfComponentes componente = new InfComponentes(1, "Tipo1", "Caracteristicas1", 100, 2000, 1);
        componente.adicionar();
        componente.consultar();
        componente.modificar();
        componente.eliminar();

        DetallePedido detallePedido = new DetallePedido(1, 1, 1, 10);
        detallePedido.adicionar();
        detallePedido.consultar();
        detallePedido.modificar();
        detallePedido.eliminar();

        Pedidos pedido = new Pedidos(1, 123456789, "2024-05-21", "Pendiente", 1);
        pedido.adicionar();
        pedido.consultar();
        pedido.modificar();
        pedido.eliminar();

        Clientes cliente = new Clientes(123456789, "Cliente1", "Apellido1", 1, "Calle 456", "987654321");
        cliente.adicionar();
        cliente.consultar();
        cliente.modificar();
        cliente.eliminar();

        EntradaAlmacen entradaAlmacen = new EntradaAlmacen(1, "2024-05-21", 1, 50, 1);
        entradaAlmacen.adicionar();
        entradaAlmacen.consultar();
        entradaAlmacen.modificar();
        entradaAlmacen.eliminar();

        Inventario inventario = new Inventario(1, 100, 500, 3000);
        inventario.adicionar();
        inventario.consultar();
        inventario.modificar();
        inventario.eliminar();
        inventario.lista();

        DetalleFactura detalleFactura = new DetalleFactura(1, 1, 1, 5);
        detalleFactura.adicionar();
        detalleFactura.consultar();
        detalleFactura.modificar();
        detalleFactura.eliminar();

        Facturas factura = new Facturas(1, "2024-05-21", 123456789, "Pagada", 1);
        factura.adicionar();
        factura.consultar();
        factura.modificar();
        factura.eliminar();
        factura.calcular_total();

        Empleados empleado = new Empleados(1, "Empleado1", "Apellido1", "Calle 789", "123456789");
        empleado.adicionar();
        empleado.consultar();
        empleado.modificar();
        empleado.eliminar();

        Ciudades ciudad = new Ciudades(1, "Ciudad1", "Departamento1");
        ciudad.adicionar();
        ciudad.consultar();
        ciudad.modificar();
        ciudad.eliminar();

        Cargos cargo = new Cargos(1, "Cargo1", 2000.0);
        cargo.adicionar();
        cargo.consultar();
        cargo.modificar();
        cargo.eliminar();
    }
}
