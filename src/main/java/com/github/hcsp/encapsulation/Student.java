package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /**
     * 姓名
     */
    private String name;

    /**
     * 是否重考。true为重考，falase为非重考。
     */
    private boolean retakingExam;

    /**
     * 分数
     */
    private int score;
    private boolean fail;
    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setScore(int score) {
        this.score = score;
        return this;
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public boolean isRetakingExam() {
        return retakingExam;
    }

    public int getScore() {
        return score;
    }

    public Boolean isFail(){
        if(score < 60){
            this.fail = true;
            return true;
        }else{
            this.fail = false;
            return false;
        }
    }

}
