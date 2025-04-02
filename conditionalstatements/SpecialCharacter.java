//6)write a program to take the character from the user and display weather it contains Specialcharator or not ?

class SpecialCharacter{

	public static void main(String[] args){
	
	char ch='_';
	
	if(!((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')||(ch>='0' && ch<='9'))){
		
	System.out.println(ch+"is a Special character ");
	}else{
	
		System.out.println(ch+"is not a  Special Character");
	}
	
	
    }

}