package ie.atu.week6;

public class PassengerTest
{
public String Title;
public String ID;
public String Name;
public int Phone;
public int Age;

public PassengerTest(String Title,String ID, String Name, int Phone, int Age)
{
    this.Age = Age;
    this.ID = ID;
    this.Name = Name;
    this.Phone = Phone;
    this.Title = Title;
}

    public String getID() {
        return ID;
    }

    public int getAge() {
        return Age;
    }

    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }

    public int getPhone() {
        return Phone;
    }
}
