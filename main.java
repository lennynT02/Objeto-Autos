import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner variable=new Scanner(System.in);
        System.out.println("TEST DE REPASO");
        String modelo;
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
        modelo=variable.nextLine();
        miAuto1.setMarca(modelo);
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

        System.out.println("AUTOS....................");
        System.out.println("Marca: "+miAuto1.getMarca()+" Modelo: "+miAuto1.getModelo()+" Color: "+miAuto1.getColor()+" Velocidad: "+miAuto1.getVelocidad()+" Año: "+miAuto1.getAnio()+"\n");
        System.out.println("Marca: "+miAuto2.getMarca()+" Modelo: "+miAuto2.getModelo()+" Color: "+miAuto2.getColor()+" Velocidad: "+miAuto2.getVelocidad()+" Año: "+miAuto2.getAnio()+"\n");
        System.out.println("Marca: "+miAuto3.getMarca()+" Modelo: "+miAuto3.getModelo()+" Color: "+miAuto3.getColor()+" Velocidad: "+miAuto3.getVelocidad()+" Año: "+miAuto3.getAnio()+"\n");
        System.out.println("Marca: "+miAuto4.getMarca()+" Modelo: "+miAuto4.getModelo()+" Color: "+miAuto4.getColor()+" Velocidad: "+miAuto4.getVelocidad()+" Año: "+miAuto4.getAnio()+"\n");
        System.out.println("Marca: "+miAuto5.getMarca()+" Modelo: "+miAuto5.getModelo()+" Color: "+miAuto5.getColor()+" Velocidad: "+miAuto5.getVelocidad()+" Año: "+miAuto5.getAnio()+"\n");
        System.out.println("Suma de sus años: "+ (miAuto1.getAnio()+miAuto2.getAnio()+miAuto3.getAnio()+miAuto4.getAnio()+miAuto5.getAnio()));
    }
}