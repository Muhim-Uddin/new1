/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java5th;

class Student{

    Student(int par, String wahid, float par1) {
    }
    protected int Roll;
    protected String Name;
    protected float Mark;
    protected void GetData(){
        Roll=980;
        Name="Tahsin";
        Mark=85.5f;  
    }
    protected void Display()
    {
    System.out.println("Roll" +Roll);
    System.out.println("Roll" +Name);
    System.out.println("Roll" +Mark);
    }
    }
public class pro {
    public static void main(String[] args) {
        Student s=new Student(101, "Wahid", 75.5F);
        s.GetData();
        s.Display();
    }
}

