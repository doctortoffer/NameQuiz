package com.trifork.ckp.namequiz.quiz;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import com.trifork.ckp.namequiz.model.Department;

public final class QuizScreen implements Parcelable {

    final long departmentId;

    public QuizScreen(long departmentId) {
        this.departmentId = departmentId;
    }

    protected QuizScreen(Parcel in) {
        departmentId = in.readLong();
    }

    public static final Creator<QuizScreen> CREATOR = new Creator<QuizScreen>() {
        @Override
        public QuizScreen createFromParcel(Parcel in) {
            return new QuizScreen(in);
        }

        @Override
        public QuizScreen[] newArray(int size) {
            return new QuizScreen[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(departmentId);
    }
}
