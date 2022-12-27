public class Notebook {
    String brand;
    Integer ram;
    Integer hdd;
    String os;
    String color;

    public Notebook(String brand, int ram, int hdd, String os, String color){
        this.brand = brand;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }

    public String print(Notebook notebook){
       String lp = "------------" + "\n" + "Брэнд: " + notebook.brand + "\n" + "Цвет: " + notebook.color + "\n"  + "ОС: " + notebook.os +
                "\n" + "RAM: " + notebook.ram + "\n" + "HDD: " + notebook.hdd;
        return lp;
    }
}

