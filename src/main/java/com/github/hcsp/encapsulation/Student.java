package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;
    private boolean fail;

    /** 分数 */
    private int score;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
        this.setFail(retakingExam);
    }
    
    public boolean isRetakingExam() {
        return this.retakingExam;
    }
    
    public void setFail(boolean fail) {
        this.fail = fail;
    }
    
    public boolean isFail() {
        return this.fail;
    }
    
}
