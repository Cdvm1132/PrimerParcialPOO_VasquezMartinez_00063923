import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        int opcion1=0;
        Scanner sn = new Scanner(System.in);
        System.out.println("------bienvenido------");
        ArticulosElectronicos art= new Laptos();
        ArticulosElectronicos art1= new TelefonosMoviles();
        ArrayList<ArticulosElectronicos> lista= new ArrayList<>();
        do {
            System.out.println("Que desea realizar");
            System.out.println("1-agregar ");
            System.out.println("2-modificar");
            System.out.println("3-lista");
            System.out.println("4-salir");
            opcion=sn.nextInt();;
            switch (opcion){
                case 1:
                    art1.alamcenardatos();
                    art.alamcenardatos();
                    lista.add(art1);
                    lista.add(art);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("gracias por todo");
                    break;

                default:
                    System.out.println("opcion invalida");
                    break;
            }

        } while (opcion != 4);
    }
}

