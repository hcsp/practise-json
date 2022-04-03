package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    private boolean fail;



    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;
    /** 分数 */
    private int score;

    public Student() {
    }
    public Student(String name, boolean fail, boolean retakingExam, int score) {
        this.name = name;
        this.fail = fail;
        this.retakingExam = retakingExam;
        this.score = score;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public boolean isFail() {
        return fail;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
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
}
