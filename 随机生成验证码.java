//���������֤�룺

import java.util.Random;

public class Demo5 {
	public static void main(String[] args) {

		 char[] arr={'s','b','g','h','��','ɵ'};

		StringBuilder sb=new StringBuilder();

		Random  random=new Random();

		for(int i=0;i<4;i++){

			int index=random.nextInt(arr.length);
			sb.append(arr[index]);
		}
		System.out.println("��֤��:"+sb);
	} 
}