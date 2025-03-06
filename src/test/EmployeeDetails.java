package test;

import java.util.ArrayList;
import java.util.List;

class Employee
{
	int id;
	String ename;
	double salary;
	String desg;
	String add;
	public Employee(int id, String ename, double salary, String desg, String add) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
		this.desg = desg;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + ", desg=" + desg + ", add=" + add
				+ "]";
	}
	
	
	
}


public class EmployeeDetails {

	public static void main(String[] args) {
	List<Employee> e= new ArrayList<>();
	e.add(new Employee(111,"Vidya",50000D,"Developer","Hyderabad"));
	e.add(new Employee(112,"Amruta",40000D,"Frontened-Developer","Nashik"));
	e.add(new Employee(113,"Pallavi",55000D,"Manager","Pune"));
	e.add(new Employee(114,"Dhanshri",45000D,"Tester","Chennai"));
	
	System.out.println("Employee Details Are:");
	for(Employee emp: e)
	{
		System.out.println(emp);
	}
	
	for(int i=0;i<e.size();i++)
	{
		for(int j=i+1;j< e.size();j++)
		{
			if(e.get(i).salary > e.get(j).salary )
			{
				Employee temp = e.get(i);
				e.set(i, e.get(j));
				e.set(j, temp);
			}
		}
	}
	
	System.out.println("After Sorting...");
	for(Employee emp: e)
	{
		System.out.println(emp);
	}
	}

}
