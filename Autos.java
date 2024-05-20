public class Autos  {
    //atributos
    private String color;
    private String marca;
    private String modelo;
    private double velocidad;
    private int anio;

    Autos(String color, String marca, String modelo, double velocidad, int anio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.anio = anio;
    }

    String getColor() {
        return this.color;
    }

    String getMarca() {
        return this.marca;
    }

    String getModelo() {
        return this.modelo;
    }

    double getVelocidad() {
        return this.velocidad;
    }

    int getAnio() {
        return this.anio;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    void setAnio(int anio) {
        this.anio = anio;
    }
}