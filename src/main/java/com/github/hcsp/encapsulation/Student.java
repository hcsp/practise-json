package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，false为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    private int score;

    public boolean isFail() {
        if (score < 60 ) {
            return true;
        }
        return false;
    }

    private boolean fail;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public boolean isRetakingExam() {
        return retakingExam;
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public boolean getRetakingExam() {
        return retakingExam;
    }
}
