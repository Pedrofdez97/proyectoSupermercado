package utilidades;

import modelos.*;

import java.util.*;


public class UtilidadesEmpresa {
    public List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){
        List<Empleado> listEmpleado = new ArrayList<>();

        for(Empleado a : empresa.getEmpleados()){
            if (tipoContrato.equals(a.getContrato())){
                listEmpleado.add(a);
            }
        }

        return listEmpleado;
    }

    public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa){
        List<Empleado> mileuristasalario = new ArrayList<>();

        for(Empleado s : empresa.getEmpleados()){
            if(s.getContrato().getSalarioBase() > 1000.00){
                mileuristasalario.add(s);
            }
        }

        mileuristasalario.sort(Comparator.comparing(salario -> salario.getContrato().getSalarioBase()));
        return mileuristasalario;
    }


    public double fondoSalarialEmpresa(Empresa empresa){
        double salario = 0.0;
        for(Empleado s : empresa.getEmpleados()) {
            salario =+ s.getContrato().getSalarioBase();
        }

        return salario;
    }

    public Empleado getMejorPagado(List<Empresa> empresas){
        Empleado mejorpagado;
        List<Empleado> empleadoCobrado = new ArrayList<>();

        for(Empresa m : empresas){
            empleadoCobrado.addAll(m.getEmpleados());
        }
        empleadoCobrado.sort(Comparator.comparing(c-> c.getContrato().getSalarioBase()));
        mejorpagado = empleadoCobrado.get(empleadoCobrado.size()-1);

        return mejorpagado;

    }
    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas){

        Map<TipoContrato, List<Empleado>> empleadoagrupados = new HashMap<>();

        for(Empleado e: empresas.getEmpleados()) {
            empleadoagrupados.put(TipoContrato.TEMPORAL, new ArrayList<>());
            empleadoagrupados.put(TipoContrato.PRACTICAS, new ArrayList<>());
            empleadoagrupados.put(TipoContrato.OBRAYSERVICIO, new ArrayList<>());
            empleadoagrupados.put(TipoContrato.INDEFINIDO, new ArrayList<>());

            switch (e.getTipoContrato()) {

                case TEMPORAL:
                    empleadoagrupados.get(TipoContrato.TEMPORAL).add(e);

                case PRACTICAS:
                    empleadoagrupados.get(TipoContrato.PRACTICAS).add(e);

                case OBRAYSERVICIO:
                    empleadoagrupados.get(TipoContrato.OBRAYSERVICIO).add(e);

                case INDEFINIDO:
                    empleadoagrupados.get(TipoContrato.INDEFINIDO).add(e);
            }
        }
            return empleadoagrupados;
    }

    public Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato(List<Empresa> empresas){

        Map<Empresa, Map<TipoContrato, List<Empleado>>> listaEmpresa = new HashMap<>();

        for(Empresa b: empresas){
            listaEmpresa.put(b, getEmpleadosPorTipoContrato(b));
        }

        return listaEmpresa;
    }
    public List<Empleado> getEmpleadosPymePracticas(List<Empresa> empresas) {
        //Que devuelve la lista de empleados pertenecientes de las empresas PYMES que se pasan cuyo contrato es del tipo PRACTICAS
        List<Empleado> empleadosPyme = new ArrayList<>();
        for (Empresa a : empresas) {
            if (a.getEmpresa().equals(TipoEmpresa.PYME)) {
                for (Empleado b : a.getEmpleados()) {
                    if (b.getTipoContrato().equals(TipoContrato.PRACTICAS)) {
                        empleadosPyme.add(b);
                    }
                }
            }

        }
        return empleadosPyme;
    }

    public Map<Empresa,Empleado> getLosMejorPagadosPorEmpresa(List<Empresa> empresas){
        //Que devuelva un mapa con el empleado que más cobra de cada empresa.
        Map<Empresa, Empleado> mejorPagado = new HashMap<>();

        for(Empresa emp: empresas){
            List<Empresa> empresa = new ArrayList<>();
            empresa.add(emp);
            mejorPagado.put(emp, getMejorPagado(empresa));
        }
        return mejorPagado;
    }






}

