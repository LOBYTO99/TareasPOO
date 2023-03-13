package televisor;

public class Tv {

    //Atributos
    String modelo;
    String marca;
    int pantalla;
    String adicional;
    double dimensiones;
    String smarttv;
    double peso;
    String garantia;

    //Metodos
    public void garantia(String garantia) {
        this.garantia = garantia;
    }

    public void peso(double peso) {
        this.peso = peso;
    }

    public void modelo(String modelo) {
        this.modelo = modelo;
        // System.out.println("El modelo es:" + modelo);
    }

    public void dimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
        // System.out.println(" Las dimensiones son: " + dimensiones);
    }

    public void marca(String marca) {
        this.marca = marca;
        // System.out.println(" La marca del tv es:" + marca);
    }

    public void pantalla(int pantalla) {
        this.pantalla = pantalla;
        // System.out.println(" El televisor tiene:" + pantalla);
    }

    public void smarttv(String smarttv) {
        this.smarttv = smarttv;
        // System.out.println(" Estas son algunas caracteristicas especiales : " + smarttv);

    }

    public void adicional(String adicional) {
        this.adicional = adicional;
        // System.out.println(" Estas son algunas funciones adicionales : " + adicional);
    }
}
