package modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Factura {

    private int identificador;
    private String codigoFactura;
    private double importaBase;
    private double descuento;
    private double iva;
    private double totalAPagar;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private boolean pagada;
    private List<LineaFactura> lineaFactura;
    private Cliente cliente;


    public Factura(int identificador, String codigoFactura, double importaBase, double descuento, double iva, double totalAPagar, LocalDate fechaEmision, LocalDate fechaVencimiento, boolean pagada, List<LineaFactura> lineaFactura, Cliente cliente) {
        this.identificador = identificador;
        this.codigoFactura = codigoFactura;
        this.importaBase = importaBase;
        this.descuento = descuento;
        this.iva = iva;
        this.totalAPagar = totalAPagar;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.pagada = pagada;
        this.lineaFactura = lineaFactura;
        this.cliente = cliente;
    }
    public Factura (Factura e) {
        this.identificador = e.getIdentificador();
        this.codigoFactura = e.getCodigoFactura();
        this.importaBase = e.getImportaBase();
        this.descuento = e.getDescuento();
        this.iva = e.getIva();
        this.totalAPagar = e.getTotalAPagar();
        this.fechaEmision = e.getFechaEmision();
        this.fechaVencimiento = e.getFechaVencimiento();
        this.pagada = e.isPagada();
        this.lineaFactura = e.getLineaFactura();
        this.cliente = e.getCliente();
    }

    public Factura() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getImportaBase() {
        return importaBase;
    }

    public void setImportaBase(double importaBase) {
        this.importaBase = importaBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public List<LineaFactura> getLineaFactura() {
        return lineaFactura;
    }

    public void setLineaFactura(List<LineaFactura> lineaFactura) {
        this.lineaFactura = lineaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return identificador == factura.identificador && Double.compare(factura.importaBase, importaBase) == 0 && Double.compare(factura.descuento, descuento) == 0 && Double.compare(factura.iva, iva) == 0 && Double.compare(factura.totalAPagar, totalAPagar) == 0 && pagada == factura.pagada && Objects.equals(codigoFactura, factura.codigoFactura) && Objects.equals(fechaEmision, factura.fechaEmision) && Objects.equals(fechaVencimiento, factura.fechaVencimiento) && Objects.equals(lineaFactura, factura.lineaFactura) && Objects.equals(cliente, factura.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigoFactura, importaBase, descuento, iva, totalAPagar, fechaEmision, fechaVencimiento, pagada, lineaFactura, cliente);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "identificador=" + identificador +
                ", codigoFactura='" + codigoFactura + '\'' +
                ", importaBase=" + importaBase +
                ", descuento=" + descuento +
                ", iva=" + iva +
                ", totalAPagar=" + totalAPagar +
                ", fechaEmision=" + fechaEmision +
                ", fechaVencimiento=" + fechaVencimiento +
                ", pagada=" + pagada +
                ", lineaFactura=" + lineaFactura +
                ", cliente=" + cliente +
                '}';
    }
}
