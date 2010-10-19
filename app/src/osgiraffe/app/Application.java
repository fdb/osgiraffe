package osgiraffe.app;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import javax.swing.*;

public class Application implements BundleActivator {

    private JFrame frame;

    public void start(BundleContext context) throws Exception {
        System.out.println("Starting OSGiraffe Application");
        frame = new JFrame("OSGiraffe");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New"));
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping OSGiraffe Application");
        frame.dispose();
    }

}
