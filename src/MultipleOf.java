public class MultipleOf {

    //This is the main function
    public static void main(String[] args)
    {


        String mThree="Get it";
        String mFive="Got it";
        String mTen="Good";


        for(int counter=1;counter<=100;counter++)
        {

            if(counter%3==0)
            {
                System.out.print(mThree);
            }
            if(counter%5==0)
            {
                System.out.print(mFive);
            }

           if(counter%10==0)
           {
               System.out.print(mTen);
           }


            if((counter %3!=0)&&(counter %5!=0)&&(counter%10!=0))
            {
                System.out.print(counter);
            }

               System.out.println(" ");

           }







        }

    }

