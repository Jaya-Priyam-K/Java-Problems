import java.util.*;

class Main {
    
    public static void main(String[] args) throws InterruptedException{
        
        int h = 11;
        int m = 59;
        int s = 50;
        while(true)
        {
            System.out.printf("\r %02d : %02d : %02d",h, m, s);
            System.out.flush();
            Thread.sleep(1000);
            
            s = s+1;
            if(s==60)
            {
                m = m+1;
                s = 0;
            }
            if(m==60)
            {
                h = h+1;
                m = 0;
                s = 0;
            }
            if(h==12)
            {
                h = 0;
                m = 0;
                s = 0;
            }
        }
        
    }
}
