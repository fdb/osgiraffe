package osgiraffe.demolusk;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class DemoluskActivator implements BundleActivator {
	

    public void start(BundleContext context) throws Exception {
        System.out.println("Starting Demolusk");
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping Demolusk");
    }

}
