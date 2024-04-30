public class Capsule{
	public static void main(String[] args){

		Person taro=new Person("山田太郎",20);
		System.out.println(taro.getName());

		taro.setName("花子");
		System.out.println(taro.getName());

		Person yamada=new Person("山田太郎",20);
		System.out.println(yamada.getAge());

		yamada.setAge(30);
		System.out.println(yamada.getAge());
	}
}