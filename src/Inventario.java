public class Inventario {
    private int codigo_comp;
    private int componente;
    private int existencia;
    private int vr_unitario_venta;

    public Inventario(int codigo_comp, int componente, int existencia, int vr_unitario_venta) {
        this.codigo_comp = codigo_comp;
        this.componente = componente;
        this.existencia = existencia;
        this.vr_unitario_venta = vr_unitario_venta;
    }

    public int getCodigo_comp() {
        return codigo_comp;
    }
    public void setCodigo_comp(int codigo_comp) {
        this.codigo_comp = codigo_comp;
    }
    public int getComponente() {
        return componente;
    }
    public void setComponente(int componente) {
        this.componente = componente;
    }
    public int getExistencia() {
        return existencia;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public int getVr_unitario_venta() {
        return vr_unitario_venta;
    }
    public void setVr_unitario_venta(int vr_unitario_venta) {
        this.vr_unitario_venta = vr_unitario_venta;
    }

    public void adicionar() {
        System.out.println("Componente adicionado al inventario: " + codigo_comp);
    }

    public void consultar() {
        System.out.println("Consultando componente en el inventario: " + codigo_comp);
    }

    public void modificar() {
        System.out.println("Componente modificado en el inventario: " + codigo_comp);
    }

    public void eliminar() {
        System.out.println("Componente eliminado del inventario: " + codigo_comp);
    }

    public void lista() {
        System.out.println("Listando inventario");
    }
}
