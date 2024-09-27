package com.github.hcsp.encapsulation;
import org.json.JSONObject;
public class Main {
    public Main() {
    }
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
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setScore(60);
        student.setRetakingExam(true);

        String json = serialize (student);
        System.out.println(json);

        Student deserializedStudent = deserialize(json);
        System.out.println(deserializedStudent.getName());
    }
    // 序列化：将Student类转换成JSON字符串
    public static String serialize(Student student) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", student.getName());
        jsonObject.put("retakingExam", student.isRetakingExam());
        jsonObject.put("score", student.getScore());
        jsonObject.put("fail", student.getScore() < 60 ? true : false);
        return jsonObject.toString();
    }
    // 反序列化：将JSON字符串转换成Student对象
    public static Student deserialize(String json) {
        JSONObject jsonObject = new JSONObject(json);
        Student student = new Student();
        student.setName(jsonObject.getString("name"));
        student.setRetakingExam(jsonObject.getBoolean("retakingExam"));
        student.setScore(jsonObject.getInt("score"));
        return student;
    }
}
