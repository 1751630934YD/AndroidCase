package com.xinke.myapplication23;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView btnNavView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNavView=findViewById(R.id.bottom_Navigation_menu);

        btnNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        fragmentTransaction.replace(R.id.home_fragment, new HomeFragment()).commit();
                        return true;
                    case  R.id.myuser:
                        fragmentTransaction.replace(R.id.home_fragment, new myselfFragment()).commit();
                        return true;
                }
                return false;
            }
        });
        btnNavView.setSelectedItemId(R.id.navigation_home);
    }
}
