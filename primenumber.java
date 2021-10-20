package precourse;

public class primenumber {

	public primenumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,n=0,i=1,j=1;
		while(n<25) {
			j=1;
			count=0;
			while(j<=i) {
				if(i%j==0)
					count++;
				j++;
			}
			if(count==2) {
				System.out.printf("%d",i);
				n++;
			}
			i++;
		}

	}

}
