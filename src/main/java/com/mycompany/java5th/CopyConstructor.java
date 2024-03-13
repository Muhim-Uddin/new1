/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java5th;

class Student{
    int R;
    String N;
    float M;
    Student(int R, String N, float M){
    
    }
    Student(Student s){
    R=s.R;
    N=s.N;
    M=s.M;
    }
    void Display(){
        System.out.println("Roll"+R);
        System.out.println("Name"+N);
        System.out.println("Name"+M);
        
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Wahid",75.5f);
        System.out.println("Record");
        s1.Display();
        
    }
    
}
