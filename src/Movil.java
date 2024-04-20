package src;

public class Movil extends  Producto {
private String tamañoPantalla;
private String porcentajeBateria;

    public Movil(String nombre, String modelo, String descripcion, double precio, String tamañoPantalla, String porcentajeBateria) {
        super(nombre, modelo, descripcion, precio);
        this.tamañoPantalla = tamañoPantalla;
    }



    public Movil(String nombre, String modelo, String descripcion, double precio) {
        super(nombre, modelo, descripcion, precio);
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public void setPorcentajeBateria(String porcentajeBateria) {
        this.porcentajeBateria = porcentajeBateria;
    }
}

