import java.util.*;
class Duplicate
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter size of array : ");
n=sc.nextInt();
int a[ ]=new int[n];
System.out.println("Enter elements in array : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("New array = ");
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
a[j]=a[n-1];
n--;
}
}
}
for(int i=0;i<n;i++)
{
 System.out.print(a[i]+" ");
}
}
}