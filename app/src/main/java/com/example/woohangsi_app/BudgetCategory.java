package com.example.woohangsi_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class BudgetCategory extends AppCompatActivity {

    public static final int REQUEST_CODE_MENU=101;

    TextView txtCustomer, txtMonth, Budget, leftBudget, foodLastCost, cafeLastCost, alcholLastCost,
            lifeLastCost, shoppingLastCost, fashionLastCost, beautyLastCost, trafficLastCost, carLastCost,
            houseLastCost, healthLastCost, capitalLastCost, cultureLastCost, travelLastCost, educateLastCost,
            childrenLastCost, petLastCost, presentLastCost;
    Button btnSelect;
    LinearLayout food, cafe, alchol, life, shopping, fashion, beauty, traffic, car, house, health, capital,
            culture, travel, educate, children, pet, present;
    EditText foodBudget, cafeBudget, alcholBudget, lifeBudget, shoppingBudget, fashionBudget, beautyBudget,
            trafficBudget, carBudget, houseBudget, healthBudget, capitalBudget, cultureBudget, travelBudget,
            educateBudget, childrenBudget, petBudget, presentBudget;

    LinearLayout [] layoutarray;
    String [] categoryArray;
    boolean [] checkArray;

    NavigationView navigationView;
    DrawerLayout drawerLayout;

    ActionBarDrawerToggle barDrawerToggle;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_budget);

        navigationView=findViewById(R.id.nav);
        drawerLayout=findViewById(R.id.layout_drawer);
        navigationView.setItemIconTintList(null);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.Main:
                        Intent intent=new Intent(com.example.woohangsi_app.BudgetCategory.this,MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.totalBudget_inquiry:
                        intent = new Intent(BudgetCategory.this, InquiryBudgetTotal.class);
                        startActivity(intent);
                        break;
                    case R.id.categoryBudget_inquiry:
                        intent = new Intent(BudgetCategory.this, InquiryBudgetCategory.class);
                        startActivity(intent);
                        break;
                    case R.id.brandBudget_inquiry:
                        intent = new Intent(BudgetCategory.this, InquiryBudgetCustom.class);
                        startActivity(intent);
                        break;
                    case R.id.totalBudget_set:
                        intent = new Intent(BudgetCategory.this, BudgetTotal.class);
                        startActivity(intent);
                        break;
                    case R.id.categoryBudget_set:
                        intent = new Intent(BudgetCategory.this, BudgetCategory.class);
                        startActivity(intent);
                        break;
                    case R.id.brandBudget_set:
                        intent = new Intent(BudgetCategory.this, CategoryCustom.class);
                        startActivity(intent);
                        break;
                    case R.id.top3_analysis:
                        intent = new Intent(BudgetCategory.this, TopCategory.class);
                        startActivity(intent);
                        break;
                    case R.id.month3_analysis:
                        intent = new Intent(BudgetCategory.this, SpendThreeMonth.class);
                        startActivity(intent);
                        break;
                    case R.id.consumption_analysis:
                        intent = new Intent(BudgetCategory.this, ConsumptionPattern.class);
                        startActivity(intent);
                        break;
                    case R.id.point_add:
                        intent = new Intent(BudgetCategory.this, BudgetCheck.class);
                        startActivity(intent);
                        break;
                    case R.id.point_inquiry:
                        intent = new Intent(BudgetCategory.this, EarnPoint.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
                drawerLayout.closeDrawer(navigationView);
                return false;
            }
        });
        barDrawerToggle= new ActionBarDrawerToggle(this, drawerLayout, R.string.app_name,R.string.app_name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        barDrawerToggle.syncState();
        drawerLayout.addDrawerListener(barDrawerToggle);

        txtCustomer = (TextView) findViewById(R.id.txtCustomer);
        txtMonth = (TextView) findViewById(R.id.txtMonth);
        Budget = (TextView) findViewById(R.id.Budget);
        leftBudget = (TextView) findViewById(R.id.leftBudget);
        foodLastCost = (TextView) findViewById(R.id.foodLastCost);
        cafeLastCost = (TextView) findViewById(R.id.cafeLastCost);
        alcholLastCost = (TextView) findViewById(R.id.alcholLastCost);
        lifeLastCost = (TextView) findViewById(R.id.lifeLastCost);
        shoppingLastCost = (TextView) findViewById(R.id.shoppingLastCost);
        fashionLastCost = (TextView) findViewById(R.id.fashionLastCost);
        beautyLastCost = (TextView) findViewById(R.id.beautyLastCost);
        trafficLastCost = (TextView) findViewById(R.id.trafficLastCost);
        carLastCost = (TextView) findViewById(R.id.carLastCost);
        houseLastCost = (TextView) findViewById(R.id.houseLastCost);
        healthLastCost = (TextView) findViewById(R.id.healthLastCost);
        capitalLastCost = (TextView) findViewById(R.id.capitalLastCost);
        cultureLastCost = (TextView) findViewById(R.id.cultureLastCost);
        travelLastCost = (TextView) findViewById(R.id.travelLastCost);
        educateLastCost = (TextView) findViewById(R.id.educateLastCost);
        childrenLastCost = (TextView) findViewById(R.id.childrenLastCost);
        petLastCost = (TextView) findViewById(R.id.petLastCost);
        presentLastCost = (TextView) findViewById(R.id.presentLastCost);

        btnSelect = (Button) findViewById(R.id.btnSelect);

        food = (LinearLayout) findViewById(R.id.food);
        cafe = (LinearLayout) findViewById(R.id.cafe);
        alchol = (LinearLayout) findViewById(R.id.alchol);
        life = (LinearLayout) findViewById(R.id.life);
        shopping = (LinearLayout) findViewById(R.id.shopping);
        fashion = (LinearLayout) findViewById(R.id.fashion);
        beauty = (LinearLayout) findViewById(R.id.beauty);
        traffic = (LinearLayout) findViewById(R.id.traffic);
        car = (LinearLayout) findViewById(R.id.car);
        house = (LinearLayout) findViewById(R.id.house);
        health = (LinearLayout) findViewById(R.id.health);
        capital = (LinearLayout) findViewById(R.id.capital);
        culture = (LinearLayout) findViewById(R.id.culture);
        travel = (LinearLayout) findViewById(R.id.travel);
        educate = (LinearLayout) findViewById(R.id.educate);
        children = (LinearLayout) findViewById(R.id.children);
        pet = (LinearLayout) findViewById(R.id.pet);
        present = (LinearLayout) findViewById(R.id.present);

        foodBudget = (EditText) findViewById(R.id.foodBudget);
        cafeBudget = (EditText) findViewById(R.id.cafeBudget);
        alcholBudget = (EditText) findViewById(R.id.alcholBudget);
        lifeBudget = (EditText) findViewById(R.id.lifeBudget);
        shoppingBudget = (EditText) findViewById(R.id.shoppingBudget);
        fashionBudget = (EditText) findViewById(R.id.fashionBudget);
        beautyBudget = (EditText) findViewById(R.id.beautyBudget);
        trafficBudget = (EditText) findViewById(R.id.trafficBudget);
        carBudget = (EditText) findViewById(R.id.carBudget);
        houseBudget = (EditText) findViewById(R.id.houseBudget);
        healthBudget = (EditText) findViewById(R.id.healthBudget);
        capitalBudget = (EditText) findViewById(R.id.capitalBudget);
        cultureBudget = (EditText) findViewById(R.id.cultureBudget);
        travelBudget = (EditText) findViewById(R.id.travelBudget);
        educateBudget = (EditText) findViewById(R.id.educateBudget);
        childrenBudget = (EditText) findViewById(R.id.childrenBudget);
        petBudget = (EditText) findViewById(R.id.petBudget);
        presentBudget = (EditText) findViewById(R.id.presentBudget);

        layoutarray = new LinearLayout[] {food, cafe, alchol, life, shopping, fashion, beauty, traffic, car, house, health, capital, culture, travel, educate, children, pet, present};

        categoryArray = new String[] {"식비", "카페", "술/유흥", "생활", "온라인 쇼핑", "패션", "뷰티", "교통", "자동차", "주거/통신", "의료/건강", "금융",
                "문화/여가", "여행/숙박", "교육/학습", "자녀/육아", "반려동물", "경조/선물"};
        checkArray = new boolean[]{false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false};

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(BudgetCategory.this);
                dlg.setTitle("예산 설정을 원하는 카테고리를 선택");
                dlg.setIcon(R.drawable.logo);
                dlg.setMultiChoiceItems(categoryArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                        if(checkArray[which]=isChecked){
                            layoutarray[which].setVisibility(View.VISIBLE);
                        }
                        else{
                            layoutarray[which].setVisibility(View.GONE);
                        }
                    }
                });
                dlg.setPositiveButton("완료", null);
                dlg.show();
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_MENU) {
            if (resultCode == RESULT_OK) {
                String total = data.getStringExtra("total");
                Budget.setText(total);
                leftBudget.setText(Budget.getText());
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        barDrawerToggle.onOptionsItemSelected(item);
        return super.onOptionsItemSelected(item);
    }


}
