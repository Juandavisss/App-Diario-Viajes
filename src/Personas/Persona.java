/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author kaoss
 */
public abstract class Persona {
    protected int id;
    protected String Nombre;
    protected String email;
    protected String contrasenia;

    public Persona(int id, String Nombre, String email, String contrasenia) {
        this.id = id;
        this.Nombre = Nombre;
        this.email = email;
        this.contrasenia = contrasenia;
    }
    
    protected abstract void agregarLugar();
    
    //protected abstract
    
    
}
