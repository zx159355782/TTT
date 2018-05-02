package com.example.cjcu.ttt;

import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.EditText;
        import android.widget.Button;
        import android.widget.TextView;
        import java.text.DecimalFormat;
public class MainActivity extends Activity {
    private EditText inp_lend,inp_rate,inp_number;
    private TextView res_amount;
    private Button subit;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setComponent();
        setListener();
    }
    public void setComponent(){
        inp_lend=(EditText)this.findViewById(R.id.input_lend);
        inp_rate=(EditText)this.findViewById(R.id.input_rate);
        inp_number=(EditText)this.findViewById(R.id.input_number);
        res_amount=(TextView)this.findViewById(R.id.amount);
        subit=(Button)this.findViewById(R.id.submit);
    }
    public void setListener(){
        subit.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0) {
                DecimalFormat df=new DecimalFormat("0");
                double d_lend=Double.parseDouble(inp_lend.getText().toString());
                double d_rate=Double.parseDouble(inp_rate.getText().toString());
                double d_number=Double.parseDouble(inp_number.getText().toString());
                double resault=d_lend*Math.pow((d_rate/12/100)+1, d_number);
                res_amount.setText("本利和為:"+df.format(resault));
            }
        });
    }
}