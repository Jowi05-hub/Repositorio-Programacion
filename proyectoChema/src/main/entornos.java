package main;

public class entornos {

	public static void main(String[] args) {
	
		int i=0;
		while(i<100){
			if(i%2==0&&i%3==0&&i%8!=0) {
				System.out.println(i+" ");
			}
			i++;
		}
	}

}
