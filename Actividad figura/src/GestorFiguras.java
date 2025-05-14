import java.awt.geom.Area;
import java.util.ArrayList;

public class GestorFiguras{

    ArrayList<Figura> listaFiguras;
    ArrayList<Double> listaAreas;
    ArrayList<Double> listaPerimetros;
    ArrayList<Figura> listaCuadrados;
    ArrayList<Figura> listaCirculos;
    ArrayList<Figura> listaTriangulos;
    ArrayList<Figura> listaRectangulos;

    public GestorFiguras(){
        this.listaFiguras = new ArrayList<>();
        this.listaAreas = new ArrayList<>();
        this.listaPerimetros = new ArrayList<>();
        this.listaTriangulos = new ArrayList<>();
        this.listaCirculos = new ArrayList<>();
        this.listaCuadrados = new ArrayList<>();
        this.listaRectangulos = new ArrayList<>();
    }

    public void anadirFigura (String forma, String color, int ejeX, int ejeY) {
        switch (forma) {
            case "circulo": {
                Figura nuevaFigura = new Circulo(forma, color, ejeX, ejeY);
                listaFiguras.add(nuevaFigura);
                listaCirculos.add(nuevaFigura);
                listaAreas.add(nuevaFigura.calcularArea());
                listaPerimetros.add(nuevaFigura.calcularPerimetro());
                break;
            }
            case "rectangulo": {
                Figura nuevaFigura = new Rectangulo(forma, color, ejeX, ejeY);
                listaFiguras.add(nuevaFigura);
                listaRectangulos.add(nuevaFigura);
                listaAreas.add(nuevaFigura.calcularArea());
                listaPerimetros.add(nuevaFigura.calcularPerimetro());
                break;
            }
            case "cuadrado": {
                Figura nuevaFigura = new Cuadrado(forma, color, ejeX, ejeY);
                listaFiguras.add(nuevaFigura);
                listaCuadrados.add(nuevaFigura);
                listaAreas.add(nuevaFigura.calcularArea());
                listaPerimetros.add(nuevaFigura.calcularPerimetro());
                break;
            }
            case "triangulo": {
                Figura nuevaFigura = new Triangulo(forma, color, ejeX, ejeY);
                listaFiguras.add(nuevaFigura);
                listaTriangulos.add(nuevaFigura);
                listaAreas.add(nuevaFigura.calcularArea());
                listaPerimetros.add(nuevaFigura.calcularPerimetro());
                break;
            }
        }
    }
    public void eliminarFigura (int seleccion) {
        listaFiguras.remove(listaFiguras.get(seleccion));
    }

    public void calcularAreaTotal() {
        double acumulador= 0;
        for(Figura figura : listaFiguras){
            acumulador += figura.calcularArea();
        }
        System.out.println("Area total: "+acumulador);
    }

    public void calcularPerimteroTotal() {
        double acumulador= 0;
        for(Figura fig : listaFiguras){
            acumulador += fig.calcularPerimetro();
        }
        System.out.println(acumulador);
    }

    public void figuraConMayorArea () { // MAYOR AREA
        if (listaAreas.isEmpty()) {
            System.out.println("No hay figuras registradas");
        }
        double maxArea = listaAreas.getFirst();
        for (int i = 1; i < listaAreas.size(); i++) {
            if (listaAreas.get(i) > maxArea) {
                maxArea = listaAreas.get(i);
            }
        }
        System.out.println("El área más alta es: " +maxArea);

    }

    public void figuraConMayorPerimetro () { // MAYOR PERÍMETRO
        if (listaPerimetros.isEmpty()) {
            System.out.println("No hay figuras registradas");
        }
        double maxPerimetro = listaPerimetros.getFirst();
        for (int i = 1; i < listaPerimetros.size(); i++) {
            if (listaPerimetros.get(i) > maxPerimetro) {
                maxPerimetro = listaPerimetros.get(i);
            }
        }
        System.out.println("El área más alta es: " +maxPerimetro);
    }
    public void listarFiguras () {
        System.out.println("Ordenadas por orden");
        for (Figura figura : listaFiguras) {
            System.out.println("* "+figura.getForma());
        }
    }
    public void listarFigurasTipo () {
        System.out.println("Cuadrados: ");
        for (Figura figura : listaCuadrados) {
            System.out.println("* "+figura.getForma()+" de color "+ figura.getColor());
        }

        System.out.println("Circulos: ");
        for (Figura figura : listaCirculos) {
            System.out.println("* "+figura.getForma()+" de color "+ figura.getColor());
        }

        System.out.println("Rectángulos: ");
        for (Figura figura : listaRectangulos) {
            System.out.println("* "+figura.getForma()+" de color "+ figura.getColor());
        }

        System.out.println("Triángulos: ");
        for (Figura figura : listaTriangulos) {
            System.out.println("* "+figura.getForma()+" de color "+ figura.getColor());
        }
    }

    public String toString(){
        return "Circulo, Rectangulo, Cuadrado, Triangulo";
    }

}