package utilidades;

import modelos.Cliente;
import modelos.Factura;
import modelos.LineaFactura;
import modelos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilidadesFactura {

    public boolean esFacturaVencida(Factura factura) {
        LocalDate fecha = factura.getFechaVencimiento();
        boolean comprobacion = fecha.isAfter(LocalDate.now());
        return comprobacion;
    }

    public double calcularBaseFactura(Factura factura) {
        double base = 0.0;

        for( LineaFactura linea  : factura.getLineaFactura()) {
            base += linea.getProducto().getPrecio() * linea.getCantidad();
        }
        return base;
        }

    public double calcularTotalAPagar(Factura factura){

        double totalApagar = (factura.getImportaBase() - factura.getDescuento()) * factura.getIva();

        return totalApagar;
    }
    public Double gastoTotalCliente(List<Factura> facturas, Cliente cliente){
        // Que devuelve la suma del importe total de las facturas , que pertenecen al cliente pasado como parámetro.
        double gastoTotal = 0;

        for(Factura c: facturas){
            List<Cliente> persona = new ArrayList<>();
            persona.add(c.getCliente());
            if (persona.get(0).equals(cliente)){
                gastoTotal = c.getTotalAPagar();
            }
        }
        return gastoTotal;
    }
    }



