package assignment;

import java.time.LocalDate;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String month;
    private int day;
    private int year;
    private int height;
    private int weight;
    private String gender;

    public HealthRecords(String firstName, String lastName, String month, int day, int year, int height, int weight, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
    public void setFirstName(String firstName ){this.firstName = firstName;}
    public String getFirstName(){return firstName;}

    public void setLastName(String lastName){this.lastName = lastName;}
    public String getLastName(){return lastName;}

    public void setMonth(String month){this.month = month;}
    public String getMonth(){return month;}

    public void setDay(int day) {this.day = day;}
    public int getDay(){return day;}

    public void setYear(int year){this.year = year;}
    public int getYear(){return year;}

    public void setHeight(int height){ this.height = height;}
    public int getHeight(){return height;}

    public void setWeight(int weight){this.weight = weight;}
    public int getWeight(){return weight;}

    public void setGender(String gender){this.gender =gender;}
    public String getGender(){return gender;}

   public int getAge(){
       return LocalDate.now().getYear() - year;
   }

   public int getMaximumHeartRate(){
        return 220 - getAge();
   }
   public double getTargetRate(){
        return getMaximumHeartRate()* 0.85;
   }
   public int getBMI(){
        return (weight * 703)/(height * height);
   }



}
