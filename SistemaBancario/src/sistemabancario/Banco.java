/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;

import java.util.ArrayList;

/**
 *
 * @author Amada
 */
public class Banco {
   //Atributos
    private String nombre;
    private ArrayList<CuentaBancaria> listaCuentas;
    
    //Constructor 
    public Banco(String nombre){
        this.nombre = nombre;
        this.listaCuentas= new ArrayList();
    }
}
