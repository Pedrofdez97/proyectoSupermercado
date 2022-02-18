package modelos;

import java.util.List;
import java.util.Objects;

public class Empresa{
    private int identificador;
    private String codigoEmpresa;
    private List<Empleado> empleados;
    private TipoEmpresa empresa;

    public Empresa(int identificador, String codigoEmpresa, List<Empleado> empleados, TipoEmpresa empresa) {
        this.identificador = identificador;
        this.codigoEmpresa = codigoEmpresa;
        this.empleados = empleados;
        this.empresa = empresa;
    }
    public Empresa (Empresa g) {
        this.identificador = g.getIdentificador();
        this.codigoEmpresa = g.getCodigoEmpresa();
        this.empleados = g.getEmpleados();
        this.empresa = g.getEmpresa();
    }

    public Empresa() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public TipoEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(TipoEmpresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa1 = (Empresa) o;
        return identificador == empresa1.identificador && Objects.equals(codigoEmpresa, empresa1.codigoEmpresa) && Objects.equals(empleados, empresa1.empleados) && empresa == empresa1.empresa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigoEmpresa, empleados, empresa);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "identificador=" + identificador +
                ", codigoEmpresa='" + codigoEmpresa + '\'' +
                ", empleados=" + empleados +
                ", empresa=" + empresa +
                '}';
    }
}
