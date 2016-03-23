package cn.whstu02;
import java.util.LinkedList;
class Person{
	String name;
	int age;
	//构造器
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "{名字："+name+"年龄："+age+"}";
	}
}
public class Demo02 {

	public static void main(String[] args) {
		//创建persons放到linkedlist中
		LinkedList<Person> persons=createPerson();
		//根据年龄排序的方法
		sortAge(persons);
	}

	private static void sortAge(LinkedList<Person> persons) {
		for (int i = 0; i < persons.size()-1; i++) {
			for (int j = i+1; j < persons.size(); j++) {
				//根据索引值获得person
				Person p1=persons.get(i);
				Person p2=persons.get(j);
				if(p1.age>p2.age){
					//交换位置
					persons.set(i, p2);
					persons.set(j, p1);
				}
			}
		}
		System.out.println(persons);
	}

	private static LinkedList<Person> createPerson() {
		LinkedList<Person> list=new LinkedList<Person>();
		list.add(new Person("张三", 25));
		list.add(new Person("李四", 23));
		list.add(new Person("王五", 24));
		return list;
	}
}