package LogicaDeNegocio;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private Administrador admin;
    private boolean existeAdministrador;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.admin = new Administrador();
        this.existeAdministrador = false;
    }

    public Banco(ArrayList<Cliente> clientes, Administrador admin, boolean existeAdministrador) {
        this.clientes = clientes;
        this.admin = admin;
        this.existeAdministrador = existeAdministrador;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public boolean isExisteAdministrador() {
        return existeAdministrador;
    }

    public void setExisteAdministrador(boolean existeAdministrador) {
        this.existeAdministrador = existeAdministrador;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "clientes=" + clientes +
                ", admin=" + admin +
                ", existeAdministrador=" + existeAdministrador +
                '}';
    }
}
