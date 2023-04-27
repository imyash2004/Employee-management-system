package com.yash.empl;

public interface EmployeedaoInt {
    void CreatEmpl(employee emp);
    public void ShowAllEmpl();

    public void ShowEmplBaseId(int id);
    public void UpdateEmpl(int id, String name);
    public void DeleteEmpl(int id);



}
