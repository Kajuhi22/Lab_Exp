class A 
{ 
void display() 
{ 
System.out.println("Inside A class"); 
} 
} 
class B extends A 
{ 
void display() 
{ 
System.out.println("Inside B class"); 
} 
} 
class C extends A 
{ 
void display() 
{ 
System.out.println("Inside C class"); 
} 
} 
class Runtimedemo 
{ 
public static void main(String args[]) 
{ 
A a1=new A(); 
B b1=new B(); 
C c1=new C(); 
A ref; 
ref=c1; 
ref.display(); 
ref=b1; 
ref.display(); 
ref=a1; 
ref.display(); 
} 
}