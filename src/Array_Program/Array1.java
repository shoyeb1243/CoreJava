package Array_Program;

public class Array1 {

	public static void main(String[] args) {
		int b=10;
		int a[]= {10,5,3,7,5,1,7,2};
		for(int i=0;i< a.length;i++) {
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==b){
					System.out.println(i+"+"+j+"="+b);
				}
			}
	}
	}
}
