import java.io.*;

class Bill{
public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter Consumer Name: ");
String name=br.readLine();

System.out.print("Enter Consumer Number: ");
String number=br.readLine();

System.out.print("Enter Units Consumed: ");
int units=Integer.parseInt(br.readLine());

double bill;

if(units<=100){
bill=units*3;
}
else{
if(units<=200){
bill=100*3+(units-100)*5;
}
else{
if(units<=500){
bill=100*3+100*5+(units-200)*7;
}
else{
bill=100*3+100*5+300*7+(units-500)*10;
}
}
}

if(bill>5000){
bill=bill+(bill*5/100);
}

System.out.println("Consumer Name: "+name);
System.out.println("Consumer Number: "+number);
System.out.println("Total Bill Amount: Rs. "+bill);
}
}