package src;

public class Laptop extends Producto {
    private double pulgadasPantalla;
    private boolean incluyeCargador;

    public Laptop(String nombre, String modelo, String descripcion, double precio, double pulgadasPantalla, boolean incluyeCargador) {
        super(nombre, modelo, descripcion, precio);
        this.pulgadasPantalla = pulgadasPantalla;
        this.incluyeCargador = incluyeCargador;
    }



    public Laptop(String nombre, String modelo, String descripcion, double precio) {
        super(nombre, modelo, descripcion, precio);
    }

    public double getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(double pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public boolean isIncluyeCargador() {
        return incluyeCargador;
    }

    public void setIncluyeCargador(boolean incluyeCargador) {
        this.incluyeCargador = incluyeCargador;
    }
}
