package com.wipro.javacoreassessment;

import com.wipro.javacoreassessment.view.ApplicationView;

public class Application {
    public static void main(String[] args) {
        ApplicationView applicationView = new ApplicationView();
        applicationView.render();
        applicationView.clear();
    }
}
