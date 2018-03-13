package cuenta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDateTime;

public class CuentaUI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    static CuentaCL CL = new CuentaCL(100);

    public static void main(String[] args) throws IOException {
        mostrarMenu();

    }

    public static void mostrarMenu() throws IOException {
        System.out.println("------------------------------------------");
        System.out.println("Menu principal. Elija uno de los números");
        System.out.println("1. Crear cliente");
        System.out.println("2. Listar cliente");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Crear cuentas");
        System.out.println("5. Listar cuentas");
        System.out.println("------------------------------------------");

        ejecutarAccion();
    }

    public static void ejecutarAccion() throws IOException {
        int numSeleccionado;

        numSeleccionado = Integer.parseInt(in.readLine());

        switch (numSeleccionado) {
            case 0:
                System.out.println();
                System.out.println("El número no concuerda con ninguna opción!");
                System.out.println();
                System.exit(0);
                break;

            case 1:
                String nombre;
                String apellido;
                String cedula;

                System.out.println();
                System.out.println("Digite su nombre");
                nombre = in.readLine();

                System.out.println();
                System.out.println("Digite su apellido");
                apellido = in.readLine();

                System.out.println();
                System.out.println("Digite su identificación");
                cedula = in.readLine();

                CL.crearCliente(nombre, apellido, cedula);

                mostrarMenu();
                break;

            case 2:
                String parameter = "null";
                
                System.out.println();

                for (int i = 0; i < CL.personas.length; i++) {
                    if (CL.personas[i] == null) {
                        
                    }else{
                        System.out.println(CL.personas[i].toString(parameter));
                    }
                }

                mostrarMenu();
                break;

            case 3:
                System.out.println();
                System.out.println("Digite la cédula de la persona a buscar");   
                String personaBuscar = in.readLine();
                
                System.out.println();
                if (CL.buscarPersona(personaBuscar) == "null") {
                    out.println("La persona no existe");
                }else{
                    System.out.println(CL.buscarPersona(personaBuscar));
                }
                
                mostrarMenu();
                break;

            case 4:
                double saldo;
                int numCuenta;
                LocalDateTime fecha;

                System.out.println();
                System.out.println("Digite su saldo");
                saldo = Double.parseDouble(in.readLine());

                numCuenta = 1;

                fecha = LocalDateTime.now();

                CL.crearCuenta(saldo, numCuenta, fecha);
                
                numCuenta += 1;
                
                mostrarMenu();
                break;

            case 5:
                out.println();
                for (int i = 0; i < CL.cuentas.length; i++) {
                    if (CL.cuentas[i] == null) {
                        
                    }else{
                        System.out.println(CL.cuentas[i].toString());
                    }
                }

                mostrarMenu();
                break;
        }
    }
}
