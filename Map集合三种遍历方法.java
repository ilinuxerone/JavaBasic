Demo03

package cn.itcast.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
	����(����)��
		keySet() 
		values() 
		entrySet() 
*/

public class Demo3 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		//��ӷ���
		map.put("����", "������");
		map.put("����", "�����P");
		map.put("л����","�Ű�֥");
		map.put("����", "�ַｿ");
		/*
		//map�����б�����ʽһ�� ʹ��keySet�������б���//ȱ�㣺 keySet����ֻ�Ƿ��������еļ���û��ֵ�� 
		Set<String> keys = map.keySet();  //keySet() ��Map�����е����м������浽һ��Set���� �ļ��϶����з���---->Set<String> keys=map.keySet();

		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
//ͨ������ȡֵ
			System.out.println("����"+ key+" ֵ��"+ map.get(key));
		}
		
		





		//map���ϵı�����ʽ���� ʹ��values�������� ����//ȱ�㣺 values����ֻ�ܷ������� ��ֵ��û�м���
		Collection<String>  c = map.values(); //values() �����е�ֵ�洢��һ��Collection�����з��ء�

		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			System.out.println("ֵ��"+ it.next());
		}
		*/
		

		//map���ϵı�����ʽ���� entrySet����������
 
		Set<Map.Entry<String,String>>  entrys = map.entrySet(); 
		Iterator<Map.Entry<String,String>> it = entrys.iterator();//���õ�����
		while(it.hasNext()){
			Map.Entry<String,String> en= it.next();
			System.out.println("����"+ en.getKey()+" ֵ��"+ en.getValue());
		}
	}
}