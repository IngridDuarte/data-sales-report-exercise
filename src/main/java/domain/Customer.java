package domain;

public class Customer {
    private int id;
    private String cnpj;
    private String name;
    private String businessArea;

    public Customer(String line) {
        String[] data;
        data = line.split("ç");
        this.id = Integer.parseInt(data[0]);
        this.cnpj = data[1];
        this.name = data[2];
        this.businessArea = data[3];
    }

    public int getId() {
        return id;
    }
}
