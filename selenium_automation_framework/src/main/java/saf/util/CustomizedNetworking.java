package saf.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CustomizedNetworking {

	public static String getHostAddress() {
		try {
            InetAddress ipAddr = InetAddress.getLocalHost();
           // System.out.println(ipAddr.getHostAddress());
            
            return ipAddr.getHostAddress();
            
        } catch (UnknownHostException ex) {
            
        	ex.printStackTrace();
            return null;
        }
	}
}
