package cn.whstu02;
import java.util.LinkedList;
class Person{
	String name;
	int age;
	//������
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "{���֣�"+name+"���䣺"+age+"}";
	}
}
public class Demo02 {

	public static void main(String[] args) {
		//����persons�ŵ�linkedlist��
		LinkedList<Person> persons=createPerson();
		//������������ķ���
		sortAge(persons);
	}

	private static void sortAge(LinkedList<Person> persons) {
		for (int i = 0; i < persons.size()-1; i++) {
			for (int j = i+1; j < persons.size(); j++) {
				//��������ֵ���person
				Person p1=persons.get(i);
				Person p2=persons.get(j);
				if(p1.age>p2.age){
					//����λ��
					persons.set(i, p2);
					persons.set(j, p1);
				}
			}
		}
		System.out.println(persons);
	}

	private static LinkedList<Person> createPerson() {
		LinkedList<Person> list=new LinkedList<Person>();
		list.add(new Person("����", 25));
		list.add(new Person("����", 23));
		list.add(new Person("����", 24));
		return list;
	}
}