package service;

import domain.Customer;
import domain.Salesman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessFile {
    private FileManager fileManager = new FileManager();
    private List<Customer> customers = new ArrayList();
    private List<Salesman> salesman = new ArrayList();

    public List<String> contentReader() {
        BufferedReader reader;
        List<String> path = fileManager.listFilesInAFolder();
        List<String> lines = new ArrayList();

        try {
            for (String archive : path) {
                reader = new BufferedReader(new FileReader(archive));
                String line = reader.readLine();

                while (line != null) {
                    String[] data = line.split("ç");
                    if (SellDataFactory.checkIfACustomer(Integer.parseInt(data[0]))) {
                        customers.add(new Customer(line));
                    } else if (SellDataFactory.checkIfASalesman(Integer.parseInt(data[0]))) {
                        salesman.add(new Salesman(line));
                    }
                        lines.add(line);
                    line = reader.readLine();
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void generateReportData() {
        List<String> lines = contentReader();

        String homePath = System.getProperty("user.home");
        File folder = new File(homePath + "/data/out/");
        folder.mkdir();

        File file = new File(folder.getAbsoluteFile() + "/arquivoOut.txt");

        try (FileWriter fw = new FileWriter(file, false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println("Quantidade de clientes = " + SellDataFactory.countNumberOfCustomer(customers));
            out.println("Quantidade de vendedores = " + SellDataFactory.countNumberOfSalesman(salesman));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}