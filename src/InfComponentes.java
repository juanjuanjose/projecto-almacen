public class InfComponentes {
    private int codigo_comp;
    private String tipo_componente;
    private String caracteristicas;
    private int componente;
    private int vr_unitario_compra;
    private int codigo_proveedor;

    public InfComponentes(int codigo_comp, String tipo_componente, String caracteristicas, int componente, int vr_unitario_compra, int codigo_proveedor) {
        this.codigo_comp = codigo_comp;
        this.tipo_componente = tipo_componente;
        this.caracteristicas = caracteristicas;
        this.componente = componente;
        this.vr_unitario_compra = vr_unitario_compra;
        this.codigo_proveedor = codigo_proveedor;
    }

    public int getCodigo_comp() {
        return codigo_comp;
    }
    public void setCodigo_comp(int codigo_comp) {
        this.codigo_comp = codigo_comp;
    }
    public String getTipo_componente() {
        return tipo_componente;
    }
    public void setTipo_componente(String tipo_componente) {
        this.tipo_componente = tipo_componente;
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public int getComponente() {
        return componente;
    }
    public void setComponente(int componente) {
        this.componente = componente;
    }
    public int getVr_unitario_compra() {
        return vr_unitario_compra;
    }
    public void setVr_unitario_compra(int vr_unitario_compra) {
        this.vr_unitario_compra = vr_unitario_compra;
    }
    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }
    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public void adicionar() {
        System.out.println("Componente adicionado: " + tipo_componente);
    }

    public void consultar() {
        System.out.println("Consultando componente: " + tipo_componente);
    }

    public void modificar() {
        System.out.println("Componente modificado: " + tipo_componente);
    }

    public void eliminar() {
        System.out.println("Componente eliminado: " + tipo_componente);
    }
}
