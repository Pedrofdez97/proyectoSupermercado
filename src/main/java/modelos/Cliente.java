package modelos;

import java.util.Objects;

public class Cliente extends Persona{
    private TipoContrato tipoContrato;

    public Cliente(int identificador, String dni, String nombre, String apellidos, String direccion, TipoContrato tipoContrato) {
        super(identificador, dni, nombre, apellidos, direccion);
        this.tipoContrato = tipoContrato;
    }

    public Cliente(Persona f, TipoContrato tipoContrato) {
        super(f);
        this.tipoContrato = tipoContrato;
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
        Cliente cliente = (Cliente) o;
        return tipoContrato == cliente.tipoContrato;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoContrato);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoContrato=" + tipoContrato +
                '}';
    }
}

