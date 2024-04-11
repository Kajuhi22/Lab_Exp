//constructor with parameters 
class A  
{  
int l,b;  
A(int u,int v)  
{  
l=u;  
b=v;  
}  
int area()  
{  
return l*b;  
}  
}  
class ConstructorDemo2 
{  
public static void main(String args[])  
{  
A a1=new A(10,20);  
int r=a1.area();  
System.out.println("The area is: "+r);  
}  
}  