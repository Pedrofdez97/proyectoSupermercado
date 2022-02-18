package utilidades;

import modelos.Contrato;
import modelos.Empresa;
import modelos.TipoContrato;

import java.util.ArrayList;
import java.util.List;

    public class UtilidadesContrato {
        public static List<Contrato> crearListaEmpresa() {
            List<Contrato> contratos = new ArrayList<>();
            Contrato c = new Contrato(20, 1250.50, modelos.TipoContrato.PRACTICAS);
            Contrato c1 = new Contrato(5, 1300.40, TipoContrato.INDEFINIDO);
            Contrato c2 = new Contrato(8, 1210.30, TipoContrato.OBRAYSERVICIO);
            Contrato c3 = new Contrato(16, 1000.10, TipoContrato.TEMPORAL);
            Contrato c4 = new Contrato(15, 1110.20, modelos.TipoContrato.PRACTICAS);
            contratos.add(c);
            contratos.add(c1);
            contratos.add(c2);
            contratos.add(c3);
            contratos.add(c4);

            return contratos;
        }
}
