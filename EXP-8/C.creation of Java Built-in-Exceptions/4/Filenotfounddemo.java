 
//(iv)FileNotFound Exception 
import java.io.*; 
class Filenotfounddemo 
{ 
public static void main(String args[]) 
{ 
try 
{ 
File file = new File("E://file.txt"); 
FileReader fr = new FileReader(file); 
}
catch (FileNotFoundException e) 
{ 
System.out.println(e); 
} 
} 
}