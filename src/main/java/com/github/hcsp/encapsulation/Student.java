package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    /** 是否挂科 */
    private boolean fail;


    /** 分数 */
    private int score;

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

    public boolean isFail() {
        return fail;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        this.fail = score < 60;
    }
}
