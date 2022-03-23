package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    private int score;

    private boolean Fail;

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

    public boolean isFail() {
        if (score < 60) {
            return true;
        } else {
            return false;
        }



    }

    public void setFail(boolean fail) {
        Fail = fail;
    }
}
