package Javapackage.Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ResourceBundle;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
        /*Class c1 = Class.forName("Javapackage.Reflect.User01");
        User01 rt = (User01)c1.newInstance();
        rt.setName("zhangsan");
        rt.setAge(2);
        System.out.println(rt);*/



        //BufferedReader br = new BufferedReader(new FileReader("E:\\File\\CodeFile\\JavaBasic\\src\\main\\java\\Javapackage\\Reflect\\files.properties"));
        /*ResourceBundle rb = ResourceBundle.getBundle("files");
        String user01name = rb.getString("className");
        Class c = Class.forName(user01name);
        Object o = c.newInstance();
        System.out.println(o);*/
        /*StringBuilder sb = new StringBuilder();
        Class c = Class.forName("java.lang.String");
        sb.append(Modifier.toString(c.getModifiers()));
        sb.append(" class ");
        sb.append(c.getSimpleName());
        sb.append(" extends ");
        sb.append(c.getSuperclass().getSimpleName());
        sb.append(" implements");
        Class[] interfaces = c.getInterfaces();

        if (interfaces.length>0) {
            for (int i = 0 ; i < interfaces.length ; i++) {
                Class aClass = interfaces[i];
                sb.append(" "+aClass.getSimpleName());
                if(i!=interfaces.length-1){
                    sb.append(",");
                }
            }
        }
        sb.append("{\n");
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            sb.append("    "+Modifier.toString(f.getModifiers())+" "+f.getType()+" "+f.getName()+"\n");
        }
        sb.append("}");
        System.out.println(sb);*/

        //User02 u = new User02();
       /* u.name = "zhangsan";
        System.out.println(u.name);*/

        /*Class c = Class.forName("Javapackage.Reflect.User01");
        Field fieldName = c.getDeclaredField("name");
        fieldName.set(u, "lisi");
        System.out.println(fieldName.get(u));*/

        /*Class c = Class.forName("Javapackage.Reflect.User01");
        Field fieldAge = c.getDeclaredField("age"); //通过name获取age的field
        fieldAge.setAccessible(true);//穿透包装
        fieldAge.set(u, 30);//通过反射给对象赋值
        System.out.println(fieldAge.get(u));//通过反射读取值*/

        /*Class c = Class.forName("Javapackage.Reflect.User02");
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.print(Modifier.toString(m.getModifiers()) + " "+ m.getReturnType().getSimpleName()+" " + m.getName()+"(");
            Parameter[] parameters = m.getParameters();
            for (Parameter p : parameters) {
                System.out.println(p.getType().getSimpleName()+" " +p.getName()+" )");
            }
            System.out.println("\n");
        }*/
        //使用反射机制调用方法
        /*Method declaredMethod = c.getDeclaredMethod( "sums" , String.class, int.class);
        Object zhangsan =declaredMethod.invoke(u, "zhangsan", 12);
        System.out.println(zhangsan);*/

        /*Class c = Class.forName("Javapackage.Reflect.User02");
        //System.out.println(Modifier.toString(c.getModifiers()));
        Constructor constructors = c.getConstructor(String.class,int.class);
        System.out.println(constructors.newInstance("zhangsan",12));*/

        /*ResourceBundle rb = ResourceBundle.getBundle("files");
        String className = rb.getString("classNames");
        //获取泛型的信息
        Animal<String,Integer> animal = new Cat();
        Class cla = Class.forName(className.toString());
        Class<Cat> cla1 = Cat.class;
        System.out.println(cla.getSimpleName());*/

    }
}

