import java.lang.Math;
public class PerformanceTest{
public static void main(String [] args){
int n = 10;
int sum1, sum2;
int i;
int j;
//1st segment
for (n=1; n<= 1000000; n*=10)
{
sum1 = 0;
long startTime = System.nanoTime();
for (i = n; i>=1; i--)
for (j = 1; j<=100; j++)
sum1++;
long estimated = System.nanoTime() - startTime;
System.out.print("[n="+ n + "]");
System.out.print("estimated for the 1st program segment is: ");
System.out.println(estimated);
}
//2nd segment
for (n=1; n<= 1000000; n*=10)
{
sum2 = 0;
long startTime = System.nanoTime();
for (i = 1; i< Math.pow(2,n); i=i*2)
sum2=sum2+i;
long estimated2 = System.nanoTime() - startTime;
System.out.print("[n="+ n + "]");
System.out.print("estimated for the 2nd program segment is: ");
System.out.println(estimated2);
}
}
}