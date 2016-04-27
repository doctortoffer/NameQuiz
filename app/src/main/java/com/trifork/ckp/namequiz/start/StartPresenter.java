package com.trifork.ckp.namequiz.start;

import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.trifork.ckp.namequiz.data.Department;
import com.trifork.ckp.namequiz.data.DepartmentsRepository;

import java.util.List;

public class StartPresenter extends MvpBasePresenter<StartView> {

    private final DepartmentsRepository departmentsRepository;

    public StartPresenter(@NonNull DepartmentsRepository departmentsRepository) {
        this.departmentsRepository = departmentsRepository;
    }

    public void loadDepartments() {
        getView().showLoading(false);

        departmentsRepository.getDepartments(new DepartmentsRepository.LoadDepartmentsCallback() {
            @Override
            public void onDepartmentsLoaded(List<Department> departments) {
                getView().setData(departments);
                getView().showContent();
            }
        });
    }
}