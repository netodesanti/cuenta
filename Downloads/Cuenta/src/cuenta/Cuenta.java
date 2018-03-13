package cuenta;

import java.time.LocalDateTime;

public class Cuenta {

    //nombre, identificacion y descripcion 
    String nombre;
    String apellido;
    String cedula;

    int numCuenta;
    double saldo;
    LocalDateTime fecha;

    //Constructores (método particular)
    public Cuenta() {

    }

    public Cuenta(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public Cuenta(double psaldo, int pnumCuenta, LocalDateTime pfecha) {
        saldo = psaldo;
        numCuenta = pnumCuenta;
        fecha = pfecha;
    }
    
    public String toString(String parameter) {
        String info;
        
        info = nombre + " " + apellido + "\n" + cedula + "\n";
        
        return info;
    }

    public String toString() {
        String info;
        
        info = saldo + "\n" + numCuenta + "\n" + fecha + "\n";

        return info;
    }

}
