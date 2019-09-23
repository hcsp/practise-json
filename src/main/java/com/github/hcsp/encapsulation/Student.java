package com.github.hcsp.encapsulation;

import com.alibaba.fastjson.annotation.JSONField;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    @JSONField(ordinal = 1)
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    @JSONField(ordinal =2 )
    private boolean retakingExam;

    /** 分数 */
    @JSONField(ordinal = 3)
    private int score;

    @JSONField(ordinal = 4)
    private boolean fail;

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
        fail = score < 60;
    }

    public boolean isFail(){
        return fail;
    }
}
