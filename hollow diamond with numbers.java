class Main {
    public static void main(String[] args) {
        int count = 1;
        for(int i=1; i<4; i++)
        {
            for(int j=1; j<5-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++)
            {
                if(k==1 || k==i*2-1)
                {
                     System.out.print(count);
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            count++;
        }
        for(int i=1; i<5; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=9-2*i; k++)
            {
                if(k==1 || k==9-2*i)
                {
                   System.out.print(count); 
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count--;
        }
    }
}
