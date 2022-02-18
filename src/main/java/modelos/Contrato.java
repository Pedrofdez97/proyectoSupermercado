package modelos;

import java.util.Objects;

public class Contrato {
    private int identificador;
    private double salarioBase;
    private TipoContrato tipoContrato;

    public Contrato(int identificador, double salarioBase, TipoContrato practicas) {
        this.identificador = identificador;
        this.salarioBase = salarioBase;
    }
    public Contrato (Contrato h) {
        this.identificador = h.getIdentificador();
        this.salarioBase = h.getSalarioBase();
    }

    public Contrato() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return identificador == contrato.identificador && Double.compare(contrato.salarioBase, salarioBase) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, salarioBase);
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "identificador=" + identificador +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
