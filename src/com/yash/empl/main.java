package com.yash.empl;
import java.util.*;
public class main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        EmployeedaoInt dao=new EmpldaoImpl();
        System.out.println("welcome to employee management system");
        do{
            System.out.println("1.Add Employee\n" +
                    "2. Show All Employees\n"+
                    "3. Show Employee Based on ID\n" +
                    "4. Update the Employee\n"+
                    "5. Delete the Employee");
            System.out.println("enter choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    employee emp=new employee();
                    System.out.println("enter id:");
                    int id =sc.nextInt();
                    System.out.println("enter name:");
                    String name  =sc.nextLine();
                    name+=sc.nextLine();
                    System.out.println("enter age:");
                    int age =sc.nextInt();
                    System.out.println("enter salary:");
                    double salary =sc.nextDouble();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setAge(age);
                    emp.setSalary(salary);
                    dao.CreatEmpl(emp);
                    break;
                case 2:
                    dao.ShowAllEmpl();
                    break;
                case 3:
                    System.out.println("enter employee id");
                    int emid=sc.nextInt();
                    dao.ShowEmplBaseId(emid);
                    break;
                case 4:
                    System.out.println("enter id to update the details:");
                    int emid1=sc.nextInt();
                    System.out.println("enter the new name:");
                    String name1=sc.nextLine();
                    name1+=sc.nextLine();
                    dao.UpdateEmpl(emid1,name1);
                    break;
                case 5:
                    System.out.println("enter the id to delete");
                    id=sc.nextInt();
                    dao.DeleteEmpl(id);
                    break;

                case 6:
                    System.out.println("thanks for using our system");
                    System.exit(0);
                default:
                    System.out.println("enter valid choice");
                    break;

            }

        }
        while(true);
    }
}
