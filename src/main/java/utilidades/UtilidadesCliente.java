package utilidades;

import modelos.Cliente;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesCliente {
    public  static boolean esDniValido(Cliente cliente) {
        boolean dni = true;
        String dnivalido = cliente.getDni();
        char[] aCaracteres = dnivalido.toCharArray();

        for(int i = 0; i < aCaracteres.length; i++){
            char letra = aCaracteres[i];

            if(i < aCaracteres.length -1 && !Character.isDigit(letra) ) {
                dni = false;
                }
            if(i == aCaracteres.length -1 && !Character.isLetter(letra)){
                dni = false;
        }
        }
        return dni;
    }
}
