/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;

/**
 *
 * @author Amada
 */
public class CuentaBancaria {
    //Atributos privados
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;
    
    //constructor
    public CuentaBancaria(String numeroCuenta,Cliente propietario){
        this.numeroCuenta = numeroCuenta;
        this.saldo= 0.0; //Inicializa el saldo en 0
        this.propietario= propietario;
    } 
    
        //getter

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getPropietario() {
        return propietario;
    }
        
    //Setter para propietario

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    
 
    
}
