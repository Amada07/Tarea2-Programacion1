/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabancario;

/**
 *
 * @author Amada
 */
public class SistemaBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 =new Cliente("Amada Carcamo", "123567802","Zona 10 Ciudad de Guatemala");
        Cliente cliente2= new Cliente("Flor Renderos", "5764377496","Avenida del Sol, Edificio Aurora, ciudad Guatemala");
    
    //Crear cuentas bancarias asociadas a los clientes
    CuentaBancaria cuenta1= new CuentaBancaria("001",cliente1);
    CuentaBancaria cuenta2= new CuentaBancaria("002", cliente2);
    
    // Crear banco y agregar cuentas
        Banco banco = new Banco("Banco Central");
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);

         // Realizar operaciones
        cuenta1.depositar(1000);
        cuenta1.retirar(500);
        cuenta2.depositar(2000);
        cuenta2.retirar(3000); // Intento de retiro con fondos insuficientes
        
     // Mostrar información de clientes y cuentas
        System.out.println("\nInformación de los clientes y sus cuentas:");
        cliente1.mostrarDatos();
        System.out.println("Saldo actual: " + cuenta1.consultarSaldo());
        
        cliente2.mostrarDatos();
        System.out.println("Saldo actual: " + cuenta2.consultarSaldo());
        
      // Mostrar cuentas registradas en el banco
        banco.mostrarCuentas();
    }
}