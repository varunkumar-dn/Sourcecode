import java.util.Scanner;  
public class CountDigits   
{  
// method for counting the number of digits in number n  
public static int cntDig(int n)  
{  
// The number 0 has the 1 dig.  
if(n == 0)  
{  
    return 1;  
}  
  
if(n < 0)  
{  
    n = -n;  
}  
int cnt = 0;  
while(n != 0)  
{  
    n = n / 10;  
    cnt = cnt + 1;  
}  
  
return cnt;  
  
}  
// main method  
public static void main(String argvs[])   
{  
Scanner scnr = new Scanner(System.in);  
int N = scnr.nextInt();  
  
System.out.println("The total digits in number " + N + " are: " + cntDig(N));  
}  
    
}  
