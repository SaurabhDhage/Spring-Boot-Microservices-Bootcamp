import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment_no17 {
    static class Student{
        int roll_number;
        String name;
        String section;
        int marks;
        Student(int roll_number,String name,String section,int marks){
            this.roll_number=roll_number;
            this.name=name;
            this.section=section;
            this.marks=marks;
        }
       void printRecords(){
           System.out.println("Roll Number:"+roll_number);
           System.out.println("Name:"+name);
           System.out.println("Section:"+section);
           System.out.println("Marks:"+marks);
       }
    }
    public static void main(String[] args) {
       List<Student> list=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       String[] section ={"A","B","C","D"};
        System.out.println("How many Record do you want to insert:");
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
           int rand = ThreadLocalRandom.current().nextInt(0, 5);

           list.add(new Student(sc.nextInt(),sc.next()
                   ,section[rand],sc.nextInt()));
       }
        for (Student student : list) {
            student.printRecords();
        }

       list.sort(new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.roll_number - o2.roll_number;
           }
       });
        for (Student student : list) {
            student.printRecords();
        }
        System.out.println("Topper Among all section:"+Collections.max(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.marks-o2.marks;
            }
        }));
        int max=0,rollNo=0;
        for (Student student : list) {
            if(student.section.equals("B") && student.marks>max){
                max=student.marks;
                rollNo=student.roll_number;
            }
        }
        System.out.println("Topper :"+rollNo);

        int count=0;
        for (Student student : list) {
           if(student.section.equals("C") || student.section.equals("D")){
               count++;
           }
        }
        System.out.println(count);
    }
}
