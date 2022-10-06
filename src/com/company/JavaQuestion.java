package com.company;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestion implements Question {
    private List<String> questions = new ArrayList<String>();
    int current=0;
    public void JavaQuestions() {
        questions.add("What is your name ?");
        questions.add("What is your Email ?");
        questions.add("What is your phone number ?");
    }
    public void nextQuestion()
    {
        if(current<=questions.size()-1)
            current++;
    }
    public void previousQuestion()
    {
        if(current>0)
            current--;
    }
    public void newQuestion(String q) {
        questions.add(q);
    }
    public void deleteQuestion(String q){
        questions.remove(q);
    }
    public void display()
    {
        System.out.println(questions.get(current));
    }
    public void displayAll()
    {
        for( String q:questions)
            System.out.println(q);
    }
}
