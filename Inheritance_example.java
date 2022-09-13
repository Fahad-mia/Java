public class Inheritance {
    public static void main(String arg[])    
    {
        CarLicense obj = new CarLicense("Red", 4434453.34, "corola", "232-23-432");
        obj.display();
        obj.setCarname("Nuha");
        obj.setColor("Blue");
        obj.setPrice(344534343.23);
        obj.setLicense("23-23-6443");
        System.out.println("\nAfter setting all value: ");
        obj.display();

    }
}

class Car{
    private String color;
    private double price;
    private String carName;
    public Car(String c, double p,String name)
    {
        color = c;
        price = p;
        carName = name;
    }
    public void setColor(String cr)
    {
        color = cr;
    }
    public String getColor()
    {
        return color;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public double getPrice()
    {
        return price;
    }
    public void setCarname(String name)
    {
        carName = name;
    }
    public String getCarname()
    {
        return carName;
    }

    public void display()
    {
        System.out.println(" Carname : "+carName+"\n Color : "+color+"\n Car price : "+price);
    }
}

class CarLicense extends Car
{
    private String LicenseNumber;
    public CarLicense(String c, double p, String cname, String License)
    {
        super(c, p, cname);
        LicenseNumber = License;
    }

    public void setLicense(String li)
    {
        LicenseNumber = li;
    }
    public String getLicense()
    {
        return LicenseNumber;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println(" License no : "+LicenseNumber);
    }
}
