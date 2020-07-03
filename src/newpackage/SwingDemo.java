/*
 * Coder:Dhruv Roy Talukdar
 * Description:Function to create the GUI
 * Date:02-07-2020
 */
package newpackage;

import javax.swing.JFrame;

public class SwingDemo {
    
    final private int width = 700;
    final private int height = 600;
    
    public SwingDemo(){
        JFrame frame = new JFrame("Swing Demo");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new PanelClass(width,height));
        frame.setVisible(true);
    }
}
