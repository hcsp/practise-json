package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /** 姓名 */
    private String name;

    /** 是否重考。true为重考，falase为非重考。 */
    private boolean retakingExam;

    /** 分数 */
    private int score;

    /** 是否挂科 **/
    private boolean fail;

    // 定义 Getter 和 Setter
    public String getName() {
        return name;
    }
    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public boolean isRetakingExam() {
        return retakingExam;
    }
    public Student setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
        return this;
    }
    public int getScore() {
        return score;
    }
    public Student setScore(int score) {
        this.score = score;
        this.fail = score < 60;
        return this;
    }
    public boolean isFail() {
        return fail;
    }
}
