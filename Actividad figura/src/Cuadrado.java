public class Cuadrado extends Figura{

    public Cuadrado(String forma, String color, int posX, int posY) {
        super(forma,color, posX, posY);
    }

    public double calcularArea(){
       return posY * posX;
    }
    public double calcularPerimetro(){
        return 4*posX;
    }
    public void mover(int newPosX, int newPosY){
        posX = newPosX;
        posY = newPosY;
    }
}