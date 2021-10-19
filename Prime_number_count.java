class Prime
{
public static void main(String args[])
{
int i,j,a=10,count,pc=0;
for(i=1;i<=a;i++)
{
   count=0;
   for(j=1;j<=i;j++)
   {
      if(i%j==0)
      {
         count++;
      } 
   }
   if(count==2)
   {
      pc++;
   }
}
System.out.println(pc);
}
}
