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

    /**
     * 是否挂科。true为挂科，false为没有挂科
     *
     * 补充：我个人认为，既然和前端约定了JSON接口格式，
     * 那Student类，应该也要有fail字段吧，
     * 即使实际操作只看getter/setter方法
     */
    private boolean fail;

    public boolean isFail() {
        return fail;
    }

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
        //根据成绩自动设置是否挂科
        fail = score < 60 && score >= 0;

        this.score = score;
    }
}
