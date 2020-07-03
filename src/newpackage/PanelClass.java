/*
 * Coder:Dhruv Roy Talukdar
 * Description:This is the class representing the component which will be painted
 * Date:02-07-2020
 */
package newpackage;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javafx.util.Pair;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import static java.lang.Math.*;
public class PanelClass extends JPanel{
    
    private final int width;
    private final int height;
    private boolean check = false;
    private final ArrayList<Pair<Double,Double>> arr = new ArrayList<>();
    
    
    
    PanelClass(int w,int h){
        setBackground(Color.PINK);
        setSize(w,h);
        setLayout(null);
        width = w;
        height = h;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.translate(getWidth()/2,getHeight()/2);
        
//        g.setColor(Color.BLACK);
//        g.drawLine(0,-height/2, 0, height/2);
//        g.drawLine(-width/2,0,width/2,0);
        
        if(check){
            if(!arr.isEmpty()){ for(Pair<Double,Double> temp:arr){
                g.setColor(Color.RED);
                g.fillOval((int)(temp.getKey()*100.0), (int)(temp.getValue()*100.0), 7, 7);
            }}
        }
        if(!check)sleepThread();
    }
    
    public void sleepThread(){
        SwingWorker sw = new SwingWorker(){
            @Override
            protected Object doInBackground() throws Exception {
                check=true;
                int a=450;
                double x;
                double y;
                for(double i=-1.78;i<1.78;i+=0.004){
                    x=i;
                    y=(double)pow((x>0)?x:(-1)*x,2.0/3.0)+0.9*sqrt(3.3-pow(x,2))*sin(((x*3.14*a)*3.14)/180);
                    arr.add(new Pair<>(x,-y));
                    repaint();
                    Thread.sleep(10);
                }
                return "";
            }  
        };
        sw.execute();
    }
}
