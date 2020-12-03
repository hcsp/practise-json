package com.github.hcsp.encapsulation;

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

    public void setName(String 张三) {
        this.name = 张三;
    }

    public void setScore(int i) {
        this.score = i;
    }

    public void setRetakingExam(boolean b) {
        this.retakingExam = b;
    }

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
        if (score < 60) {
            return true;
        } else {
            return false;
        }
    }
}
