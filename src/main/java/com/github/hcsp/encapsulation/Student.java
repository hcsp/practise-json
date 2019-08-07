package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    private int score;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setScore(int score){
        this.score=score;
    }

    public int getScore(){
        return this.score;
    }

    public void setRetakingExam(Boolean retakingExam){
        this.retakingExam=retakingExam;
    }

    public Boolean isRetakingExam(){
        return this.retakingExam;
    }

    public Boolean isFail(){
        return this.score>=60?false:true;
    }

}
