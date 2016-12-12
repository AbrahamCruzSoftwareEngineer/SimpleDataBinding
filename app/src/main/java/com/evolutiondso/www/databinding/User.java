package com.evolutiondso.www.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Albrtx on 12/12/2016.
 */

public class User extends BaseObservable {
    private String firstName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
}