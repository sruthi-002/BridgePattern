package com.company;
public class Main {
    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.q = new JavaQuestion();
        questions.delete("What is your name ?");
        questions.newOne("What is inheritance ? ");
        questions.newOne("How many types of inheritance are there in java ?");
        questions.displayAll();
    }
}
