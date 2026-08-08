import java.io.*;

class Grade{
public static void main(String a[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter marks of subject 1: ");
int m1=Integer.parseInt(br.readLine());

System.out.print("Enter marks of subject 2: ");
int m2=Integer.parseInt(br.readLine());

System.out.print("Enter marks of subject 3: ");
int m3=Integer.parseInt(br.readLine());

System.out.print("Enter marks of subject 4: ");
int m4=Integer.parseInt(br.readLine());

System.out.print("Enter marks of subject 5: ");
int m5=Integer.parseInt(br.readLine());

if(m1<0||m1>100||m2<0||m2>100||m3<0||m3>100||m4<0||m4>100||m5<0||m5>100){
System.out.println("Invalid marks. Marks should be between 0 and 100.");
return;
}

int total=m1+m2+m3+m4+m5;
double percentage=(double)total/500*100;

System.out.println("Total Marks: "+total);
System.out.println("Percentage: "+percentage);

if(percentage>=90)
System.out.println("Grade: A+");
else if(percentage>=80)
System.out.println("Grade: A");
else if(percentage>=70)
System.out.println("Grade: B");
else if(percentage>=60)
System.out.println("Grade: C");
else if(percentage>=50)
System.out.println("Grade: D");
else
System.out.println("Grade: Fail");

if(percentage>=50)
System.out.println("Result: Pass");
else
System.out.println("Result: Fail");
}
}