package com.github.hcsp.encapsulation;

public class Student {
//    {
//        "name": "张三",
//            "retakingExam": true,
//            "score": 59,
//            "fail": true // 是否挂科，如果分数低于60则返回true，代表挂科
//    }
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，false为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    private int score;

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
        return score < 60;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
