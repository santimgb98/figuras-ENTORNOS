import java.awt.geom.Area;
import java.util.ArrayList;

public class GestorFiguras{

    ArrayList<Figura> listaFiguras;
    ArrayList<Double> listaAreas;
    ArrayList<Double> listaPerimetros;

    public GestorFiguras(){
        this.listaFiguras = new ArrayList<>();
        this.listaAreas = new ArrayList<>();
        this.listaPerimetros = new ArrayList<>();
    }

    public void anadirFigura (Figura figura) {
        try {
            listaFiguras.add(figura);
        }catch(Error error){
            System.out.println("Error al introducir figura, se ha producido el siguiente error: "+error);
        }finally {
            System.out.println("Nueva figura introducida con éxito!");
        }
    }
    public void eliminarFigura (String figura) {
      listaFiguras.remove(figura);
    }

    public void calcularAreaTotal() {
        double acumulador= 0;
        for(Figura fig : listaFiguras){
            acumulador += fig.calcularArea();
        }
        System.out.println(acumulador);
    }

    public void calcularPerimteroTotal() {
        double acumulador= 0;
        for(Figura fig : listaFiguras){
            acumulador += fig.calcularPerimetro();
        }
        System.out.println(acumulador);
    }

    public double figuraConMayorArea () {
        double temp = 0;

        for (int i = 0; i < listaAreas.size(); i++) {
            for (int j = 1; j < (listaAreas.size() - i); j++) {
                if (listaAreas.get(j - 1) > listaAreas.get(j)) {
                    temp = listaAreas.get(j - 1);
                    listaAreas.set(j-1, listaAreas.get(j));
                    listaAreas.set(j, temp);
                }
            }
        }
        return listaAreas.getLast();

    } // MAYOR AREA

    public void figuraConMayorPerimetro () { // MAYOR PERÍMETRO

    }
    public void listarFiguras () {

    }
    public void listarFigurasTipo () {

    }

    public String toString(){
        return "Circulo, Rectangulo, Cuadrado, Triangulo";
    }

}