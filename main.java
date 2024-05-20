import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner variable=new Scanner(System.in);
    System.out.println("TEST DE REPASO");
    String modelo;
    Autos miAuto1;
    Autos miAuto2;
    Autos miAuto3;
    Autos miAuto4;
    Autos miAuto5;

    miAuto1=new Autos("Dorado", "Marca1", "Combertible", 291, 1985);
    miAuto2=new Autos("Blanco", "Nissan", "4x4", 180, 2001);
    miAuto3=new Autos("Gris", "Toyota", "Camioneta", 100, 2008);
    miAuto4=new Autos("Rosado", "lamborghini", "Deportivo", 350, 2018);
    miAuto5=new Autos("Negro", "Camaro", "Clasico", 318, 2022);

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