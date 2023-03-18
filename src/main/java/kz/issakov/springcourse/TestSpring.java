package kz.issakov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // аргументами методу getBean, первый аргумент ID бина, второй аргумент объект какого класса я хочу
        TestBean tB=context.getBean("testBean", TestBean.class);
        System.out.println(tB.getName());
        context.close();
    }
}
