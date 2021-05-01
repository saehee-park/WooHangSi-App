package com.example.woohangsi_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.woohangsi_app.DB.FixedSpending;
import com.example.woohangsi_app.DB.RequestAPI;
import com.example.woohangsi_app.requests.Body;
import com.example.woohangsi_app.requests.CallAPI;
import com.example.woohangsi_app.requests.Urls;

import java.io.IOException;

public class CheckApi extends AppCompatActivity {

    public static final String NOTIFICATION_CHANNEL_ID = "10001";
    private int count = 0;
    Button btnGetIndivAllAccInfo, btnGetAccBasicInfo, btnGetAccTransList, btnGetCellCerti, btnExecuteCellCerti;
    String data;
    TextView textView;

    Button postBtn, putBtn, deleteBtn;
    RequestAPI requestAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.api_check);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // 버튼을 누를때마다 count 를 증가시며 최근에 보낸 노티피케이션만 사용자의 탭 대기중인지 테스트
                count++;
                NotificationSomethings();
            }
        });

        textView = (TextView)findViewById(R.id.textView2);

        // request 버튼
        Urls urls = new Urls();
        Body body = new Body();

        btnGetIndivAllAccInfo = (Button)findViewById(R.id.btnGetIndivAllAccInfo);
        btnGetAccBasicInfo = (Button)findViewById(R.id.btnGetAccBasicInfo);
        btnGetAccTransList = (Button)findViewById(R.id.btnGetAccTransList);
        btnGetCellCerti = (Button)findViewById(R.id.btnGetCellCerti);
        btnExecuteCellCerti = (Button)findViewById(R.id.btnExecuteCellCerti);

        btnGetIndivAllAccInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleBtn(urls.getGetIndivAllAccInfo(), body.getGetIndivAllAccInfo());
            }
        });
        btnGetAccBasicInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleBtn(urls.getGetAccBasicInfo(), body.getGetAccBasicInfo());
            }
        });
        btnGetAccTransList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleBtn(urls.getGetAccTransList(), body.getGetAccTransList());
            }
        });
        btnGetCellCerti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleBtn(urls.getGetCellCerti(), body.getGetCellCerti());
            }
        });
        btnExecuteCellCerti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleBtn(urls.getExecuteCellCerti(), body.getExecuteCellCerti());
            }
        });


        // DB 버튼
        try {
            requestAPI = new RequestAPI();
        } catch (IOException e) {
            e.printStackTrace();
            finish();
        }
        postBtn = (Button)findViewById(R.id.post);
        postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread() {
                    public void run() {
                        try {
                            FixedSpending fixedSpending = new FixedSpending();
                            requestAPI.requestPost(fixedSpending.getAddUrl(),fixedSpending.getAddBody("교통비",100000,1));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });

        putBtn = (Button)findViewById(R.id.put);
        putBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread() {
                    public void run() {
                        try {
                            FixedSpending fixedSpending = new FixedSpending();
                            requestAPI.requestPut(fixedSpending.getUpdateUrl(),fixedSpending.getUpdateBody("월급",6000000, 1));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });

        deleteBtn = (Button)findViewById(R.id.delete);
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread() {
                    public void run() {
                        try {
                            FixedSpending fixedSpending = new FixedSpending();
                            requestAPI.requestDelete(fixedSpending.getDeleteUrl(),fixedSpending.getDeleteBody(1));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });
    }

    public void NotificationSomethings() {


        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        Intent notificationIntent = new Intent(this, ResultActivity.class);
        notificationIntent.putExtra("notificationId", count); //전달할 값
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK) ;
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent,  PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_foreground)) //BitMap 이미지 요구
                .setContentTitle("상태바 드래그시 보이는 타이틀")
                .setContentText("상태바 드래그시 보이는 서브타이틀")
                // 더 많은 내용이라서 일부만 보여줘야 하는 경우 아래 주석을 제거하면 setContentText에 있는 문자열 대신 아래 문자열을 보여줌
                //.setStyle(new NotificationCompat.BigTextStyle().bigText("더 많은 내용을 보여줘야 하는 경우..."))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent) // 사용자가 노티피케이션을 탭시 ResultActivity로 이동하도록 설정
                .setAutoCancel(true);

        //OREO API 26 이상에서는 채널 필요
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            builder.setSmallIcon(R.drawable.ic_launcher_foreground); //mipmap 사용시 Oreo 이상에서 시스템 UI 에러남
            CharSequence channelName  = "노티페케이션 채널";
            String description = "오레오 이상을 위한 것임";
            int importance = NotificationManager.IMPORTANCE_HIGH;

            NotificationChannel channel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, channelName , importance);
            channel.setDescription(description);

            // 노티피케이션 채널을 시스템에 등록
            assert notificationManager != null;
            notificationManager.createNotificationChannel(channel);

        }else builder.setSmallIcon(R.mipmap.ic_launcher); // Oreo 이하에서 mipmap 사용하지 않으면 Couldn't create icon: StatusBarIcon 에러남

        assert notificationManager != null;
        notificationManager.notify(1234, builder.build()); // 고유숫자로 노티피케이션 동작시킴

    }

    public void handleBtn(String subUrl, String bodyString) {
        new Thread() {
            public void run() {
                try {
                    CallAPI callAPI = new CallAPI(subUrl, bodyString);
                    data = callAPI.call();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(data);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }

}
