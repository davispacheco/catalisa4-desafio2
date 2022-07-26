package src;

public class Venda {

    private String numeroRegistro;
    private String data;
    private String vendedorResponsavel;

    public Venda(String numeroRegistro, String data, String vendedorResponsavel) {
        this.numeroRegistro = numeroRegistro;
        this.data = data;
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(String vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }
}
