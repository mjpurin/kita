import java.util.*;
public class Q2{
	public static void main(String[] args){
		int[] data=new int[10];
		for(int i=0;i<data.length;i++){
			data[i]=new Scanner(System.in).nextInt();
		}
		for(int i=data.length-1;i>=0;i--){
			System.out.println(data[i]);
		}
	}
}
