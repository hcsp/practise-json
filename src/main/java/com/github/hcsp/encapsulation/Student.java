package com.github.hcsp.encapsulation;

public class Student {
    /**
     * 姓名
     */
    private String name;
    private boolean retakingExam;
    private int score;
    private boolean fail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 是否重考。true为重考，falase为非重考。
     */


    public boolean isRetakingExam() {
        return retakingExam;
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }


    /**
     * 分数,以及是否fail
     */


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isFail() {
        return score < 60;
    }
}
