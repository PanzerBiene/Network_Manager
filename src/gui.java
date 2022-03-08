import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args) {
        /*
        gets the resolution of the users screen to allow for the application to start at the proper size
         */
        Dimension screenResolution = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidthDouble = screenResolution.getWidth();
        double screenHeightDouble = screenResolution.getHeight();
        int screenWidth = (int)screenWidthDouble;
        int screenHeight = (int)screenHeightDouble;

        JFrame frame = new JFrame("My Gui"); //creates new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets frame to exit when closed
        frame.setSize(screenWidth,screenHeight);


        //create a menu bar
        JMenuBar menu = new JMenuBar();

        JButton home = new JButton("Home");
        menu.add(home);

        JMenu devices = new JMenu("Devices");
        menu.add(devices);
        JMenuItem scan = new JMenuItem("Scan");
        devices.add(scan);
        JMenuItem history = new JMenuItem("History");
        devices.add(history);

        //adds menu bar to top part of frame
        frame.getContentPane().add(BorderLayout.NORTH, menu);
        frame.setVisible(true);
    }
}
