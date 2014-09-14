import java.io.*;


import java.lang.*;
import java.util.*;

public class asgncsv11
 {
  public static void main (String args[]) 
   {

try
   {
 String file2=" ";
 Scanner in = new Scanner(System.in);


file2 = "/Users/Anirudh/Documents/file.txt";

File fi = new File(file2);
if(!fi.exists())
  {
    fi.createNewFile();
  }

//FileWriter fw = new FileWriter (fi.getAbsoluteFile()); //throws FileNotFoundException e ;

String input = "";
System.out.println("***** ENTER THE PATH OF THE INPUT FILE *****");
input = in.nextLine();
PrintStream p = new PrintStream(fi);
FileReader r1 = new FileReader(input);
BufferedReader r=new BufferedReader(r1); 
double  pop;
String line="";
long size = fi.length();
int i;
while((line=r.readLine())!=null)

 {
  line=r.readLine();
  String[] csv=line.split(",");
//csv=line.split("//s+");
  String country=csv[0];
  String capital=csv[1];
  String  population=csv[2];
  String language =csv[3];
  System.out.println(country);
  pop=Double.parseDouble(population);

for(i=0;i<=size;i++)
 {    
   p.println("the capital of country "+ country+" "+"is"+capital+" "+"with a population of"+pop+" "+"and the language spoken is language"+""+language);
 }
 }


r.close();
p.close();

}
 catch(IOException  g)
  { 
   System.out.println(g);
  }
 System.out.println("**** FILE WRITING PROCESS COMPLETED ****");
 }
}


