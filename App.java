import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        
        createMoto();

    }


    public static void createMoto()
    {
        Moto moto = new Moto();//instacionado la clase Moto
        //asignando valores
        Scanner dato = new Scanner(System.in);   

        System.out.print("Ingrese la marca de su moto");

        moto.setMarca(dato.nextLine());

        System.out.println(moto.getMarca());

        moto.setNumerodeRuedas(dato.nextInt());
    }
    
}
