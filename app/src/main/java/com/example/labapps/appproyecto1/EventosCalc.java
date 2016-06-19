package com.example.labapps.appproyecto1;

import android.view.View;
import android.widget.Button;

/**
 * Created by ronyclar on 06/18/16.
 */
public class EventosCalc extends ActivityCalculadora implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5;
    Button btn6,btn7,btn8,btn9,btn0;
    Button btnC,btnD,btnEqual,btnBracket,btnDot;
    Button btnMinus,btnPlus,btnMult,btnDivide,btnPow;

    public EventosCalc(){
        btn1=(Button) findViewById(R.id.btnOne);
        btn2=(Button) findViewById(R.id.btnTwo);
        btn3=(Button) findViewById(R.id.btnTree);
        btn4=(Button) findViewById(R.id.btnFour);
        btn5=(Button) findViewById(R.id.btnfive);
        btn6=(Button) findViewById(R.id.btnSix);
        btn7=(Button) findViewById(R.id.btnSeven);
        btn8=(Button) findViewById(R.id.btnEith);
        btn9=(Button) findViewById(R.id.btnNine);
        btn0=(Button) findViewById(R.id.btnCero);
        btnPlus=(Button) findViewById(R.id.btnPlus);
        btnMinus=(Button) findViewById(R.id.btnMinus);
        btnMult=(Button) findViewById(R.id.btnMul);
        btnDivide=(Button) findViewById(R.id.btnDiv);
        btnPow=(Button) findViewById(R.id.btnPow);
        btnC=(Button) findViewById(R.id.btnAc);
        btnD=(Button) findViewById(R.id.btnDel);
        btnEqual=(Button) findViewById(R.id.btnEqual);
        btnBracket=(Button) findViewById(R.id.btnBrackets);
        btnDot=(Button) findViewById(R.id.btnDot);

    }
    @Override
    public void onClick(View v) {

    }
}
