package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){
        List<Producto> parametros = new ArrayList<>();


        for(Producto p : productos){
            if(p.equals(tipo)){
                parametros.add(p);
            }
        }
        return parametros;
    }
    public List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen){
        List<Producto> listaalmacen = new ArrayList<>();

        for(Producto a : productos){
            if(a.getAlmacen().equals(almacen)){
                listaalmacen.add(a);
            }
        }
        return listaalmacen;
    }
}
