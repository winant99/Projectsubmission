package devops;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class FizzBuzz {

String[] units = { "", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine",
"Ten", "Eleven", "Twelve",
"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
"Eighteen", "Nineteen" };
String[] tens = {"", "", 
"Twenty",
"Thirty",
"Forty",
"Fifty",
"Sixty",
"Seventy",
"Eighty", // 8
"Ninety" // 9
};

public String convert(int n) {
if (n < 20) {
return units[n];
}
else if (n < 100) 
{
return (tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10]);
}
else {
return units[n/100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
}
}

public static void main(String[] args) throws IOException {

FizzBuzz numberWords=new FizzBuzz() ;
 BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

while( true ) {
 System.out.print( "Enter number (0 to exit): " ) ;
String value = reader.readLine() ;
int number = Integer.parseInt( value ) ;
if(number == 0) {
System.out.println("Bye");
return;
}
else if(number<0 || number>=1000)
{
System.out.println("Invalid number");
return;
}
else {
String result = numberWords.convert(number);
System.out.println(result);
}
}
}
}