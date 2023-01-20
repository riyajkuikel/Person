package model;


import java.util.ArrayList;

public class Child  extends parent {

    public String First_name;
    ArrayList<Hobbies> Hobbies;
    public int age;

    public Child(String first_name, ArrayList<model.Hobbies> hobbies, int age) {
        First_name = first_name;
        Hobbies = hobbies;
        this.age = age;
    }


    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public ArrayList<model.Hobbies> getHobbies() {
        return Hobbies;
    }

    public void setHobbies(ArrayList<model.Hobbies> hobbies) {
        Hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void  get_Fullname() {


        System.out.println("Nnname " + "\t" + "Family_name");
        System.out.println(this.First_name + "\t" + this.Family_name);


        ArrayList<Hobbies> Hobby = this.Hobbies;
        for (Hobbies h : Hobby) {
            System.out.println(h.getName());

        }

    }
}