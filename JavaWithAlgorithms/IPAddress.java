/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mysample;

import java.net.InetAddress;

/**
 *
 * @author User
 */
public class IPAddress {
    public static void main(String args[]) throws Exception
    {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP of my system is := "+IP.getHostAddress());
    } 
}
