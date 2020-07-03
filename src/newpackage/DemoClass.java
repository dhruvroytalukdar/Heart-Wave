/*
 * Coder:Dhruv Roy Talukdar
 * Description:Driver function
 * Date:02-07-2020
 */
package newpackage;

import javax.swing.SwingUtilities;

public class DemoClass {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            new SwingDemo();
        });
    }
}