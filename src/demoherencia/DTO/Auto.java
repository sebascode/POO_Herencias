package demoherencia.DTO;

public class Auto extends Vehiculo {
    
    private int CantidadPuertas;
    
    public Auto(){
        this.CantidadPuertas = 0;
    }

    public int getCantidadPuertas() {
        return CantidadPuertas;
    }

    public void setCantidadPuertas(int CantidadPuertas) {
        this.CantidadPuertas = CantidadPuertas;
    }
    
    
    // Sobrecarga Explícita
    // super --> this del papá
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMarca: "+ super.getMarca());
        sb.append("\nModelo: "+ super.getModelo());
        sb.append("\nColor: "+super.getColor());
        sb.append("\nCantidad Puertas: "+this.getCantidadPuertas());
        
        return sb.toString();
    }
}
