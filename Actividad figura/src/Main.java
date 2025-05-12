import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figura> listaFiguras = new ArrayList<>();
        ArrayList<Double> listaAreas = new ArrayList<>();
        ArrayList<Double> listaPerimetros = new ArrayList<>();
        ArrayList<Figura> listaCirculos = new ArrayList<>();
        ArrayList<Figura> listaRectangulos = new ArrayList<>();
        ArrayList<Figura> listaCuadrados = new ArrayList<>();
        ArrayList<Figura> listaTriangulos = new ArrayList<>();

        while (true) {
            System.out.println("MENÚ DE FIGURAS");
            System.out.println("1. Añadir figura");
            System.out.println("2. Eliminar figura");
            System.out.println("3. Calcular area total");
            System.out.println("4. Calcular perímetro total");
            System.out.println("5. Figura de mayor área");
            System.out.println("6. Figura de mayor perímetro");
            System.out.println("7. Listar figuras");
            System.out.println("8. Listar tipo de figura");
            System.out.println("9. Salir");
            System.out.println("----------------------------------------");
            int option = sc.nextInt();
            switch (option) {
                case 1: { // AÑADIR figura
                    System.out.println("circulo \nrectangulo \ncuadrado \ntriangulo");
                    System.out.println("Introduce la forma de la figura: ");
                    String forma = sc.next();
                    System.out.println("Introduce el color de la nueva figura: ");
                    String color = sc.next();
                    System.out.println("Introduce su eje x: ");
                    int ejeX = sc.nextInt();
                    System.out.println("Introduce su eje y: ");
                    int ejeY = sc.nextInt();

                    switch (forma){
                        case "circulo":{Figura nuevaFigura = new Circulo(forma, color, ejeX, ejeY);
                            listaFiguras.add(nuevaFigura);
                            listaCirculos.add(nuevaFigura);
                            break;}
                        case "rectangulo":{Figura nuevaFigura = new Rectangulo(forma, color, ejeX, ejeY);
                            listaFiguras.add(nuevaFigura);
                            listaRectangulos.add(nuevaFigura);
                            break;}
                        case "cuadrado":{Figura nuevaFigura = new Cuadrado(forma, color, ejeX, ejeY);
                            listaFiguras.add(nuevaFigura);
                            listaCuadrados.add(nuevaFigura);
                            break;}
                        case "triangulo":{Figura nuevaFigura = new Triangulo(forma, color, ejeX, ejeY);
                            listaFiguras.add(nuevaFigura);
                            listaTriangulos.add(nuevaFigura);
                            break;}
                    }
                    break;
                }
                case 2: { // ELIMINAR figura
                    System.out.println("Selecciona una figura de la lista");
                    for (int i = 0; i < listaFiguras.size(); i++) {
                        System.out.println((i + 1 + ". ") + listaFiguras.get(i).getForma());
                    }
                    int seleccion = sc.nextInt() - 1;
                    listaFiguras.remove(listaFiguras.get(seleccion));
                    break;
                }
                case 3: { // Calcular AREA TOTAL
                    double acumulador= 0;
                    for(Figura figura : listaFiguras){
                        acumulador += figura.calcularArea();
                    }
                    System.out.println("Area total: "+acumulador);
                    break;
                }
                case 4: { // Calcular PERÍMETRO TOTAL
                    double acumulador= 0;
                    for(Figura fig : listaFiguras){
                        acumulador += fig.calcularPerimetro();
                    }
                    System.out.println("Perímetro total: "+acumulador);
                    break;
                }
                case 5:{ // Figura de MAYOR AREA
                    double temp;
                    for (Figura listaFigura : listaFiguras) {
                        listaAreas.add(listaFigura.calcularArea());
                    }
                    for (int i = 0; i < listaAreas.size(); i++) {
                        for (int j = 1; j < (listaAreas.size() - i); j++) {
                            if (listaAreas.get(j - 1) > listaAreas.get(j)) {
                                temp = listaAreas.get(j - 1);
                                listaAreas.set(j-1, listaAreas.get(j));
                                listaAreas.set(j, temp);
                            }
                        }
                    }
                    System.out.println("El mayor area es: "+listaAreas.getLast());
                    break;
                }
                case 6:{ // Figura de MAYOR PERÍMETRO
                    double temp;
                    for (Figura listaFigura : listaFiguras) {
                        listaPerimetros.add(listaFigura.calcularPerimetro());
                    }
                    for (int i = 0; i < listaPerimetros.size(); i++) {
                        for (int j = 1; j < (listaPerimetros.size() - i); j++) {
                            if (listaPerimetros.get(j - 1) > listaPerimetros.get(j)) {
                                temp = listaPerimetros.get(j - 1);
                                listaPerimetros.set(j-1, listaPerimetros.get(j));
                                listaPerimetros.set(j, temp);
                            }
                        }
                    }
                    System.out.println("El perímetro más alto es: "+listaPerimetros.getLast());
                    break;
                }
                case 7: { // LISTAR figuras
                    for (Figura figura : listaFiguras) {
                        System.out.println(figura.getForma());
                    }
                    break;
                }
                case 8:{ // LISTAR por TIPO de figura
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
                    break;
                }
                case 9:{
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                }
                default: System.out.println("No has escogido ninguna opción válida...");


            }
        }
    }
}