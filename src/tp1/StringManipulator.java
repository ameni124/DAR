package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
        //do your stuff
        String stri="";
        for (int i=s.length()-1;i>=0;i--){
            stri+=s.charAt(i)
        }
        System.out.println("reverse : "+stri);
    }

    public void isPalindrome(){
        //do your stuff
        if(s.reverse()==s)
        System.out.println("isPalindrome : ");
    }

    public void toUpperCase(){
        //do your stuff
        String z = "";

		for (i = 0; i<s.length(); i++) {
			c = s.charAt(i);
			if (c >= 97 && c<= 122) //If ASCII values represent LowerCase, changing to Upper Case
			{
				n = c - 32;
				c = (char) n;
			}
			z = z + c;
		}
        System.out.println("uppercase : "+z);
    }

    public void toLowerCase(){
        //do your stuff
        
        l = "";

		for (i = 0; i<s.length(); i++) {
			c = s.charAt(i);
			if (c >= 65 && c<= 90) //If ASCII values represent UpperCase, changing to Lower Case
			{
				n = c + 32;
				c = (char) n;
			}
			l = l + c;
		}
        System.out.println("lowercase : "+l);
    }

    public void getVowelNumber(){
        //do your stuff
        int count = 0;
        for (int i=0 ; i<s.length(); i++){
         char ch = s.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count ++;
         }
      }
        
        System.out.println("vowelNumber : "+count);
        
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
