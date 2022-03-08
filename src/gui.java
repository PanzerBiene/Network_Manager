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

        createHome(screenWidth, screenHeight);
        createDevices(screenWidth, screenHeight);
        createLogs(screenWidth, screenHeight);
        createTest(screenWidth, screenHeight);
    }


    public static void createHome(int screenWidth, int screenHeight)
    {
        JFrame frame = new JFrame("Network Manager"); //creates new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets frame to exit when closed
        frame.setSize(screenWidth,screenHeight);


        //create a menu bar
        JMenuBar menu = new JMenuBar();

        JButton home = new JButton("Home");
        home.setBackground(Color.blue);
        menu.add(home);

        JButton devices = new JButton("Devices");
        menu.add(devices);

        JButton logs = new JButton("Logs");
        menu.add(logs);

        JButton test = new JButton("Test");
        menu.add(test);

        //adds menu bar to top part of frame
        frame.getContentPane().add(BorderLayout.NORTH, menu);
        frame.setVisible(true);
    }

    public static void createDevices(int screenWidth, int screenHeight)
    {
        JFrame frame = new JFrame("Network Manager"); //creates new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets frame to exit when closed
        frame.setSize(screenWidth,screenHeight);


        //create a menu bar
        JMenuBar menu = new JMenuBar();

        JButton home = new JButton("Home");
        menu.add(home);

        JButton devices = new JButton("Devices");
        devices.setBackground(Color.blue);
        menu.add(devices);

        JButton logs = new JButton("Logs");
        menu.add(logs);

        JButton test = new JButton("Test");
        menu.add(test);

        //adds menu bar to top part of frame
        frame.getContentPane().add(BorderLayout.NORTH, menu);
        frame.setVisible(true);
    }

    public static void createLogs(int screenWidth, int screenHeight)
    {
        JFrame frame = new JFrame("Network Manager"); //creates new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets frame to exit when closed
        frame.setSize(screenWidth,screenHeight);


        //create a menu bar
        JMenuBar menu = new JMenuBar();

        JButton home = new JButton("Home");
        menu.add(home);

        JButton devices = new JButton("Devices");
        menu.add(devices);

        JButton logs = new JButton("Logs");
        logs.setBackground(Color.blue);
        menu.add(logs);

        JButton test = new JButton("Test");
        menu.add(test);

        //adds menu bar to top part of frame
        frame.getContentPane().add(BorderLayout.NORTH, menu);
        frame.setVisible(true);
    }

    public static void createTest(int screenWidth, int screenHeight)
    {
        JFrame frame = new JFrame("Network Manager"); //creates new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets frame to exit when closed
        frame.setSize(screenWidth,screenHeight);


        //create a menu bar
        JMenuBar menu = new JMenuBar();

        JButton home = new JButton("Home");
        menu.add(home);

        JButton devices = new JButton("Devices");
        menu.add(devices);

        JButton logs = new JButton("Logs");
        menu.add(logs);

        JButton test = new JButton("Test");
        test.setBackground(Color.blue);
        menu.add(test);

        //adds menu bar to top part of frame
        frame.getContentPane().add(BorderLayout.NORTH, menu);
        frame.setVisible(true);
    }
}
