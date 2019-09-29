package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类

  /** 姓名 */
  private String name;

  /** 是否重考。true为重考，falase为非重考。 */
  private boolean retakingExam;

  private boolean fail;

  /** 分数 */
  private int score;

  public void setName(String name) {
    this.name = name;
  }

  public void setRetakingExam(boolean retakingExam) {
    this.retakingExam = retakingExam;
  }

  public void setScore(int score) {
    this.score = score;
    if(score < 60){
      this.fail = true;
    }else{
      this.fail = false;
    }
  }

  public String getName() {
    return name;
  }

  public boolean isRetakingExam() {
    return retakingExam;
  }

  public boolean isFail() {
    return fail;
  }

  public int getScore() {
    return score;
  }
}
