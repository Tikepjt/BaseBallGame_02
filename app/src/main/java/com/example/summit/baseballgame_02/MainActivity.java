package com.example.summit.baseballgame_02;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.summit.baseballgame_02.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    MyRecyclerViewAdapter mAdapter;
    ArrayList<RoundItem> mArrRoundResultItem;

    int rNumber[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        rNumber = new int[3];
        {
            rNumber[0] = Math.abs((int) System.currentTimeMillis() % 10);
            rNumber[1] = Math.abs((int) System.currentTimeMillis() / 100 % 10);
            rNumber[2] = Math.abs((int) System.currentTimeMillis() / 1000 % 10);
        }


        Log.d("=-=-=-", "" + rNumber[0]
                + "" + rNumber[1]
                + "" + rNumber[2]);

        mArrRoundResultItem = new ArrayList<>();

        mAdapter = new MyRecyclerViewAdapter(this, mArrRoundResultItem);

        mBinding.resultRv.setAdapter(mAdapter);

        mBinding.resultRv.setLayoutManager(new LinearLayoutManager(this));

        RoundItem sample = new RoundItem();
        sample.input = "입력값";
        sample.result = "결과";

        mArrRoundResultItem.add(sample);

        mAdapter.notifyDataSetChanged();

        mBinding.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int strike = 0;
                    int ball = 0;
                    String strInput = mBinding.userInputEdt.getText().toString();

                    int nInput = Integer.parseInt(strInput);
                    int input[] = new int[3];
                    input[0] = nInput / 100;
                    input[1] = nInput % 100 / 10;
                    input[2] = nInput % 10;


                    for (int i = 0; i < 3; i++) {
                        if (input[i] == rNumber[i]) {
                            strike += 1;
                        }
                    }
                    if (input[0] == rNumber[1] || input[0] == rNumber[2]) {
                        ball += 1;
                    }
                    if (input[1] == rNumber[0] || input[1] == rNumber[2]) {
                        ball += 1;
                    }
                    if (input[2] == rNumber[0] || input[2] == rNumber[1]) {
                        ball += 1;
                    }


                    RoundItem item = new RoundItem();
                    item.input = mBinding.userInputEdt.getText().toString();
                    String result = "";

                    if (strike == 3) {
                        result = "홈런!";
                    } else if (strike == 0 && ball == 0) {
                        result = "아웃";
                    } else {
                        if (strike > 0) {
                            result += strike + "스트라이크 ";
                        }
                        if (ball > 0) {
                            result += ball + "볼";
                        }
                    }

                    item.result = result;
                    mArrRoundResultItem.add(item);
                    mAdapter.notifyDataSetChanged();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                mBinding.userInputEdt.setText("");

            }
        });

        final EditText userInputEdt = findViewById(R.id.user_input_edt);

        Button button0 = findViewById(R.id.button_0);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "0");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.user_input_edt);
                String text = userInputEdt.getText().toString();
                textEdit.setText(text + "9");
            }
        });

    }
}