import java.io.*;

class Employee{

static double gross(double basic){
double da=basic*40/100;
double hra=basic*20/100;
return basic+da+hra;
}

static double net(double basic){
double da=basic*40/100;
double hra=basic*20/100;
double pf=basic*12/100;
return basic+da+hra-pf;
}

public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter number of employees: ");
int n=Integer.parseInt(br.readLine());

int id[]=new int[n];
String name[]=new String[n];
double basic[]=new double[n];

for(int i=0;i<n;i++){
System.out.println("Enter details of employee "+(i+1));

System.out.print("ID: ");
id[i]=Integer.parseInt(br.readLine());

System.out.print("Name: ");
name[i]=br.readLine();

System.out.print("Basic Salary: ");
basic[i]=Double.parseDouble(br.readLine());
}

double highest=net(basic[0]);
double lowest=net(basic[0]);
int high=0;
int low=0;
double total=0;

System.out.println("\nID\tName\tBasic\tDA\tHRA\tPF\tGross\tNet");

for(int i=0;i<n;i++){
double da=basic[i]*40/100;
double hra=basic[i]*20/100;
double pf=basic[i]*12/100;
double gross=gross(basic[i]);
double netsalary=net(basic[i]);

System.out.println(id[i]+"\t"+name[i]+"\t"+basic[i]+"\t"+da+"\t"+hra+"\t"+pf+"\t"+gross+"\t"+netsalary);

total=total+netsalary;

if(netsalary>highest){
highest=netsalary;
high=i;
}

if(netsalary<lowest){
lowest=netsalary;
low=i;
}
}

double average=total/n;

System.out.println("\nHighest Paid Employee: "+name[high]);
System.out.println("Lowest Paid Employee: "+name[low]);
System.out.println("Average Salary: "+average);
}
}