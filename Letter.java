
public enum Letter 
{
	A(1),B(3),C(3),D(2),E(1),F,G(2),H,I(1),J,K,L(1),M,
	N(1),O(1),P,Q,R(1),S(1),T(1),U(1),V,W,X,Y,Z;
	
	int points;
	
	Letter(int points)
	{
		this.points = points;
	}
	
	
	public char toChar()
	{
		return this.lowercaseValue;
	}
}
