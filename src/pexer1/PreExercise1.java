/**
 * MALANG, KATRINA ISABEL A.
 *
 * Problem
 * Create a program that will lookup a variable number of hostnames/IP addresses:
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
        Scanner kbd = new Scanner(System.in);
        String input = ;

        InetAddress[] addressArr = InetAddress.getAllByName(inputvar);
        System.out.println(
                "Host 1 - Type IP address/Hostname: " + addressArr);

        int num = addressArr.length;
        System.out.println(
                "Number of Hosts/IPs" + addressArr.length);
        System.out.println(
                "Host name IP Address");
        for (InetAddress add: addressArr){
            System.out.println(add.getHostAddress());
        }
    }
}
