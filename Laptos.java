import  java.util.Scanner;
public class Laptos extends ArticulosElectronicos implements ObtenerDatos{
    private String Procesador;
    private String Ram;

    public Laptos() {

    }


    @Override
    public void alamcenardatos() {
        Scanner sn = new Scanner(System.in);
        String _ram=null,_procesador=null;
        System.out.println("---------------------------------------------");
        System.out.println("dicta el Nombre del laptop");
        nombre=sn.next();
        System.out.println("se almacenado el Nombre");
        System.out.println("---------------------------------------------");
        System.out.println("dicta el Modelo del laptop");
        modelo=sn.next();
        System.out.println("se almacenado el modelo");
        System.out.println("---------------------------------------------");
        System.out.println("dicta el Modelo del laptop");
        _ram=sn.next();
        setRam(_ram);
        System.out.println("---------------------------------------------");
        System.out.println("dicta el Modelo del laptop");
        _procesador=sn.next();
        setProcesador(_procesador);
        System.out.println("---------------------------------------------");
    }

    @Override
    public void obtenerPrecio() {
        Scanner sn = new Scanner(System.in);
        System.out.println("dicta el precios de las laptos");
        precio=sn.nextDouble();
        System.out.println("se almacenado el precio");
    }

    @Override
    public void obtenerDescricion() {
        Scanner sn = new Scanner(System.in);
        System.out.println("dicta el Nombre del laptop");
        descripcion=sn.next();
        System.out.println("se almacenado la descripcion");
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }
}
