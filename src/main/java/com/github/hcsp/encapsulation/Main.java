package com.github.hcsp.encapsulation;

import com.alibaba.fastjson.JSON;

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
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setScore(60);
        student.setRetakingExam(true);
        System.out.println("student.getScore()*******"+student.getScore());
        //根据分数判断是否挂科
//        if(student.getScore()<60){
//            student.setFail(true);
//        }else {student.setFail(false);};
        student.setFail(student.isFail());
        String json = serialize(student);
        System.out.println("对象Student****"+student);
        System.out.println("待转化的json****"+json);

        student = deserialize(json);
    }
    // 序列化：将Student类转换成JSON字符串
    public static String serialize(Student student) {
        return JSON.toJSONString(student);
    }
    // 反序列化：将JSON字符串转换成Student对象
    public static Student deserialize(String json) {
        return JSON.parseObject(json,Student.class);
    }
    //提交提示成功但实际远程没看到更新代码
}
