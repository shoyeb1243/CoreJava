package Array_Program;

public class String1 {

	public static void main(String[] args) {
		
		  String str="My name"; String[] words=str.split(" "); StringBuilder re=new
		  StringBuilder(); for(String str2 : words) { StringBuilder stringBuilder=new
		  StringBuilder(str2); re.append(stringBuilder.reverse()+" "); } String
		  rString=re.toString().trim(); System.out.println(rString);
		 
	String string="silentBoyShoyeb";
	String[] string2=string.split("(?=[A-Z])");
	for(String str3 : string2) {
		System.out.println(str3);
	int a=19;
	for(int i=1;i<=10;i++) {
		System.out.println(a*i);
	}
	
	
	}
	
	}
}
