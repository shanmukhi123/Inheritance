class Person
{ 
 String tname="Krish Roy";
   }
class Student
{
  String sname="Giri";
}

 class Teacher extends Person
{
int salary=20000;
String sub="Chemistry";
Teacher(){
System.out.println("The faculty name is:"+tname);}
}

class CollegeStudent extends Student
{
int year=2;
String major="Electrical Engineering";
CollegeStudent(){
 System.out.println("The student name is:"+sname);}
}
class I3
{public static void main(String args[])
{
  Teacher t=new Teacher();
System.out.println("His salary is "+t.salary+" and he teaches "+t.sub+" subject");

CollegeStudent c=new CollegeStudent();
System.out.println("He is studying "+c.year+" year in "+c.major+" Department");
}
}
 