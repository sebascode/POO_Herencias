/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoherencia.DTO;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private String Patente;
    private String Color;
    private int Ruedas;
    
    public Vehiculo(){
        this.Marca = "";
        this.Modelo = "";
    }

    public Vehiculo(String Marca, String Modelo, String Patente, String Color, int Ruedas) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Patente = Patente;
        this.Color = Color;
        this.Ruedas = Ruedas;
    }
    
    public String getMarca(){
        return this.Marca;
    }
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }
    
    
}
