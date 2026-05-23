package model;

public class Student {
    public int id;
    public String name;
    public int roll;

    public int[] marks=new int[5];
    public String department;

    public int total;
    public double avg;
    public String grade;
    public String result;
    public double attendance;
    public int rank;

    public Student(int id,String name, int roll,String department,int[] marks, double attendance){
        this.id=id;
        this.name=name;
        this.roll=roll;
        this.department=department;
        this.marks=marks;
        this.attendance=attendance;

    }
}
