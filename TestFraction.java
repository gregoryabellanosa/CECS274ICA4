/**
 * Program to test the add(), subtract(), multiply(), and divide() methods 
 * using four new methods to check if the math is correct or not. Doesn't consider
 * simplified fractions
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class TestFraction {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(1 , 2);
		Fraction f2 = new Fraction(3 , 4);
		Fraction f3 = new Fraction(3 , 2);
		
		Fraction result1 = f1.add(f3);
		Fraction answer1 = new Fraction(4 , 2);
		checkFractionAddition(f1, f3, result1, answer1);
				
		Fraction result2 = f1.add(f2);
		Fraction answer2 = new Fraction(10 , 8);
		checkFractionAddition(f1, f2, result2, answer2);
		
		Fraction result3 = f1.subtract(f2);
		Fraction answer3 = new Fraction(-2 , 8);
		checkFractionSubtraction(f1, f2, result3, answer3); 	
		
		Fraction result4 = f1.subtract(f3);
		Fraction answer4 = new Fraction(-2 , 2);
		checkFractionSubtraction(f1, f3, result4, answer4);
		
		Fraction result5 = f1.multiply(f2);
		Fraction answer5 = new Fraction(3 , 8);
		checkFractionMultiplication(f1, f2, result5, answer5);
		
		Fraction result6 = f1.multiply(f3);
		Fraction answer6 = new Fraction(3 , 4);
		checkFractionMultiplication(f1, f3, answer6, result6);
		
		Fraction result7 = f1.divide(f2);
		Fraction answer7 = new Fraction(4 , 6);
		checkFractionDivision(f1, f2, result7, answer7);
		
		Fraction result8 = f1.divide(f3);
		Fraction answer8 = new Fraction(2 , 6);
		checkFractionDivision(f1, f3, result8, answer8);
		
	}
		
	
	/**
	 * Checks and prints the results of the sums
	 * 
	 * @param f1 first fraction in sum
	 * @param f2 second fraction in sum
	 * @param res resulting fraction of add method
	 * @param ans expected result of sum
	 */
	public static void checkFractionAddition(Fraction f1, Fraction f2, Fraction res, Fraction ans)
	{
		if (res.equals(ans))
		{
			System.out.print("Correct: ");
			System.out.println(f1 + " + " + f2 + " = " + ans);
		}
		else
		{
			System.out.print("Incorrect: ");
			System.out.println(f1 + " + " + f2 + " != " + ans);
		}
	}
	
	/**
	 * Checks and prints the results of the differences
	 * 
	 * @param f1 first fraction in difference
	 * @param f2 second fraction in difference
	 * @param res resulting fraction of subtract method
	 * @param ans expected result of difference
	 */
	public static void checkFractionSubtraction(Fraction f1, Fraction f2, Fraction res, Fraction ans)
	{
		if (res.equals(ans))
		{
			System.out.print("Correct: ");
			System.out.println(f1 + " - " + f2 + " = " + ans);
		}
		else
		{
			System.out.print("Incorrect: ");
			System.out.println(f1 + " - " + f2 + " != " + ans);
		}
	}
	
	/**
	 * Checks and prints the results of the products
	 * 
	 * @param f1 first fraction in product
	 * @param f2second fraction in product
	 * @param res resulting fraction of multiply method
	 * @param ans expected result of product
	 */
	public static void checkFractionMultiplication(Fraction f1, Fraction f2, Fraction res, Fraction ans)
	{
		if(res.equals(ans))
		{
			System.out.print("Correct: ");
			System.out.println(f1 + " x " + f2 + " = " + ans);
		}
		else
		{
			System.out.print("Incorrect: ");
			System.out.println(f1 + " x " + f2 + " != " + ans);
		}
	}
	
	/**
	 * Checks and prints the results of the products
	 * 
	 * @param f1 first fraction in quotient
	 * @param f2second fraction in quotient
	 * @param res resulting fraction of divide method
	 * @param ans expected result of quotient
	 */
	public static void checkFractionDivision(Fraction f1, Fraction f2, Fraction res, Fraction ans)
	{
		if(res.equals(ans))
		{
			System.out.print("Correct: ");
			System.out.println(f1 + " / " + f2 + " = " + ans);
			
		}
		else
		{
			System.out.print("Incorrect: ");
			System.out.println(f1 + " / " + f2 + " = " + ans);
		}
	}

}
