import java.util.Scanner;

public class TelefonosMoviles extends ArticulosElectronicos implements ObtenerDatos{
    private String camara;
    private  String sistema;

    public TelefonosMoviles(String camara ,String sistema) {
        this.camara = camara;
        this.sistema= sistema;
    }

    public TelefonosMoviles() {

    }




    @Override
    public void alamcenardatos() {
        String _camara = null,_sitema =null;
        Scanner sn = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("dicta el Nombre del celular");
        nombre=sn.next();
        System.out.println("se almacenado el Nombre");
        System.out.println("---------------------------------------------");
        System.out.println("dicta el Modelo del celular");
        modelo=sn.next();
        System.out.println("se almacenado el modelo");
        System.out.println("---------------------------------------------");
        System.out.println("dicta la calidad de camara del celular");
        camara=sn.next();
        System.out.println("se almacenado el camara");
        setCamara(_camara);
        System.out.println("---------------------------------------------");
        System.out.println("dicta cual es el sistema del celular");
        sistema=sn.next();
        System.out.println("se almacenado el sistema");
        setSistema(_sitema);
        System.out.println("---------------------------------------------");
    }

    @Override
    public void obtenerPrecio() {
        Scanner sn = new Scanner(System.in);
        System.out.println("dicta el precios de las celulares");
        precio=sn.nextDouble();
        System.out.println("se almacenado el precio");
    }

    @Override
    public void obtenerDescricion() {
        Scanner sn = new Scanner(System.in);
        System.out.println("dicta el Nombre del celular");
        descripcion=sn.next();
        System.out.println("se almacenado la descripcion");
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getSistema() {
        return sistema;
    }


}
