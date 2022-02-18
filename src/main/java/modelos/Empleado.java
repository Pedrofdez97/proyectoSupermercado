package modelos;

import java.util.Objects;

public class Empleado extends Persona {
    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;
    private TipoContrato tipoContrato;


    public Empleado(int identificador, String dni, String nombre, String apellidos, String direccion, String numTelefono, Empresa empresa, Contrato contrato, TipoContrato tipoContrato) {
        super(identificador, dni, nombre, apellidos, direccion);
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
        this.tipoContrato = tipoContrato;
    }

    public Empleado(Persona f, String numTelefono, Empresa empresa, Contrato contrato, TipoContrato tipoContrato) {
        super(f);
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
        this.tipoContrato = tipoContrato;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(numTelefono, empleado.numTelefono) && Objects.equals(empresa, empleado.empresa) && Objects.equals(contrato, empleado.contrato) && tipoContrato == empleado.tipoContrato;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numTelefono, empresa, contrato, tipoContrato);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numTelefono='" + numTelefono + '\'' +
                ", empresa=" + empresa +
                ", contrato=" + contrato +
                ", tipoContrato=" + tipoContrato +
                '}';
    }
}
