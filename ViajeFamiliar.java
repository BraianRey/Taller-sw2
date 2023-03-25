public class ViajeFamiliar extends Viaje {
    private int familia;
    
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia"; 
    }
    
    @Override
    public String cualquierMetodo2() {
        return "Metodo implementado en la clase hija viaje familiar";
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
    
    
}
