import java.util.*;

class Student
{   
    private String name;
    private int sid;
    public Student(String name,int sid)
    {
        this.name = name;
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", sid=" + sid + '}';
    }
    
    
}

class SortRoll implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getSid() > o2.getSid()) return 1;
        else return -1;
    }
}

class SortName implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
    

public class SortedLinkedList 
{
    public static void main(String[] args)
    {
        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student("Raunaq",20));
        list.add(new Student("Raj",21));
        list.add(new Student("Ab",1));
        list.add(new Student("A",24));
        
        Collections.sort(list,new SortRoll());
        list.forEach((e) -> {
            System.out.println(e);
        });
        
        
    }
}
