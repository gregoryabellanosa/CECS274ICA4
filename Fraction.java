/**
 * Provides a set of methods to perform basic mathematical operations using fractions
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class Fraction {
	
	//numerator
	private int num;
	
	//denominator
	private int den;
	
	/**
	 * Fraction object constructor
	 * 
	 * @param n numerator
	 * @param d denominator
	 */
	public Fraction(int n, int d)
	{
		num = n;
		den = d;
	}
	
	/**
	 * Displays a fraction
	 */
	public void printFraction()
	{
		System.out.print( num + "/" + den );
	}
	
	/**
	 * Adds the implicit fraction to the explicit fraction and returns the resulting
	 * fraction
	 * 
	 * @param f fraction to add this fraction to
	 * @return the sum of the two fractions
	 */
	public Fraction add(Fraction f)
	{
		int n = 1;
		int d = 1;
		//performs if the denominators are the same
		if (this.den == f.den)
		{
			n = this.num + f.num;
			d = this.den;
		}
		//performs when the denominators are different
		else
		{
			n = this.num * f.den + f.num * this.den;
			d = this.den * f.den;
		}
		//places the new numerator and denominator values into a new Fraction object
		Fraction res = new Fraction(n, d);
		return res;
	}
	
	/**
	 * Subtracts the explicit fraction from the implicit fraction and returns the
	 * resulting fraction
	 * 
	 * @param f fraction to subtract from implicit fraction
	 * @return the difference between the two fractions
	 */
	public Fraction subtract(Fraction f)
	{
		int n = 1;
		int d = 1;
		//performs if the denominators are the same
		if (this.den == f.den)
		{
			n = this.num - f.num;
			d = this.den;
		}
		//performs when the denominators are different
		else
		{
			n = this.num * f.den - f.num * this.den;
			d = this.den * f.den;
		}
		//places the new numerator and denominator values into a new Fraction object
		Fraction res = new Fraction(n, d);
		return res;
	}
	
	/**
	 * Multiplies the implicit fraction with the explicit fraction and returns
	 * the resulting product of the two fractions
	 * 
	 * @param f fraction to multiply this fraction with
	 * @return the product of the two fractions
	 */
	public Fraction multiply(Fraction f)
	{
		int n = this.num * f.num;
		int d = this.den * f.den;
		Fraction res = new Fraction(n, d);
		return res;
	}
	
	/**
	 * Divides the explicit fraction from the implicit fraction and returns the 
	 * resulting fraction
	 * 
	 * @param f fraction to divide from implicit fraction
	 * @return the quotient between the two fractions
	 */
	public Fraction divide(Fraction f)
	{
		int n = this.num * f.den;
		int d = this.den * f.num;
		Fraction res = new Fraction(n, d);
		return res;
	}
	
	/**
	 * Returns a string of the fraction
	 */
	@Override
	public String toString()
	{
		String s = num + "/" + den;
		return s;
	}

	/** 
	 * Compares two fractions and returns true if they are equal
	 * 
	 * @param o explicit fraction to be compared
	 * @return
	 */
	@Override
	public boolean equals(Object o)
	{
		if (o == this)
		{
			return true;
		}
		if (!(o instanceof Fraction))
		{
			return false;
		}
		Fraction f = (Fraction) o;
		return this.num == f.num && this.den == f.den;
	}
	
}
