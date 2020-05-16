package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;
    private int score;
    private boolean fail;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean isFail() {
        return fail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        if (score < 60) {
            setFail(true);
        } else {
            setFail(false);
        }
        this.score = score;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public boolean isRetakingExam() {
        return retakingExam;


    }
}
