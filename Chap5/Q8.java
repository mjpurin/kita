import java.util.*;
public class Q8{
	public static void main(String[] args) {
		int[] data=new int[10];
		for(int i=0;i<data.length;i++){
			data[i]=new Scanner(System.in).nextInt();
		}
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
