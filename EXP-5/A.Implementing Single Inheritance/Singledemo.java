 
class A3 
{ 
A3() 
{ 
System.out.println("Inside A3's Constructor"); 
} 
} 
class B3 extends A3 
{ 
B3() 
{ 
System.out.println("Inside B3's Constructor"); 
} 
} 
class Singledemo 
{ 
public static void main(String args[]) 
{ 
B3 b1=new B3(); 
} 
}