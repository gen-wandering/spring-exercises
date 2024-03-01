package com.springexercises.partb.beannameconflict;

import com.springexercises.partb.beannameconflict.model.Student;
import com.springexercises.partb.beannameconflict.model.Worker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AliasConflictMain {
    public static void main(String[] args) {
        String studentConfigPath = "partb/beannameconflict/studentConfig.xml";
        String workerConfigPath = "partb/beannameconflict/workerConfig.xml";

        ClassPathXmlApplicationContext studentContext = new ClassPathXmlApplicationContext(studentConfigPath);
        ClassPathXmlApplicationContext workerContext = new ClassPathXmlApplicationContext(workerConfigPath);

        System.out.println(studentContext.getBean("person", Student.class));
        System.out.println(workerContext.getBean("person", Worker.class));

        studentContext.setParent(workerContext);

        System.out.println(studentContext.getBean("person", Student.class));
        System.out.println(workerContext.getBean("person", Student.class));

    }
}
