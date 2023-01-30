import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BallPanel extends JPanel{
    //Ball ball = new Ball(100,100,50);

    Ball[] balls = new Ball[20];

    int x = 80;
    int xSpeed = 10;
    int y = 10;
    int ySpeed = 10;

    public BallPanel(){
        setBackground(new Color(178, 138, 255));
        for(int i = 0; i < 20; i++){
            balls[i] = new Ball((int)(Math.random()*100),((int)Math.random()*100),(int)(Math.random()*50));
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < 20; i++){
            balls[i].drawBall(g);
            g.setColor(new Color(balls[i].getC1(),balls[i].getC2(),balls[i].getC3()));
            balls[i].moveBall(this);



        }
        try {
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        };
        repaint();
    }
}
