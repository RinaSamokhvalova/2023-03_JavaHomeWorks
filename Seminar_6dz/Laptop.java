package HomeWorks.Seminar_6dz;

public class Laptop {
    // Поля:
    private String brand;           // Производитель
    private String model;           // Модель
    private String colore;          // Цвет
    
    private String screenSize;      // Диагональ экрана 
    private String graphicsCard;    // Видеокарта
    private String cpu;             //  Processor (CPU) / Процессор
    private int ram;                // RAM(random-access memory) / Оперативная память
    private int hdd;                // Размер жесткого диска
    private String oSystem;         //Operating System / Операционная система
    
    private boolean inStock;        //наличие
    private int price;              // цена


    public Laptop(String brand, String model, String colore, String screenSize, String graphicsCard, String cpu, int ram, int hdd, String oSystem, boolean inStock, int price) {
        this.brand = brand;
        this.model = model;
        this.colore = colore;
        this.screenSize = screenSize;
        this.graphicsCard  = graphicsCard;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.oSystem = oSystem;
        this.inStock = inStock;
        this.price = price;
    }



    @Override
    public String toString() {
        return  "\n" + brand + " - " + model + ", цвет: " + colore + " [" + screenSize + " Inch, " + graphicsCard + ", ОС: " + oSystem + ", " + ram + "Gb  RAM, " + hdd + "Gb  SSD, " + cpu + "] - " + price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getHdd() {
        return hdd;
    }
 
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setoSystem(String oSystem) {
        this.oSystem = oSystem;
    }

    public String getoSystem() {
        return oSystem;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public boolean getInStock() {
        return inStock;
    }

}