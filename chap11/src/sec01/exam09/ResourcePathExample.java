package sec01.exam09;

public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz = ResourcePathExample.class;
		//Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("Photo1.jpg").getPath();
		
		System.out.println(photo1Path);
		
		String photo2Path = clazz.getResource("images/photo02.jpg").getPath();
		System.out.println(photo2Path);

	}

}
