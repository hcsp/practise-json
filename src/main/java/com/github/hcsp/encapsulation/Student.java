package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;
    public Student setName(String name){
        this.name=name;
        return this;
    }
    public String getName(){return(this.name);}

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;
    public Student setRetakingExam(boolean retakingExam){
        this.retakingExam=retakingExam;
        return this;
    }
    public boolean isRetakingExam(){return(this.retakingExam);}

    /** 分数 */
    private int score;
    public Student setScore(int score){
        this.score=score;
        return this;
    }
    public int getScore(){return(this.score);}

    public boolean isFail(){
        if(this.score<60){
            return true;
        }
        else{return false;}
    }
}
