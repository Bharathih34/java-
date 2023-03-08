package reversingstring;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
java.lang.String s1="p";
java.lang.String s2=" ";	
for(int i=0;i<s1.length();i++) {
	s2=s1.charAt(i)+s2;
	System.out.println("the reverse of "+s1+" is "+s2);
}
	
	}

}
