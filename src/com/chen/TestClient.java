package com.chen;

import java.lang.reflect.Field;

import java.lang.reflect.Method;



public class TestClient {
	public static void main(String[] args) {
		/*Flower f = new Flower("鲜花");
		GirlFriend<Flower> gf = new GirlFriend<Flower>();
		gf.buyGit(f);
		System.out.println(f.name);*/
		
		/*GirlFriend<Shit> myGrilFriend = new GirlFriend<Shit>();
		//buyGit用了泛型， 所以可以是任何一种类型
        myGrilFriend.buyGit(new Shit("狗屎"));
        Shit gift = myGrilFriend.getGIT();
        System.out.println(gift.name);
        
        List list = new ArrayList();
        list.add("hhhh");
        list.add("eeee");
        list.add("wwww");
        for (int i = 0; i < list.size(); i++) {
            // 每次取数据 都需要进行强转操作
            String object = (String) list.get(i);
            System.out.println(object);
        }

        List list2 = new ArrayList();
        list2.add("hhhh");
        list2.add("eeee");
        list2.add("wwww");
        //如果这里不小心添加的多种数据类型，编译器不会有任何提示信息
        list2.add(1);
        list2.add(3.33);
        for (int i = 0; i < list2.size(); i++) {
            // 当使用强转是就会报ClassCastException
            Object object =  list2.get(i);
            System.out.println(object);
        }
        */
        
        // 普通创建类的实例
	 	Class flow = Flower.class;//1、获取类信息
		
        Flower f;
        Flower f2;
		try {
			Class flow2 = Class.forName("com.chen.Flower");
			f = (Flower) flow.newInstance();
			f2= (Flower) flow2.newInstance();
			System.out.println("Flow.class"+":"+f.getName());
			System.out.println("class.forname()"+":"+f2.getName());
			Field  []fields = f2.getClass().getDeclaredFields();
			for(int i = 0;i<fields.length;i++){
				System.out.println(fields[i].getType()+":"+fields[i].getName());
				
				 String fieldType = fields[i].getGenericType().toString();
				 String fieldName = fields[i].getName();
	                // 拼接出JavaBean中的set方法 这里有一个坑 后面讲解
	                String methodName = "set"
	                        + fieldName.substring(0, 1).toUpperCase()
	                        + fieldName.substring(1);
	                Method m = f2.getClass().getMethod(methodName,
                            String.class);
//	                m.invoke(f2, value);
			}
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	                catch (Exception e) {
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	       }
      
        		
    }
}
