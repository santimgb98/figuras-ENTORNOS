public class Circulo extends Figura{

    public Circulo(String forma, String color, int posX, int posY) {
        super(forma,color, posX, posY);
    }
    public double calcularArea(){

        return Math.PI* ((posX / 2)*(posX / 2));
    }
    public double calcularPerimetro(){

        return 2 * Math.PI * (posX / 2);
    }
    public void mover(int newPosX, int newPosY){
        posX = newPosX;
        posY = newPosY;
    }
}