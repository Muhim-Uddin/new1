package com.mycompany.java5th;
    class Student{
    public int Roll;
    public String Name;
    public float Mark;
    public void GetData(){
        Roll=980;
        Name="Tahsin";
        Mark=85.5f;  
    }
    void Display()
    {
    System.out.println("Roll" +Roll);
    System.out.println("Roll" +Name);
    System.out.println("Roll" +Mark);
            
    }
    }
public class Java5th {
    public static void main(String[] args) {
        Student s=new Student(101, "Wahid", 75.5F);
        s.GetData();
        s.Display();
        
    }
}
