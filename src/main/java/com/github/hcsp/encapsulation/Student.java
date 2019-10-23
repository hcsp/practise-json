package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    public String getName() {
        return name;
    }

    public boolean isRetakingExam() {
        return retakingExam;
    }

    public int getScore() {
        return score;
    }

    public boolean isFail() {
        return fail;
    }

    /** 分数 */
    private int score;

    /** 是否挂科 */
    private boolean fail;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
        if (score >= 60){
            this.fail = false;
        }else {
            this.fail = true;
        }
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }
}
