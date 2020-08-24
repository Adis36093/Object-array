/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author adis3
 */
class Employee {
    private String name,address;
    private int date;
    public Employee(String n, int d, String a){
        name=n;
        date=d;
        address=a;
    }

    public String getName(){
        return name;
    }
    
    public int getDate(){
        return date;
    }
    
    public String getAddress(){
        return address;
    }
}

public class Emp{
    public static void main(String[] args) {
    Employee e1 = new Employee("Robert", 1994,"64C- WallsStreet");
    Employee e2 = new Employee("Sam", 2000,"68d- WallsStreet");
    Employee e3 = new Employee("John", 1999,"26B- WallsStreet");
    System.out.println("Name\tYear of joining\t\tAddress");
    System.out.println(e1.getName()+"\t"+e1.getDate()+"\t\t\t"+e1.getAddress());  
    System.out.println(e2.getName()+"\t"+e2.getDate()+"\t\t\t"+e2.getAddress());  
    System.out.println(e3.getName()+"\t"+e3.getDate()+"\t\t\t"+e3.getAddress()); 
 }
   
}
