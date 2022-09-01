package demoherencia;

import demoherencia.DTO.Auto;
import demoherencia.DTO.Vehiculo;

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo mivehiculo = new Vehiculo();
        
        mivehiculo.setMarca("Toyota");
        mivehiculo.setModelo("Yaris");
        
        System.out.println(mivehiculo.getMarca() + " "
                + mivehiculo.getModelo());
        
        Auto miAuto = new Auto();
        miAuto.setCantidadPuertas(5);
        miAuto.setMarca("Chevrolet");
        miAuto.setModelo("Aveo");
        miAuto.setColor("Blanco");
        miAuto.setPatente("adsfasdf");
        
        System.out.println(miAuto.toString());
    }
    
}
