package com.trifork.ckp.namequiz.start;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;
import com.trifork.ckp.namequiz.model.Department;

import java.util.List;

public interface StartContract {

    interface StartView extends MvpLceView<List<Department>> {
        void showStartQuiz(Department department);
    }

    interface UserActionsListener extends MvpPresenter<StartView> {
        void loadDepartments();
        void startNewQuiz(Department department);
    }
}
