public class Recursion
{

    public Recursion()
    {
    }

    public String name(){return "Zhang,Charles";}

    public double sqrt(double n)
    {
	if(n<0)
	    {throw new IllegalArgumentException("value must be positive!");}
	if(n==0){return 0;}
	return sqrthelper(n,1);
    }

    public static double sqrthelper(double n,double guess)
    {
	if(Math.abs((guess*guess-n)/n)<=0.000001)
	    {
		return guess;
	    }
	else
	    {
		guess = ( n / guess + guess) / 2;
	      return sqrthelper(n,guess);
	    }
    }


}
