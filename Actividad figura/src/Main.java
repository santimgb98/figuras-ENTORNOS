import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorFiguras gestor = new GestorFiguras();

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

                    gestor.anadirFigura(forma,color,ejeX,ejeY);

                    break;
                }
                case 2: { // ELIMINAR figura
                    System.out.println("Selecciona una figura de la lista");
                    gestor.listarFiguras();
                    int seleccion = sc.nextInt() - 1;
                    gestor.eliminarFigura(seleccion);
                    break;
                }
                case 3: { // Calcular AREA TOTAL
                    gestor.calcularAreaTotal();
                    break;
                }
                case 4: { // Calcular PERÍMETRO TOTAL
                    gestor.calcularPerimteroTotal();
                    break;
                }
                case 5:{ // Figura de MAYOR AREA
                    gestor.figuraConMayorArea();
                    break;
                }
                case 6:{ // Figura de MAYOR PERÍMETRO
                    gestor.figuraConMayorPerimetro();
                    break;
                }
                case 7: { // LISTAR figuras
                    gestor.listarFiguras();
                    break;
                }
                case 8:{ // LISTAR por TIPO de figura
                    gestor.listarFigurasTipo();
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