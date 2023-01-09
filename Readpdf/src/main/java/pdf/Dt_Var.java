package pdf;

import org.openqa.selenium.By;

public class Dt_Var {
	int b=40; // instance var
static int empid = 101;
//non-static methods
public void m1() {
//DT Var VV----To Represent Data  
int a =10;//Local Var    
System.out.println("M1 Executed");
// int   string
System.out.println(a  + " Local Var"); //10
System.out.println(empid+" static var");
}
public void m2() {
System.out.println("M2 Executed");
System.out.println(b+" instance var");
System.out.println(empid+" static var");
}
public void m3() {
System.out.println("M3 Executed");
System.out.println(b+"instance var");
}
//static method
public static void st() {
	 System.out.println("static method executed");    
	}
public static void main(String args[]) {
System.out.println("Main method executed");
//non-static : access by using object
Dt_Var m = new Dt_Var();
m.m1();
m.m2();
m.m3();
//static : access by using classname: no need of to create an object
Dt_Var.st();
}
}
















