package com.github.hcsp.encapsulation;

public class Student {
     /*
         假设你正在为学校开发一个学生分数记录系统
         你和前端约定的JSON接口格式是：
         {
           "name": "张三",
           "retakingExam": true,
           "score": 59,
           "fail": true // 是否挂科，如果分数低于60则返回true，代表挂科
         }
    */
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    private int score;
    private boolean isFail;

    public Student(){} // 无参构造器

    public Student(String name,int score,boolean retakingExam,boolean isFail){
        this.name = name;
        this.score=score;
        this.retakingExam=retakingExam;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }

    public boolean isFail() {
        if (score <60) {
            return true;
        }
        return false;
    }

    public boolean setRetakingExam(boolean retakingExam){
        if(score >=60){
            this.retakingExam = true;
        }
        else{
            return isFail();
        }
        return true;
    }

    public boolean isRetakingExam(){
        return true;
    }

}
