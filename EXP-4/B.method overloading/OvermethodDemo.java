class A2  
{  
int l=10,b=30;  
int area()  
{  
return l*b;  
} 
int area(int l,int b)  
{  
return l*b;  
}  
}  
class OvermethodDemo  
{  
public static void main(String args[])  
{  
A2 a1=new A2();  
int r1=a1.area();  
System.out.println("The area is: "+r1);  
int r2=a1.area(5,20);  
System.out.println("The area is: "+r2);  
}  
}  