class Student{
    int id;
    String name;
    int mark;
    //parameter constructor
    Student(int i,String n, int m){
        id=i;
        name=n;
        mark=m;
    }
    void displayDetails(){
        System.out.println("your ID:-"+id);
        System.out.println("your NAME:-"+name);
        System.out.println("your MARK:-"+mark);
    }
    boolean isPassed(){
        if (mark>=50){
    return true;
        }else{
        return false;
        }
    }

}
class StudentDemo{
    static void comparemarks(Student s1,Student s2){
        if(s1.mark > s2.mark){
            System.out.println(s1.name+"score higher marks");
        }else if(s2.mark > s1.mark){
            System.out.println(s2.mark+"score higher marak");
        }else{
            System.out.println("both student have equal mark");
        }
    }

    public static void main(String[]args){
        Student student1 = new Student(202402184,"deshan",85);
        Student student2 = new Student(202402133,"kavishka",84);
        //display details
        student1.displayDetails();
        System.out.println("status"+(student1.isPassed()?"passed":"failed"));


        student2.displayDetails();
        System.out.println("status"+(student2.isPassed()?"passed":"failed"));
        System.out.println();
        //massage passing
        comparemarks(student1,student2);
    }

}