package com.mycompany.java5th;


class Student{
    private int Roll;
    private String Name;
    private float Mark;
    private void GetData(){
        Roll=980;
        Name="Tahsin";
        Mark=85.5f;  
    }
    void Display()
    {
        GetData();
    System.out.println("Roll" +Roll);
    System.out.println("Roll" +Name);
    System.out.println("Roll" +Mark);
            
    }
    }
public class priv {
    public static void main(String[] args) {
        Student s=new Student(101, "Wahid", 75.5F);
        s.Display();
    }
}
