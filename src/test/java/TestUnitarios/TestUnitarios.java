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

    @Test
    public void empleadoPorContrato(){
        List<Empleado> trabajadorContrato = new ArrayList<>();
        int identificador, String codigoEmpresa, List<Empleado> empleados, TipoEmpresa empresa
        int identificador, double salarioBase, TipoContrato practicas
        identificador, String dni, String nombre, String apellidos, String direccion, String numTelefono, Empresa empresa, Contrato contrato, TipoContrato tipoContrato)
        Empresa b = new Empresa(12,"54asdas", trabajadorContrato, TipoEmpresa.MULTINACIONAL);
        Contrato c = new Contrato(15, 1250.09, modelos.TipoContrato.PRACTICAS);
        Empleado e = new Empleado(2, "48964251L", "Miguel", "Carrasco", "Calle", "685432145", b, c, modelos.TipoContrato.PRACTICAS);

    }

}
