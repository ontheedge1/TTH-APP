package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_teamid, et_location;

    Button btn1;
    int li;
    TextView textView;
    String t;
    String l;
    String clueid;
    String loca1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_teamid = findViewById(R.id.et_teamid);
        et_location=findViewById(R.id.et_location);
        btn1 = findViewById(R.id.btn1);textView = findViewById(R.id.textView);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseAccess databaseAccess= DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();

                t=et_teamid.getText().toString();
                l= String.valueOf(et_location.getText());

                if(l.equals("77296")) {
                    clueid = databaseAccess.get1Clue(t);
                    textView.setText(clueid);
                    if(clueid.equals("1")) {
                        openClue1();
                    }
                    else if(clueid.equals("2")) {
                        openClue2();
                    }
                    else if(clueid.equals("3")) {
                        openClue3();
                    }
                    else if(clueid.equals("4")) {
                        openClue4();
                    }
                    else if(clueid.equals("5")) {
                        openClue5();
                    }
                    else if(clueid.equals("6")) {
                        openClue6();
                    }
                    else if(clueid.equals("7")) {
                        openClue7();
                    }
                    else if(clueid.equals("8")) {
                        openClue8();
                    }
                                        }

            else if(l.equals("74462")) {
                    clueid = databaseAccess.get2Clue(t);
                    textView.setText(clueid);
                    if(clueid.equals("1")) {
                        openClue1();
                    }
                    else if(clueid.equals("2")) {
                        openClue2();
                    }
                    else if(clueid.equals("3")) {
                        openClue3();
                    }
                    else if(clueid.equals("4")) {
                        openClue4();
                    }
                    else if(clueid.equals("5")) {
                        openClue5();
                    }
                    else if(clueid.equals("6")) {
                        openClue6();
                    }
                    else if(clueid.equals("7")) {
                        openClue7();
                    }
                    else if(clueid.equals("8")) {
                        openClue8();
                    }

            }
            else if(l.equals("65784")) {
                    clueid = databaseAccess.get3Clue(t);
                    textView.setText(clueid);
                    if(clueid.equals("1")) {
                        openClue1();
                    }
                    else if(clueid.equals("2")) {
                        openClue2();
                    }
                    else if(clueid.equals("3")) {
                        openClue3();
                    }
                    else if(clueid.equals("4")) {
                        openClue4();
                    }
                    else if(clueid.equals("5")) {
                        openClue5();
                    }
                    else if(clueid.equals("6")) {
                        openClue6();
                    }
                    else if(clueid.equals("7")) {
                        openClue7();
                    }
                    else if(clueid.equals("8")) {
                        openClue8();
                    }

            }
            else if(l.equals("83623")) {
                    clueid = databaseAccess.get4Clue(t);
                    textView.setText(clueid);
                    if(clueid.equals("1")) {
                        openClue1();
                    }
                    else if(clueid.equals("2")) {
                        openClue2();
                    }
                    else if(clueid.equals("3")) {
                        openClue3();
                    }
                    else if(clueid.equals("4")) {
                        openClue4();
                    }
                    else if(clueid.equals("5")) {
                        openClue5();
                    }
                    else if(clueid.equals("6")) {
                        openClue6();
                    }
                    else if(clueid.equals("7")) {
                        openClue7();
                    }
                    else if(clueid.equals("8")) {
                        openClue8();
                    }

            }
            else if(l.equals("39846")) {
                    clueid = databaseAccess.get5Clue(t);
                    textView.setText(clueid);
                    if(clueid.equals("1")) {
                        openClue1();
                    }
                    else if(clueid.equals("2")) {
                        openClue2();
                    }
                    else if(clueid.equals("3")) {
                        openClue3();
                    }
                    else if(clueid.equals("4")) {
                        openClue4();
                    }
                    else if(clueid.equals("5")) {
                        openClue5();
                    }
                    else if(clueid.equals("6")) {
                        openClue6();
                    }
                    else if(clueid.equals("7")) {
                        openClue7();
                    }
                    else if(clueid.equals("8")) {
                        openClue8();
                    }

            }
            else if(l.equals("44307")) {
                    clueid = databaseAccess.get6Clue(t);
                    textView.setText(clueid);
                    if(clueid.equals("1")) {
                        openClue1();
                    }
                    else if(clueid.equals("2")) {
                        openClue2();
                    }
                    else if(clueid.equals("3")) {
                        openClue3();
                    }
                    else if(clueid.equals("4")) {
                        openClue4();
                    }
                    else if(clueid.equals("5")) {
                        openClue5();
                    }
                    else if(clueid.equals("6")) {
                        openClue6();
                    }
                    else if(clueid.equals("7")) {
                        openClue7();
                    }
                    else if(clueid.equals("8")) {
                        openClue8();
                    }

            }
            else if(l.equals("16865")) {
                    clueid = databaseAccess.get7Clue(t);
                    textView.setText(clueid);
                    if(clueid.equals("1")) {
                        openClue1();
                    }
                    else if(clueid.equals("2")) {
                        openClue2();
                    }
                    else if(clueid.equals("3")) {
                        openClue3();
                    }
                    else if(clueid.equals("4")) {
                        openClue4();
                    }
                    else if(clueid.equals("5")) {
                        openClue5();
                    }
                    else if(clueid.equals("6")) {
                        openClue6();
                    }
                    else if(clueid.equals("7")) {
                        openClue7();
                    }
                    else if(clueid.equals("8")) {
                        openClue8();
                    }

            }
            else if(l.equals("74434")) {
                    clueid = databaseAccess.get8Clue(t);
                    textView.setText(clueid);
                    if(clueid.equals("1")) {
                        openClue1();
                    }
                    else if(clueid.equals("2")) {
                        openClue2();
                    }
                    else if(clueid.equals("3")) {
                        openClue3();
                    }
                    else if(clueid.equals("4")) {
                        openClue4();
                    }
                    else if(clueid.equals("5")) {
                        openClue5();
                    }
                    else if(clueid.equals("6")) {
                        openClue6();
                    }
                    else if(clueid.equals("7")) {
                        openClue7();
                    }
                    else if(clueid.equals("8")) {
                        openClue8();
                    }

            }
            else{
                    textView.setText("Error");
                }





            }
        });

    }

    public void openClue1() {
        Intent intent = new Intent(this,Clue1.class);
        startActivity(intent);
    }
    public void openClue2() {
        Intent intent = new Intent(this,Clue2.class);
        startActivity(intent);
    }
    public void openClue3() {
        Intent intent = new Intent(this,Clue3.class);
        startActivity(intent);
    }
    public void openClue4() {
        Intent intent = new Intent(this,clue4.class);
        startActivity(intent);
    }
    public void openClue5() {
        Intent intent = new Intent(this,clue5.class);
        startActivity(intent);
    }
    public void openClue6() {
        Intent intent = new Intent(this,Clue6.class);
        startActivity(intent);
    }
    public void openClue7() {
        Intent intent = new Intent(this,clue7.class);
        startActivity(intent);
    }
    public void openClue8() {
        Intent intent = new Intent(this,clue8.class);
        startActivity(intent);
    }

}
