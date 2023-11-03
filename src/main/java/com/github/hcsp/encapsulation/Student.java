package com.github.hcsp.encapsulation;

public class Student {
    private String name;
    private int score;
    private boolean retakingExam;

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean isRetakingExam() {
        return retakingExam;
    }
        public void setScore(int score){
            this.score = score;
        }

    public int getScore() {
        return score;
    }

    public Student() {
        }
    }

