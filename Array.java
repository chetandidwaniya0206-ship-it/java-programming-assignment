import java.io.*;

class Array{
public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int arr[]=new int[10];

System.out.println("Enter 10 numbers:");

for(int i=0;i<10;i++){
arr[i]=Integer.parseInt(br.readLine());
}

int max=arr[0];
int min=arr[0];
int sum=0;
int even=0;
int odd=0;

for(int i=0;i<10;i++){
if(arr[i]>max)
max=arr[i];

if(arr[i]<min)
min=arr[i];

sum=sum+arr[i];

if(arr[i]%2==0)
even++;
else
odd++;
}

double avg=(double)sum/10;

System.out.println("Maximum: "+max);
System.out.println("Minimum: "+min);
System.out.println("Average: "+avg);
System.out.println("Even Numbers: "+even);
System.out.println("Odd Numbers: "+odd);

System.out.print("Enter number to search: ");
int search=Integer.parseInt(br.readLine());

boolean found=false;

for(int i=0;i<10;i++){
if(arr[i]==search){
found=true;
break;
}
}

if(found)
System.out.println("Number found");
else
System.out.println("Number not found");

System.out.println("Array in reverse:");

for(int i=9;i>=0;i--){
System.out.print(arr[i]+" ");
}
}
}