class Finallydemo2
{ 
public static void main(String args[]) 
{ 
try 
{ 
int a=10,b=5; 
int c=a/b; 
System.out.println(c); 
} 
catch(ArithmeticException e) 
{ 
System.out.println(e); 
} 
finally 
{ 
System.out.println("This is inside finally block"); 
} 
} 
}