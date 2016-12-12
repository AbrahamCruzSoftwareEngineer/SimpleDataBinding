package com.evolutiondso.www.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.evolutiondso.www.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Student student;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        student = new Student("Alberto", "10", "imagen");
        binding.setStudent(student);
        user = new User("Change the value of this user binded");
        binding.setUser(user);
    }

    public void changeData(View view) {
        user.setFirstName("Christian!");
    }

}
