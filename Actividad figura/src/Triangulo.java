public class Triangulo extends Figura{

    public Triangulo(String forma, String color, int posX, int posY) {
        super(forma,color, posX, posY);
    }
    public double calcularArea(){
        return (posX * posY) / 2;
    }
    public double calcularPerimetro(){
        return 3*posX;
    }
    public void mover(int newPosX, int newPosY){
        posX = newPosX;
        posY = newPosY;
    }
}