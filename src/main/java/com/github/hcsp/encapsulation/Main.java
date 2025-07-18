package com.github.hcsp.encapsulation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {
    /*
         假设你正在为学校开发一个学生分数记录系统
         你和前端约定的JSON接口格式是：
         {
           "name": "张三",
           "retakingExam": true,
           "score": 59,
           "fail": true // 是否挂科，如果分数低于60则返回true，代表挂科
         }
         请：
         1. 设计并完成Student类
         2. 挑选一种你喜欢的JSON类库，完成序列化/反序列化的方法
    */
    public static void main(String[] args) throws JsonProcessingException {       // 程序开始
        Student student = new Student();           // new 一个 student 对象
        student.setName("张三");                    // 给 student 赋名
        student.setScore(60);                       // 给 student 对象赋值
        student.setRetakingExam(true);              // 给 student 对象赋值为 true

        String json = serialize(student);           // 将对象序列化为 json 字符串

        System.out.println(json);                   // 输出 json 字符串

        student = deserialize(json);                // 将 json 字符串反序列化为对象
    }

    public static String serialize(Student student) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.valueToTree(student);
        return mapper.writeValueAsString(node);
    }

    public static Student deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json,Student.class);
    }
}
