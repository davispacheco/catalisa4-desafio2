package src;

import java.util.HashSet;
import java.util.Set;

public class Organizacao {

    private Set<Cliente> clientes = new HashSet<>();
    private Set<Venda> vendas = new HashSet<>();
    private Set<Vendedor> vendedores = new HashSet<>();

    public Organizacao() {
        this.clientes = clientes;
        this.vendas = vendas;
        this.vendedores = vendedores;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(Set<Venda> vendas) {
        this.vendas = vendas;
    }

    public Set<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(Set<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
}
