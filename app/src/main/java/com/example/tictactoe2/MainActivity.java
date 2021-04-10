package com.example.tictactoe2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[][]board = new String[3][3];
    int a = 0;
    int b = 0;
    int number = 0;
    int numbers = 0;



    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9, sc1, sc2;

    void score(){
        sc1.setText(""+a);
        sc1.setTextColor(Color.parseColor("#89DBDE"));
        sc2.setText(""+b);
        sc2.setTextColor(Color.parseColor("#E8E177"));
    }

    void fe(){
        if(board[0][0].equals("o") && board[1][0].equals("o") && board[2][0].equals("o")){
            Toast.makeText(getApplicationContext()," o가 이겼습니다.",Toast.LENGTH_SHORT).show();
            b++;
            restart();
        }
        else if(board[0][1].equals("o") && board[1][1].equals("o") && board[2][1].equals("o")){
            Toast.makeText(getApplicationContext()," o가 이겼습니다.",Toast.LENGTH_SHORT).show();
            b++;
            restart();
        }
        else if(board[0][2].equals("o") && board[1][2].equals("o") && board[2][2].equals("o")){
            Toast.makeText(getApplicationContext()," o가 이겼습니다.",Toast.LENGTH_SHORT).show();
            b++;
            restart();
        }
        else if(board[0][0].equals("o") && board[0][1].equals("o") && board[0][2].equals("o")){
            Toast.makeText(getApplicationContext()," o가 이겼습니다.",Toast.LENGTH_SHORT).show();
            b++;
            restart();
        }
        else if(board[1][0].equals("o") && board[1][1].equals("o") && board[1][2].equals("o")){
            Toast.makeText(getApplicationContext()," o가 이겼습니다.",Toast.LENGTH_SHORT).show();
            b++;
            restart();
        }
        else if(board[2][0].equals("o") && board[2][1].equals("o") && board[2][2].equals("o")){
            Toast.makeText(getApplicationContext()," o가 이겼습니다.",Toast.LENGTH_SHORT).show();
            b++;
            restart();
        }
        else if(board[0][0].equals("o") && board[1][1].equals("o") && board[2][2].equals("o")){
            Toast.makeText(getApplicationContext()," o가 이겼습니다.",Toast.LENGTH_SHORT).show();
            b++;
            restart();
        }
        else if(board[0][2].equals("o") && board[1][1].equals("o") && board[2][0].equals("o")) {
            Toast.makeText(getApplicationContext()," o가 이겼습니다.",Toast.LENGTH_SHORT).show();
            b++;
            restart();
        }
        score();
    }
    void fee(){
        if(board[0][0].equals("x") && board[1][0].equals("x") && board[2][0].equals("x")){
            Toast.makeText(getApplicationContext()," x가 이겼습니다.",Toast.LENGTH_SHORT).show();
            a++;
            restart();
        }
        else if(board[0][1].equals("x") && board[1][1].equals("x") && board[2][1].equals("x")){
            Toast.makeText(getApplicationContext()," x가 이겼습니다.",Toast.LENGTH_SHORT).show();
            a++;
            restart();
        }
        else if(board[0][2].equals("x") && board[1][2].equals("x") && board[2][2].equals("x")){
            Toast.makeText(getApplicationContext()," x가 이겼습니다.",Toast.LENGTH_SHORT).show();
            a++;
            restart();
        }
        else if(board[0][0].equals("x") && board[0][1].equals("x") && board[0][2].equals("x")){
            Toast.makeText(getApplicationContext()," x가 이겼습니다.",Toast.LENGTH_SHORT).show();
            a++;
            restart();
        }
        else if(board[1][0].equals("x") && board[1][1].equals("x") && board[1][2].equals("x")){
            Toast.makeText(getApplicationContext()," x가 이겼습니다.",Toast.LENGTH_SHORT).show();
            a++;
            restart();
        }
        else if(board[2][0].equals("x") && board[2][1].equals("x") && board[2][2].equals("x")){
            Toast.makeText(getApplicationContext()," x가 이겼습니다.",Toast.LENGTH_SHORT).show();
            a++;
            restart();
        }
        else if(board[0][0].equals("x") && board[1][1].equals("x") && board[2][2].equals("x")){
            Toast.makeText(getApplicationContext()," x가 이겼습니다.",Toast.LENGTH_SHORT).show();
            a++;
            restart();
        }
        else if(board[0][2].equals("x") && board[1][1].equals("x") && board[2][0].equals("x")) {
            Toast.makeText(getApplicationContext()," x가 이겼습니다.",Toast.LENGTH_SHORT).show();
            a++;
            restart();
        }
        score();
    }

    void ee(){
        fe();
        fee();
        restarts();
    }

    void restarts() {
        if (numbers == 9) {
            restart();
            Toast.makeText(getApplicationContext(), "빈 자리가 없어서 초기화 합니다..", Toast.LENGTH_SHORT).show();
        }
    }

    void restart(){
        for(int i =0; i <=2; i++){
            for(int j = 0; j<=2; j++){
                board[i][j] = "";
            }
        }
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");
        tv7.setText("");
        tv8.setText("");
        tv9.setText("");
        numbers = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);
        tv8=findViewById(R.id.tv8);
        tv9=findViewById(R.id.tv9);

        sc1 = findViewById(R.id.sc1);
        sc2 = findViewById(R.id.sc2);

        score();

        for(int i =0; i <=2; i++){
            for(int j = 0; j<=2; j++){
                board[i][j] = "";
            }
        }
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");
        tv7.setText("");
        tv8.setText("");
        tv9.setText("");

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv1.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[0][0] = "x";
                        tv1.setText("x");
                        tv1.setTextColor(Color.parseColor("#89DBDE"));
                    } else {
                        board[0][0] = "o";
                        tv1.setText("o");
                        tv1.setTextColor(Color.parseColor("#E8E177"));
                    }
                    number += 1;
                    numbers += 1;
                    ee();

                }
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv2.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[0][1] = "x";
                        tv2.setText("x");
                        tv2.setTextColor(Color.parseColor("#89DBDE"));
                    } else {
                        board[0][1] = "o";
                        tv2.setText("o");
                        tv2.setTextColor(Color.parseColor("#E8E177"));
                    }
                    number += 1;
                    numbers += 1;
                    ee();
                }
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv3.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[0][2] = "x";
                        tv3.setText("x");
                        tv3.setTextColor(Color.parseColor("#89DBDE"));
                    } else {
                        board[0][2] = "o";
                        tv3.setText("o");
                        tv3.setTextColor(Color.parseColor("#E8E177"));
                    }
                    number += 1;
                    numbers += 1;
                    ee();
                }
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv4.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[1][0] = "x";
                        tv4.setText("x");
                        tv4.setTextColor(Color.parseColor("#89DBDE"));
                    } else {
                        board[1][0] = "o";
                        tv4.setText("o");
                        tv4.setTextColor(Color.parseColor("#E8E177"));
                    }
                    number += 1;
                    numbers += 1;
                    ee();
                }
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv5.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[1][1] = "x";
                        tv5.setText("x");
                        tv5.setTextColor(Color.parseColor("#89DBDE"));

                    } else {
                        board[1][1] = "o";
                        tv5.setText("o");
                        tv5.setTextColor(Color.parseColor("#E8E177"));

                    }
                    number += 1;
                    numbers += 1;
                    ee();
                }
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv6.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[1][2] = "x";
                        tv6.setText("x");
                        tv6.setTextColor(Color.parseColor("#89DBDE"));

                    } else {
                        board[1][2] = "o";
                        tv6.setText("o");
                        tv6.setTextColor(Color.parseColor("#E8E177"));

                    }
                    number += 1;
                    numbers += 1;
                    ee();
                }
            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv7.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[2][0] = "x";
                        tv7.setText("x");
                        tv7.setTextColor(Color.parseColor("#89DBDE"));

                    } else {
                        board[2][0] = "o";
                        tv7.setText("o");
                        tv7.setTextColor(Color.parseColor("#E8E177"));

                    }
                    number += 1;
                    numbers += 1;
                    ee();
                }
            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv8.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[2][1] = "x";
                        tv8.setText("x");
                        tv8.setTextColor(Color.parseColor("#89DBDE"));
                    } else {
                        board[2][1] = "o";
                        tv8.setText("o");
                        tv8.setTextColor(Color.parseColor("#E8E177"));

                    }
                    number += 1;
                    numbers += 1;
                    ee();
                }
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv9.getText().toString().equals("")) {
                    if (number % 2 == 0) {
                        board[2][2] = "x";
                        tv9.setText("x");
                        tv9.setTextColor(Color.parseColor("#89DBDE"));
                    } else {
                        board[2][2] = "o";
                        tv9.setText("o");
                        tv9.setTextColor(Color.parseColor("#E8E177"));
                    }
                    number += 1;
                    numbers += 1;
                    ee();
                }
            }
        });

    }
}