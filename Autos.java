public class Autos  {
    //atributos
    String color;
    String marca;
    String modelo;
    String velocidad;
    int  anio;
    //---------------------------------------------------------------------------------
    Autos  (String  nuevoColor){
        color=nuevoColor;
    }
    String getColor(){
        return color;
    }
    String  getMarca(){
        return marca;
    }
    String getModelo(){
        return modelo;
    }
    String getVelocidad(){
        return velocidad;
    }
    int getAnio(){return anio;}
    //---------------------------------------------------------------------------------
    void setColor (String newColor){
        this.color=newColor;
    }
    void setMarca (String  newMarca){
        this.marca=newMarca;
    }
    void setModelo (String newModelo){
        this.modelo=newModelo;
    }
    void setVelocidad (String newVelocidad){
        this.velocidad=newVelocidad;
    }
    void setAnio (int newAnio){
        this.anio=newAnio;
    }
}



