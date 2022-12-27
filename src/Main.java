import java.util.*;


public class Main {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("asus", 16, 1024, "Windows", "black");
        Notebook n2 = new Notebook("acer", 16, 512, "Windows", "white");
        Notebook n3 = new Notebook("lenovo", 32, 2048, "linux", "black");
        Notebook n4 = new Notebook("asus", 64, 2048, "Windows", "gray");
        Notebook n5 = new Notebook("apple", 16, 1024, "mac", "black");

        HashSet<Notebook> laptops = new HashSet<>(Arrays.asList(n1, n2, n3, n4, n5));

        Main m = new Main();

        Map<Integer, String> criter = new HashMap<>();
        criter.put(1, "Показать все ноутбуки");
        criter.put(2, "Выбрать по оперативной памяти");
        criter.put(3, "Выбрать по жесткому диску");
        criter.forEach((k, v) -> System.out.println(k + " - " + v));
        int num = m.getChoise();
        if (num == 1) {
            m.showLaptopsAll(laptops);
        } else if (num == 2) {
            m.showLaptopsRam(laptops);
        } else if (num == 3) {
            m.showLaptopsHdd(laptops);
        } else {
            System.out.println("Ошибка выбора");
        }
    }

    public int getChoise() {
        System.out.print("Сделайте выбор: ");
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
        return num;
    }
    public  void showLaptopsHdd(HashSet<Notebook>laptops) {
        Map<Integer, Integer> hdds = new HashMap<>();
        hdds.put(1, 1024);
        hdds.put(2, 2048);
        hdds.put(3, 512);
        hdds.forEach((k, v) -> System.out.println(k + " - " + v + "gb"));
        int num = getChoise();
        for (Notebook n : laptops) {
            if (hdds.get(num).equals(n.hdd)) {
                System.out.println(n.print(n));
            }
        }
    }

    public  void showLaptopsRam(HashSet<Notebook> laptops) {
        Map<Integer, Integer> rams = new HashMap<>();
        rams.put(1, 16);
        rams.put(2, 32);
        rams.put(3, 64);
        rams.forEach((k, v) -> System.out.println(k + " - " + v + "gb"));
        int num = getChoise();
        for (Notebook n : laptops) {
            if (rams.get(num).equals(n.ram)) {
                System.out.println(n.print(n));
            }
        }
    }


    public  void showLaptopsAll(HashSet<Notebook> lapiops){
        for (Notebook n : lapiops){
                System.out.println(n.print(n));
            }
    }
    }


