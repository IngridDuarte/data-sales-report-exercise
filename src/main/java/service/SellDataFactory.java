package service;

import domain.Customer;
import domain.Salesman;

import java.util.List;

public class SellDataFactory {

    public static boolean checkIfACustomer(int id) {
        return (id == 002);
    }

    public static int countNumberOfCustomer(List<Customer> customers) {
        int count = 0;

        for (Customer customer : customers) {
            if (checkIfACustomer(customer.getId())) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkIfASalesman(int id) {
        return (id == 001);
    }

    public static int countNumberOfSalesman(List<Salesman> salesmanList) {
        int count = 0;

        for (Salesman salesman : salesmanList) {
            if (checkIfASalesman(salesman.getId())) {
                count++;
            }
        }
        return count;
    }
}
