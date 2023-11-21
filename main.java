public class Main {
    public static void main(String[] args) {
        System.out.println("TEST DE REPASO");

        Autos miAuto1;
        Autos miAuto2;
        Autos miAuto3;
        Autos miAuto4;
        Autos miAuto5;

        miAuto1=new Autos("Dorado");
        miAuto2=new Autos("Blanco");
        miAuto3=new Autos("Gris");
        miAuto4=new Autos("Rosado");
        miAuto5=new Autos("Negro");

        miAuto1.setMarca("Chevrolet");
        miAuto2.setMarca("Nissan");
        miAuto3.setMarca("Toyota");
        miAuto4.setMarca("lamborghini");
        miAuto5.setMarca("Camaro");

        miAuto1.setModelo("Combertible");
        miAuto2.setModelo("4x4");
        miAuto3.setModelo("Camioneta");
        miAuto4.setModelo("Deportivo");
        miAuto5.setModelo("Clasico");

        miAuto1.setVelocidad("291 kilometros por hora");
        miAuto2.setVelocidad("180 kilometros por hora");
        miAuto3.setVelocidad("100 kilometros por hora");
        miAuto4.setVelocidad("350 kilometros por hora");
        miAuto5.setVelocidad("318 kilometros por hora");

        miAuto1.setAnio(1985);
        miAuto2.setAnio(2001);
        miAuto3.setAnio(2008);
        miAuto4.setAnio(2018);
        miAuto5.setAnio(2022);

        //obtener los valores de cada atributos

        System.out.println("Marca: "+miAuto1.getMarca()+"Modelo: "+miAuto1.getModelo()+" Color: "+miAuto1.getColor()+" Velocidad: "+miAuto1.getVelocidad()+" Año: "+miAuto1.getAnio());


    }
}