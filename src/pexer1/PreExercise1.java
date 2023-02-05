/**
 * MALANG, KATRINA ISABEL A.
 * <p>
 * Problem
 * Create a program that will look up a variable number of hostnames/IP addresses:
 * • The program will ask the name of a host to search and then immediately display the hostnames
 * and IP addresses of the host given by the user
 * • The program will then ask the user if he/she wants to search for another host (if yes, repeat the
 * process above, otherwise, exit the program)
 */

package pexer1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class PreExercise1 {

    public static void main(String[] args) throws UnknownHostException
    {
        // Creating a new Scanner object that will read from the standard input stream.
        Scanner kbd = new Scanner(System.in);
        char repeat;
        int host =1;

        // Asking the user to input a hostname or IP address.
        do {
            System.out.print("Host "  + host + "- Type IP address/Hostname: ");
            String hostname = kbd.nextLine();
            host++;

            // Getting all the IP addresses of the hostname given by the user.
            InetAddress[] addresses = InetAddress.getAllByName(hostname);
            System.out.println("Number of Hosts/IPs: " + addresses.length);
            System.out.println("Host name\tIP Address");

            // A for-each loop that iterates through the array of InetAddress objects.
            for (InetAddress address : addresses) {
                System.out.println(address.getHostName() + "\t" + address.getHostAddress());
            }
            // Asking the user if he/she wants to search for another host.
            System.out.print("Search another [y/n]? ");
            // Getting the first character of the string returned by `kbd.nextLine()`.
            repeat = kbd.nextLine().charAt(0);
        } while (repeat == 'y');
        kbd.close();
    }
}
