/*
���󣺶���һ����������һ����������һ��Ҫ���ҵ�Ŀ��Ԫ�أ�����Ҫ���ظ�Ŀ��Ԫ����
�����е�����ֵ�����Ŀ��Ԫ�ز����������У���ô����-1��ʾ��


�۰���ҷ�(���ַ�): ʹ��ǰ���������������顣
*/

class Demo12 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,16,19,23,54};
		//int index = searchEle(arr,23);
		int index = halfSearch(arr,54);
		System.out.println("Ԫ�����ڵ�����ֵ�ǣ�"+ index);
	}
	
	public static int halfSearch(int[] arr, int target){
		//�������������ֱ��¼�����С���м�Ĳ��ҷ�Χ����ֵ
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while(true){
			if(target>arr[mid]){
				min = mid+1;
			}else if(target<arr[mid]){
				max = mid -1;
			}else{
				//�ҵ���Ԫ��
				return mid;
			}
			//û���ҵ������
			if (max<min){
				return -1;
			}
			//���¼����м�����ֵ
			mid = (min+max)/2;
		}
	}

	/*public static int searchEle(int[] arr, int target){
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
	*/
}