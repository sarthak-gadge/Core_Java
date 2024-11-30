package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainEmployee {

	public static void main(String[] args) {

		try {
			Class empClass = Class.forName("Reflection.Employee");

			System.out.println("Class name :" + empClass.getName());
			System.out.println("Super Class :" + empClass.getSuperclass());

			System.out.println("Fields of Employee :");

			Field[] fields = empClass.getDeclaredFields();
			for (Field field : fields) {
				System.out.println("field name :" + field.getName() + "\tData Type :" + field.getType());
				System.out.println("=======================================================================");
			}

			System.out.println("Methods of Employee :");
			Method[] methods = empClass.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println("Method Name :" + method.getName() + "\treturn Type :" + method.getReturnType());

				System.out.println("==========================================================================");
			}

			System.out.println("Constructors: ");
			Constructor[] constructors = empClass.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				System.out.println("Constructor Name :" + constructor.getName() + "\tconstructor specifier :"
						+ constructor.getModifiers());
				System.out.println("Number of Parameter :" + constructor.getParameterCount());
				System.out.println("================================================================");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
