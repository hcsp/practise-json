package com.github.hcsp.encapsulation;

/**
 * @author wheelchen
 */
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

    /**
     * 是否挂科，如果分数低于60则返回true，代表挂科
     */
    private boolean fail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRetakingExam() {
        return retakingExam;
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

//    public boolean getFail() {
//        return this.score < 60;
//    }

//    public void setFail() {
//        this.fail = this.score < 60;
//    }

    public boolean isFail() {
        return this.score < 60;
    }
}