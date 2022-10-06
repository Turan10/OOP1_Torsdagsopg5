package Task3;

import Task2.Building;
import Task2.Room;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<Customer>();


    public static void main(String[] args) {

        Customer customer1 = new Customer("Caner", "Turan", "CATU");
        Customer customer2 = new Customer("Cem", "Turan", "CETU");
        Customer customer3 = new Customer("Eren", "Turan", "ERTU");
        Customer customer4 = new Customer("Elias", "Turan", "ELTU");
        Customer customer5 =  new Customer("Yasin", "Turan", "YATU");
        Customer customer6 = new Customer("Hakkan", "Turan", "HATU");


        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);








printCustomer();



}
    public static void printCustomer(){

        for(Customer c: customers){
            System.out.println(c);
        }
        }

    }


