package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerStore {

    private final ArrayList<Passenger> passengerList;

    public PassengerStore(String fileName) {
        this.passengerList = new ArrayList<>();
        loadPassengerDataFromFile(fileName);
    }

    public List<Passenger> getAllPassengers() {
        return this.passengerList;
    }

    public void displayAllPassengers() {
        for (Passenger p : this.passengerList) {
            System.out.println(p.toString());
        }
    }

    /**
     * Read Passenger records from a text file and create and add Passenger
     * objects to the PassengerStore.
     */
    private void loadPassengerDataFromFile(String filename) {

        try {
            Scanner sc = new Scanner(new File(filename));
//           Delimiter: set the delimiter to be a comma character ","
//                    or a carriage-return '\r', or a newline '\n'
            sc.useDelimiter("[,\r\n]+");

            while (sc.hasNext()) {
                int id = sc.nextInt();
                String name = sc.next();
                String email = sc.next();
                String phone = sc.next();
                double latitude = sc.nextDouble();
                double longitude = sc.nextDouble();

                // construct a Passenger object and add it to the passenger list
                passengerList.add(new Passenger(id, name, email, phone, latitude, longitude));
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("Exception thrown. " + e);
        }
    }

    public <string> void findpassengerbyName(string name)
    {
        for(Passenger p: passengerList)
        {
            if(p.getName().equals(name))
            {
                System.out.println(p);
            }
        }
    }

    //findPassengerByID




    // TODO - see functional spec for details of code to add

    public void add(String name, String email, String phone,
                    double latitude, double longitude) {
        passengerList.add(new Passenger(name, email, phone, latitude, longitude));
    }


    public Passenger findpassengerbyID(int id)
    {
        for (Passenger p : passengerList)
        {
            if (p.getId() == id)
            {
                return p;
            }
        }
        return null;
    }





    public void findPassengerByName(String name) {
    }

    public void addPassenger(String input_name, String email, String phonenumber, double latitude, double longtitude) {
    }

    public void deletePassenger(String name, String email) {
    }

    public int findPassengerIdByName(String name) {
        return 0;
    }

    public void SortPassengersbyName() {
    }
} // end class