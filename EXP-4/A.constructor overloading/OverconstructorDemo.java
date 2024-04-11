class A1  
{  
int l,b;  
A1()  
{  
l=10;  
b=20;  
}  
A1(int u,int v)  
{  
l=u;  
b=v;  
}  
int area()  
{  
return l*b;  
}  
}  
class OverconstructorDemo  
{  
public static void main(String args[])  
{  
A1 a1=new A1();  
int r1=a1.area();  
System.out.println("The area is: "+r1);  
A1 a2=new A1(30,40);  
int r2=a2.area();  
System.out.println("The area is: "+r2);  
}  
}  