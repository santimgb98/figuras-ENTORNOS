public class Figura extends GestorFiguras{

    public String forma;
    public String color;
    public int posX;
    public int posY;

    public Figura(){

    }
    public Figura(String forma, String color, int posX, int posY){
        this.forma = forma;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public String getForma() {return forma;}
    public String getColor() {return color;}
    public int getPosX() {return posX;}
    public int getPosY() {return posY;}

    public void setForma(String forma) {this.forma = forma;}
    public void setColor(String color) {this.color = color;}
    public void setPosX(int posX) {this.posX = posX;}
    public void setPosY(int posY) {this.posY = posY;}

    public double calcularArea(){return 0;}
    public double calcularPerimetro(){return 0;}
    public void mover(int newPosX, int newPosY){}
}

