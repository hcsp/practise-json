package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    private int score;

    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public boolean isRetakingExam() {
        return retakingExam;
    }
    public boolean isFail() {
        if(getScore() < 60) {
            return true;
        } else {
            return false;
        }
    }
}
