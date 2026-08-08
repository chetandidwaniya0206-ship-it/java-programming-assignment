import java.io.*;

class Number{
static void prime(int n){
boolean flag=true;

if(n<2)
flag=false;

for(int i=2;i<=n/2;i++){
if(n%i==0){
flag=false;
break;
}
}

if(flag)
System.out.println("Prime");
else
System.out.println("Not Prime");
}

static void palindrome(int n){
int temp=n;
int rev=0;

while(n>0){
int d=n%10;
rev=rev*10+d;
n=n/10;
}

if(temp==rev)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}

static void armstrong(int n){
int temp=n;
int sum=0;

while(n>0){
int d=n%10;
sum=sum+d*d*d;
n=n/10;
}

if(temp==sum)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}

static void sumDigits(int n){
int sum=0;

while(n>0){
sum=sum+n%10;
n=n/10;
}

System.out.println("Sum of Digits: "+sum);
}

static void reverse(int n){
int rev=0;

while(n>0){
rev=rev*10+n%10;
n=n/10;
}

System.out.println("Reverse: "+rev);
}

public static void main(String a[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter number: ");
int n=Integer.parseInt(br.readLine());

int choice;

do{
System.out.println("\n1. Prime");
System.out.println("2. Palindrome");
System.out.println("3. Armstrong");
System.out.println("4. Sum of Digits");
System.out.println("5. Reverse");
System.out.println("6. Exit");

System.out.print("Enter choice: ");
choice=Integer.parseInt(br.readLine());

switch(choice){
case 1:
prime(n);
break;

case 2:
palindrome(n);
break;

case 3:
armstrong(n);
break;

case 4:
sumDigits(n);
break;

case 5:
reverse(n);
break;

case 6:
System.out.println("Exit");
break;

default:
System.out.println("Invalid Choice");
}
}while(choice!=6);
}
}