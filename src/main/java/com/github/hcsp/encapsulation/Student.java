package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    private int score;

    private boolean fail;

    public String getName() {
        return name;
    }

    private void setFail(boolean fail) {
        this.fail = fail;
    }

    public boolean isFail() {

        return fail;
    }

    public boolean isRetakingExam() {
        return retakingExam;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public void setScore(int score) {
        this.score = score;
        if (score < 60) {
            setFail(true);
        } else {
        	setFail(false);
        }
    }
}
