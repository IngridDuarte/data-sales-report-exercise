package domain;

public class Salesman {
    private int id;
    private String cpf;
    private String name;
    private String salary;

    public Salesman(String line) {
        String[] data;
        data = line.split("ç");
        this.id = Integer.parseInt(data[0]);
        this.cpf = data[1];
        this.name = data[2];
        this.salary = data[3];
    }

    public int getId() {
        return id;
    }

}
