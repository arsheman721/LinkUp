package com.example.ahmed.bfreshersappsql;

import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tomer.fadingtextview.FadingTextView;

import java.util.ArrayList;

public class MapMarkingActivity extends AppCompatActivity {

    TextView tv2;
    static public String comment,new_comment;
    public int Colorname=0,lastColor=0;
    private float x,y;
    static public float x1,y1;
    private View.OnTouchListener onTouch1;
    private EditText editText;
    static public boolean hascomment=false,no_tip=false;
    FadingTextView ft;

    private RelativeLayout rlayout;
    public ArrayList<String> used_name = new ArrayList<String>();
    public ArrayList<String> Comment = new ArrayList<String>();
    public ArrayList<Float> X = new ArrayList<Float>();
    public ArrayList<Float> Y = new ArrayList<Float>();

    public String setName(){
        double newn = CS2004.UR(0,10);
       String newname="comment"+newn;
        for(int i=0;i<used_name.size();i++){

            if(newname==used_name.get(i)){
                newname="comment"+CS2004.UR(0,10);;
            }

        }
        used_name.add(newname);
        return newname;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_marking);

        rlayout = findViewById(R.id.rlayout);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);



        ft = findViewById(R.id.fadingTextView_tip);
        editText = findViewById(R.id.editText);

        tv2 = findViewById(R.id.tv2);


//        if(no_tip){
//            ft.stop();
//            ft.setVisibility(View.GONE);
//        }

        if(hascomment){
            tv2.setX(x1-55f);
            tv2.setY(y1-70f);
            tv2.setBackgroundResource(R.drawable.comment_b);
            tv2.setText(new_comment);
            tv2.setVisibility(View.VISIBLE);
        }




        rlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = event.getX();
                y = event.getY();

                ft.stop();
                ft.setVisibility(View.GONE);
                no_tip=true;

                if(event.getAction() == MotionEvent.ACTION_UP){





//                    while(Colorname==lastColor){
//                        int col = CS2004.UI(1,4);
//                        switch(col) {
//                            case 1:
//                                Colorname = 1;
//                            case 2:
//                                Colorname =2;
//                            case 3:
//                                Colorname = 3;
//                            case 4:
//                                Colorname = 4;
//
//                        }
//                    }
//                    switch(Colorname) {
//                        case 1:
//                            tv2.setBackgroundColor(R.drawable.comment_r);
//                            lastColor=Colorname;
//                        case 2:
//                            tv2.setBackgroundColor(R.drawable.comment_y);
//                            lastColor=Colorname;
//                        case 3:
//                            tv2.setBackgroundColor(R.drawable.comment_b);
//                            lastColor=Colorname;
//                        case 4:
//                            tv2.setBackgroundColor(R.drawable.comment_g);
//                            lastColor=Colorname;
//
//                    }
//



                    AlertDialog.Builder builder = new AlertDialog.Builder(MapMarkingActivity.this);
                    builder.setMessage("Pin on tapped Position?")
                            .setCancelable(false)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {


                                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MapMarkingActivity.this);
                                    final EditText input = new EditText(MapMarkingActivity.this);
                                    input.setInputType(InputType.TYPE_CLASS_TEXT);
                                    builder1.setView(input);
                                    builder1.setMessage("Enter comment in the dialog")
                                            .setCancelable(false)
                                            .setPositiveButton("Enter", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {

                                                    new_comment=input.getText().toString();
                                                    tv2.setX(x-55f);
                                                    tv2.setY(y-70f);
                                                    tv2.setBackgroundResource(R.drawable.comment_b);
                                                    tv2.setText(new_comment);

                                                    tv2.setVisibility(View.VISIBLE);
                                                    editText.setVisibility(View.INVISIBLE);
                                                    hascomment = true;
                                                    x1=x; y1=y;
                                                }
                                            })
                                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    editText.setVisibility(View.INVISIBLE);
                                                    dialog.cancel();

                                                }
                                            });
                                    AlertDialog alert = builder1.create();
                                    alert.setTitle("Pin On Map");

                                    alert.show();
                                    editText.setVisibility(View.VISIBLE);




                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    editText.setVisibility(View.INVISIBLE);
                                    dialog.cancel();
//                                    tv2.setVisibility(View.INVISIBLE);
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.setTitle("Pin");

                    alert.show();




//                    Comment.add(comment);
//                    X.add(x);
//                    Y.add(y);


                }

                return true;
            }
        });







    }

}
