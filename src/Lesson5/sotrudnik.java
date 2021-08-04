package Lesson5;

import javax.naming.Name;

public class sotrudnik {
    private static final int cur_year = 2021;
    private String name;
    private String secondName;
    private String surname;
    private String dolgnost;
    private String email;
    private String phone;
    private int salary;
    private int birthAge;

    public sotrudnik(String name,
                     String secondName,
                     String surname,
                     String dolgnost,
                     String email,
                     String phone,
                     int salary,
                     int birthAge ){
        this.name = name;
        this.secondName = secondName;
        this.surname =  surname;
        this.dolgnost = dolgnost;
        this.email =    email;
        this.phone =  phone;
        this.salary = salary;
        this.birthAge = birthAge;

    }

    int getAge (){
        return cur_year - birthAge;
    }
    int getSalary(){
        return salary;
    }

    String getName(){
        return name;
        }
    String getSecondName() {
    return secondName;
    }

    String getSurname(){
        return surname;
    }
    String getDolgnost(){
        return dolgnost;
    }
    String getEmail(){
        return email;
    }
    String getPhone(){
        return phone;
    }

    String getAll(){
        return this.name + " " + this.surname + " " + this.secondName + " "+
                this.dolgnost+ " " + this.email+ " " + this.phone+ " " +
                this.salary+" "+ getAge() +"YO"+ " ";

    }


}
