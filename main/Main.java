package main;

// this is main code 
import exception.InvalidAttendanceException;
import exception.InvalidMarksException;
import model.Student;
public class Main {
    static void calculate (Student s) throws InvalidMarksException,InvalidAttendanceException{
        int sum=0;
        for(int m:s.marks){
            if(m<0 || m>100){
                throw new InvalidMarksException("Invalid marks. Please enter marks between 0 and 100.");
            }
            sum+=m;
        }
        if(s.attendance<0 || s.attendance>100){
            throw new InvalidAttendanceException("Invalid attendance. Please enter attendance between 0 and 100.");
        }
        s.total=sum;
        s.avg=sum/5;
    }

    static void grade(Student s){
        if(s.avg>=90){
            s.grade="A+";
        }else if(s.avg>=80){
            s.grade="A";
        }else if(s.avg>=70){
            s.grade="B";
        }else if(s.avg>=60){
            s.grade="C";

        }else if(s.avg>=50){
            s.grade="D";
        }else if(s.avg>=35){
            s.grade="E";
        }else {
            s.grade="F";
        }
    }

     static void result(Student s){
        boolean fail=false;
        for(int m:s.marks){
            if(m<35){
                fail=true;
            }
        }
        if(s.attendance<75){
            fail=true;
        }

        s.result=fail? "Fail":"Pass";
    }

    static void display(Student s){
        System.out.println("ID: "+s.id);
        System.out.println("Name: "+s.name);
        System.out.println("Total: "+s.total);
        System.out.println("Average: "+s.avg);
        System.out.println("Grade: "+s.grade);
        System.out.println("Result: "+s.result);
    }

    static void rank(Student[] arr){
        for(int i=0;i<arr.length;i++){
            int rank=1;
            for (int j=0;j<arr.length;j++){
                if(arr[j].total>arr[i].total){
                    rank++;
                }
            }
            arr[i].rank=rank;
        }

    }


    public static void main(String[] args){
        try{
        Student[] students=new Student[5];
        students[0]=new Student(1,"Aman",101,"CSE",new int[]{90,80,70,60,50},80);
        students[1]=new Student(2,"Ankit",102,"CSE",new int[]{85,75,65,55,45},70);
        students[2]=new Student(3,"Anshul",103,"CSE",new int[]{80,70,60,50,40},60);
        students[3]=new Student(4,"Anshul",104,"CSE",new int[]{75,65,55,45,35},50);
        students[4]=new Student(5,"Anshul",105,"CSE",new int[]{70,60,50,40,30},40);

        for(Student s:students){
            calculate(s);
            grade(s);
            result(s);  
            display(s);
        }
        rank(students);
    }catch(Exception e){
        System.out.println(e.getMessage());

    }
}
}
