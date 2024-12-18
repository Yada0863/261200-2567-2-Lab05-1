import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name,int year,int month,int day ){
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }

    public LocalDate getDob(){
        return dob;
    }

    public void displayInfo() {
        System.out.println(name +" was born on " + dob);
    }
}
