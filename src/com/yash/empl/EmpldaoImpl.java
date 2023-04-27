package com.yash.empl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpldaoImpl implements EmployeedaoInt
{
    Connection con;
    @Override
    public void CreatEmpl(employee emp) {
    con= DBconnection.CreateDBconnection();
    String query= "insert into emplyee values(?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,emp.getId());
            pst.setString(2, emp.getName());
            pst.setInt(3,emp.getAge());
            pst.setDouble(4,emp.getSalary());
            int cnt=pst.executeUpdate();
            if(cnt!=0){
                System.out.println("employee inserted successfully");
                System.out.println("============================================");
            }

        }
        catch (Exception e){
            e.printStackTrace();

        }
    }

    @Override
    public void ShowAllEmpl() {
con= DBconnection.CreateDBconnection();
String query="select * from emplyee";
        System.out.println("employee details below");
try{
    Statement stmt=con.createStatement();
    ResultSet  result=stmt.executeQuery(query);
    while(result.next()){
        System.out.format("%d\t%s\t%d\t%f\n",result.getInt(1),result.getString(2),result.getInt(3),result.getDouble(4));
        System.out.println("=====================================================");

    }
    System.out.println("=====================================================");
}

catch(Exception e){
    e.printStackTrace();
}
    }

    @Override
    public void ShowEmplBaseId(int id) {
        con= DBconnection.CreateDBconnection();
        String query="select* from emplyee where id ="+id;
        try{
            Statement stmt=con.createStatement();
            ResultSet  result=stmt.executeQuery(query);
            while(result.next()){
                System.out.format("%d\t%s\t%d\t%f\n",result.getInt(1),result.getString(2),result.getInt(3),result.getDouble(4));
            }
            System.out.println("=====================================================");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void UpdateEmpl(int id, String name) {
        con=DBconnection.CreateDBconnection();
        String query="update emplyee set name=? where id=?";
        try{
            PreparedStatement pstm =con.prepareStatement(query);
            pstm.setString(1,name);
            pstm.setInt(2,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0){
                System.out.println("successully updated");

            }
            else{
                System.out.println("wrong id");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void DeleteEmpl(int id) {
        con=DBconnection.CreateDBconnection();
        String query="delete from emplyee where id =?";

        try {
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0){
                System.out.println("deleted successfully");
            }
            else{
                System.out.println("wrong id");
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
