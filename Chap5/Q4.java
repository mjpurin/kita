import java.util.*;
public class Q4{
	public static void main(String[] args){
		int[] data=new int[10];
		for(int i=0,sum=0;i<data.length && sum<=100;i++){
			data[i]=new Scanner(System.in).nextInt();
			sum+=data[i];
		}
		for(int d:data){
			if(d !=0){
				System.out.println(d);
			}
		}
	}
}
