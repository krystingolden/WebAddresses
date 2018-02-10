package com.pluralsight;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    /*
    https://programmingbydoing.com/
    Web addresses - Assignment #163
     */

    //Create an arraylist to store the addresses
    ArrayList<String> addresses = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        //Fill the array list with addresses from a file
        main.populateAddresses();
        //Display all addresses
        main.displayAddresses();
    }

    public void populateAddresses() throws Exception{
        //Get the path to the file and open it
        try (BufferedReader br = Files.newBufferedReader(Paths.get("FakeAddresses.txt"))) {

            //Instantiate a new address object
            //Populate the variables for that object with strings from the file
            //Add the address to the array list
            Address uno = new Address();
            uno.populateNewAddress(br.readLine(), br.readLine(), br.readLine(), br.read());
            addAddress(uno);

            Address dos = new Address();
            dos.populateNewAddress(br.readLine(), br.readLine(), br.readLine(), br.read());
            addAddress(dos);

            Address tre = new Address();
            tre.populateNewAddress(br.readLine(), br.readLine(), br.readLine(), br.read());
            addAddress(tre);

            Address quattro = new Address();
            quattro.populateNewAddress(br.readLine(), br.readLine(), br.readLine(), br.read());
            addAddress(quattro);

            Address cinco = new Address();
            cinco.populateNewAddress(br.readLine(), br.readLine(), br.readLine(), br.read());
            addAddress(cinco);

            //If there is an issue opening the file, it will throw a message
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    public void addAddress(Address address){
        addresses.add(address.getAddress());
    }

    public void displayAddresses(){
        for(String address : addresses)
            System.out.println(address);
    }
}
