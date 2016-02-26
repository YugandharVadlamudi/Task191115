package com.example.kiran.task191115;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fragmentcall(View view)
    {


        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(view==findViewById(R.id.BvGridviewCall))
        {
            listviewFragment l=new listviewFragment();
            ft.replace(R.id.fragment_1,l);
            ft.commit();
        }
        else if(view==findViewById(R.id.BVRegisterCall))
        {
            Login l=new Login();
            ft.replace(R.id.fragment_1,l);
            ft.commit();
        }

    }

}
