package cuenta;

import java.time.LocalDateTime;

public class CuentaCL {

    static Cuenta personas[];
    static Cuenta cuentas[] = new Cuenta[200];
    static int pos;
    static int pos2;

    public CuentaCL(int pSize) {
        personas = new Cuenta[pSize];
    }

    public void crearCliente(String nombre, String apellido, String cedula) {
        personas[pos] = new Cuenta(nombre, apellido, cedula);
        pos += 1;
    }

    public void crearCuenta(double saldo, int numCuenta, LocalDateTime fecha) {       
        cuentas[pos2] = new Cuenta(saldo, numCuenta, fecha);
        pos2 += 1; 
    }
    
    public String buscarPersona(String pBuscar){
        String persona = "null";
        
        outerLoop:
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].cedula.equals(pBuscar)) {
                persona = "Nombre: " + personas[i].nombre + " " + personas[i].apellido + "\n" + "Cédula: " + personas[i].cedula;
                break outerLoop;
            }else{
                persona = "null"; 
                break outerLoop;
            }
        }
        
        return persona;
    }

}
