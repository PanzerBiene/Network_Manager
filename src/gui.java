import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        //createDevices(screenWidth, screenHeight);
        //createLogs(screenWidth, screenHeight);
        //createTest(screenWidth, screenHeight);
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
        //lambda version of action listener
        home.addActionListener(e -> createHome(screenWidth, screenHeight));
        menu.add(home);


        JButton devices = new JButton("Devices");
        devices.addActionListener(e -> createDevices(screenWidth, screenHeight));
        menu.add(devices);


        JButton logs = new JButton("Logs");
        logs.addActionListener(e -> createLogs(screenWidth, screenHeight));
        menu.add(logs);


        JButton test = new JButton("Test");
        test.addActionListener(e -> createTest(screenWidth, screenHeight));
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
        home.addActionListener(e -> createHome(screenWidth, screenHeight));
        menu.add(home);


        JButton devices = new JButton("Devices");
        devices.setBackground(Color.blue);
        devices.addActionListener(e -> createDevices(screenWidth, screenHeight));
        menu.add(devices);


        JButton logs = new JButton("Logs");
        logs.addActionListener(e -> createLogs(screenWidth, screenHeight));
        menu.add(logs);


        JButton test = new JButton("Test");
        test.addActionListener(e -> createTest(screenWidth, screenHeight));
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
        home.addActionListener(e -> createHome(screenWidth, screenHeight));
        menu.add(home);


        JButton devices = new JButton("Devices");
        devices.addActionListener(e -> createDevices(screenWidth, screenHeight));
        menu.add(devices);

        JButton logs = new JButton("Logs");
        logs.setBackground(Color.blue);
        logs.addActionListener(e -> createLogs(screenWidth, screenHeight));
        menu.add(logs);


        JButton test = new JButton("Test");
        test.addActionListener(e -> createTest(screenWidth, screenHeight));
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
        home.addActionListener(e -> createHome(screenWidth, screenHeight));
        menu.add(home);


        JButton devices = new JButton("Devices");
        devices.addActionListener(e -> createDevices(screenWidth, screenHeight));
        menu.add(devices);


        JButton logs = new JButton("Logs");
        logs.addActionListener(e -> createLogs(screenWidth, screenHeight));
        menu.add(logs);


        JButton test = new JButton("Test");
        test.setBackground(Color.blue);
        test.addActionListener(e -> createTest(screenWidth, screenHeight));
        menu.add(test);

        //adds menu bar to top part of frame
        frame.getContentPane().add(BorderLayout.NORTH, menu);
        frame.setVisible(true);
    }
}
