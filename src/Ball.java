import java.awt.*;
import javax.swing.*;
public class Ball{

    private int x,y;
    private int size;
    private int xSpeed, ySpeed;
    private int c1, c2, c3;

    public Ball(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = (int)(Math.random()*10);
        ySpeed = (int)(Math.random()*10);
        c1 = (int)(Math.random()*255);
        c2 = (int)(Math.random()*255);
        c3 = (int)(Math.random()*255);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getSize(){
        return size;
    }
    public int getC1(){
        return c1;
    }

    public int getC2(){
        return c2;
    }
    public int getC3(){
        return c3;
    }
    public void drawBall(Graphics g){
        g.fillOval(x,y,size,size);
    }
    public void moveBall(JPanel bPanel){
        x+= xSpeed;
        if (x>=bPanel.getWidth() || x<=0){
            xSpeed*=-1;
        }

        y+=ySpeed;
        if (y>= bPanel.getHeight() || y<=0){
            ySpeed*=-1;
        }





    }
}
