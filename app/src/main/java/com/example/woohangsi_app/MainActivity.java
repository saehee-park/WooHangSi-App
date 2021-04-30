package com.example.woohangsi_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.woohangsi_app.BrandCustom;
import com.example.woohangsi_app.BudgetCategory;
import com.example.woohangsi_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
  private BottomNavigationView mBottomNV;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mBottomNV = findViewById(R.id.nav_view);
    mBottomNV.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() { //NavigationItemSelecte
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        BottomNavigate(menuItem.getItemId());


        return true;
      }
    });
    mBottomNV.setSelectedItemId(R.id.main1);
  }
  private void BottomNavigate(int id) {  //BottomNavigation 페이지 변경
    String tag = String.valueOf(id);
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    Fragment currentFragment = fragmentManager.getPrimaryNavigationFragment();
    if (currentFragment != null) {
      fragmentTransaction.hide(currentFragment);
    }

    Fragment fragment = fragmentManager.findFragmentByTag(tag);
    if (fragment == null) {
      if (id == R.id.main1) {
        fragment = new InquiryList();

      } else if (id == R.id.main2){

        fragment = new BarRating();
      }else {
        fragment = new FixedSpend();
      }

      fragmentTransaction.add(R.id.content_layout, fragment, tag);
    } else {
      fragmentTransaction.show(fragment);
    }

    fragmentTransaction.setPrimaryNavigationFragment(fragment);
    fragmentTransaction.setReorderingAllowed(true);
    fragmentTransaction.commitNow();


  }

}