package fractions;

public class Main {
	
	public static void main(String[] args){
	
		int k = 3;
		Fraction[] array = new Fraction[k];
		array[0] = new Fraction(3,2);
		array[1] = new Fraction(5,6);
		array[2] = new Fraction(7,2);
		show(array);
		
	}
	
	public static void show(Fraction[] array){
		for(int i = 0; i<array.length;i++){
			System.out.println(array[i].getM() + "/" + array[i].getN());
		}
	}


}
