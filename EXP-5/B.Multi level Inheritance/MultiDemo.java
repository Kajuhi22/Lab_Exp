class A 
{ 
A() 
{ 
System.out.println("Inside A's Constructor"); 
} 
} 
class B extends A 
{ 
B() 
{ 
System.out.println("Inside B's Constructor"); 
} 
} 
class C extends B 
{ 
C(){ 
System.out.println("Inside C's Constructor"); 
} 
} 
class MultiDemo 
{ 
public static void main(String args[]) 
{ 
C c1=new C(); 
} 
} 