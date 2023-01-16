/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;


public class StudentList {

    public static void main(String[] args) {
        // Store and print the student list
        Student[] list = new Student[3]; // decleration array of object.
        Student s1 = new Student();
        s1.setName("Aryan");
        s1.setAge(18);
        
        Student s2 = new Student();
        s2.setName("Dhruv");
        s2.setAge(19);
        
        Student s3 = new Student();
        s3.setName("Mitali");
        s3.setAge(19);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    }
    
}
