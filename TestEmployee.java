
class Employee extends Person
{
double  annualsalary;
int year;
String ninum;
Employee()
{

annualsalary=10000.32;
year=2000;
ninum="1234";
}

 double  getannualsalary()
{  return annualsalary;
}
int  getyear()
{  return year;
}
String  getninum()
{  return ninum;
}

}
class TestEmployee
{ public static void main(String args[])
{
   Employee e=new Employee();
System.out.println("The employee name is "+e.name);
System.out.println("The employee annual salary is"+e.getannualsalary());
System.out.println("The employee started to work in the year "+e.getyear());
System.out.println("The employee national insurance number is "+e.getninum());
}
}