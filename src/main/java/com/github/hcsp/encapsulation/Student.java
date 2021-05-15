package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;
    public void setName(String name){
        this.name=name;
    }
    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;
    public void setRetakingExam(boolean b){
        this.retakingExam=b;
    }
    /** 分数 */
    private int score;
    public void setScore(int score){
        this.score=score;
    }
    public String getName(){
        return this.name;
    }
    public boolean isRetakingExam(){
        return this.retakingExam;
    }
    public int getScore(){
        return this.score;
    }
    public boolean isFail(){
        return getScore()<60;
    }
}
