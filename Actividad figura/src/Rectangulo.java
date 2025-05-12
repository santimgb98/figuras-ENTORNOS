public class Rectangulo extends Figura{

    public Rectangulo(String forma, String color, int posX, int posY) {
        super(forma,color, posX, posY);
    }

    public double calcularArea(){
        return posX * posY;
    }
    public double calcularPerimetro(){
        return 2*posX + 2*posY;
    }
    public void mover(int newPosX, int newPosY){
        posX = newPosX;
        posY = newPosY;
    }
}