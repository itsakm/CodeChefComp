import java.io.*;
import java.util.*;


public class Alice_Strange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int L = Integer.parseInt(line[0]);
            int R = Integer.parseInt(line[1]);

            long out_ = strange_sum(L, R);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int s=2;
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else if(n==2)
        {
            return true;
        }
        else if(n%2==0)
        {
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i += 2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;   
        
 }
    static int maxprime(int n)
    {
        int maxprime=-1;
        while(n%2==0)
        {
            maxprime=2;
            n >>= 1;
        }
        for(int i=3;i<=Math.sqrt(n);i += 2)
        {
            while(n%i==0)
            {
                maxprime=i;
                n=n/i;
            }
        }
        if(n>2)
            maxprime=n;
        return maxprime;
    }
    static long temp_function(int z)
    {
        long result=0;
        if(z==1)
            result=result+0;
        else if(isPrime(z))
            result=result+1;
        else
        {
            int x=maxprime(z);
            int y=z/x;
            result=result+(y*temp_function(x)+x*temp_function(y));
        }
        return result;
    }
    static long strange_sum(int l, int r){
       // Write your code here
        long result = 0;
        for(int i=l;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println("i="+i+" j="+j);
                if(i%j==0)
                {
                    int z=i/j;
                    System.out.println("z="+z);
                    result=result+temp_function(z);
                    /*if(z==1)
                        result=result+0;
                    else if(isPrime(z))
                        result=result+1;
                    else
                    {
                        int x=maxprime(z);
                        int y=z/x;
                        result=result+(y*strange_sum(1,x)+x*strange_sum(1,y));
                    }*/
                   /* System.out.println("result="+result);*/
                }
            }
            System.out.println("i="+i+" result="+result);
        }
        return result;
    
    }
}