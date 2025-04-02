//7)write a program to take the character from the user and display weather it contains  an alphbet or digit or Special charater  ?

class AlphaDigitSpecial{

	public static void main(String[] args){
	
	char ch='a';
	
	if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')||(ch>='0' && ch<='9')){
			
		if(ch>='0'&& ch<='9'){
			System.out.println(ch+"is a Digit ");
		}else{
			System.out.println(ch+"is a Alphabet ");
		}

		
	}else{
	
		System.out.println(ch+"is  a  Special character");
	}
	
	
    }

}