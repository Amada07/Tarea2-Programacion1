/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;

/**
 *
 * @author Amada
 */
public class Cliente {
    // Atributos 
    private String nombre;
    private String dpi;
    private String direccion;
    
    //constructor 
    public Cliente (String nombre,String dpi, String direccion){
        this.nombre = nombre; 
        this.dpi = dpi;
        this.direccion = direccion; 
 }
   //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}