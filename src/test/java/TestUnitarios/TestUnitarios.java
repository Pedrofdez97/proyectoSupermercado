package TestUnitarios;

import modelos.*;
import org.junit.Test;
import utilidades.UtilidadesCliente;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestUnitarios {
// Test convalidación DNI.
    @Test
    public void testDni(){
        Cliente b = new Cliente (1, "49130202B", "Pedro", "Fernandez", "calle", TipoContrato.PRACTICAS);
        boolean a = UtilidadesCliente.esDniValido(b);
        assertEquals(true, a);
    }

    @Test
    public void testDniFalso(){
        Cliente b = new Cliente (1, "491302022", "Pedro", "Fernandez", "calle", TipoContrato.PRACTICAS);
        boolean a = UtilidadesCliente.esDniValido(b);
        assertEquals(false, a);
    }

    @Test(expected = NullPointerException.class)
    public void testDniNull(){
        Cliente b = new Cliente (1, "49130202B", "Pedro", "Fernandez", "calle", TipoContrato.PRACTICAS);
        boolean a = UtilidadesCliente.esDniValido(null);
    }


}
