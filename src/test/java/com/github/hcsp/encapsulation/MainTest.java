package com.github.hcsp.encapsulation;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void allFieldsArePrivate() {
        Assertions.assertTrue(
                Stream.of(com.github.hcsp.encapsulation.Cat.class.getDeclaredFields())
                        .map(Field::getModifiers)
                        .allMatch(Modifier::isPrivate));
    }

    @Test
    public void canSerializeAndDeserialize() {
        Student s = new Student();
        s.setName("张三");
        s.setRetakingExam(true);
        s.setScore(59);
        String json = com.alibaba.fastjson.JSON.toJSONString(s);

        Assertions.assertTrue(json.contains("\"fail\""));

        s = com.alibaba.fastjson.JSON.parseObject(json, Student.class);

        Assertions.assertEquals("张三", s.getName());
        Assertions.assertEquals(true, s.isRetakingExam());
        Assertions.assertEquals(59, s.getScore());
        Assertions.assertEquals(true, s.isFail());
    }
}
