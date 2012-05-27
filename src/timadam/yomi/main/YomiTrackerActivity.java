package timadam.yomi.main;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class YomiTrackerActivity extends Activity {
    /** Called when the activity is first created. */
	public static final int P1 = 0, P2 = 1, PLAY = 2; 
	public int state = 0;
	
	public int p1health, p2health;
	public String name1, name2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
        		  WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
        		  WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.main);
        
        initiateButtons();
    }
    
    public void shiftState()
    {
    	if (state == P1)
    	{
    		setContentView(R.layout.main2);
    		initiateButtons();
    		
    		state = P2;
    	}
    	else if (state == P2)
    	{
    		setContentView(R.layout.game);
    		initGameButtons();
    		
    		EditText et1 = (EditText) findViewById(R.id.p1life);
    		et1.setText(p1health + "");
    		
    		EditText et2 = (EditText) findViewById(R.id.p2life);
    		et2.setText(p2health + "");
    		
    		setImages();
    		
    		state = PLAY;
    	}
    	else if (state == PLAY)
    	{
    		setContentView(R.layout.main);
    		initiateButtons();
    		state = P1;
    	}
    }

    public void setImages()
    {
		ImageView v1 = (ImageView) findViewById(R.id.p1image);
    	if (name1.equals("argagarg"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.argagarg2));
    	}
    	else if (name1.equals("balbasbeta"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.balbasbeta));
    	}
    	else if (name1.equals("degrey"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.degrey2));
    	}
    	else if (name1.equals("geiger"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.geiger2));
    	}
    	else if (name1.equals("gloria"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.gloria));
    	}
    	else if (name1.equals("grave"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.grave2));
    	}
    	else if (name1.equals("gwen"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.gwen));
    	}
    	else if (name1.equals("jaina"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.jaina2));
    	}
    	else if (name1.equals("lum"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.lum2));
    	}
    	else if (name1.equals("menelker"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.menelker));
    	}
    	else if (name1.equals("midori"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.midori2));
    	}
    	else if (name1.equals("onimaru"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.onimaru));
    	}
    	else if (name1.equals("persephone"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.persephone));
    	}
    	else if (name1.equals("quince"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.quince));
    	}
    	else if (name1.equals("rook"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.rook2));
    	}
    	else if (name1.equals("setsuki"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.setsuki2));
    	}
    	else if (name1.equals("troq"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.troq));
    	}
    	else if (name1.equals("valerie"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.valerie2));
    	}
    	else if (name1.equals("vendetta"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.vendetta));
    	}
    	else if (name1.equals("zane"))
    	{
    		v1.setImageDrawable(getResources().getDrawable(R.drawable.zane));
    	}
    	
    	
    	ImageView v2 = (ImageView) findViewById(R.id.p2image);
    	if (name2.equals("argagarg"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.argagarg2));
    	}
    	else if (name2.equals("balbasbeta"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.balbasbeta));
    	}
    	else if (name2.equals("degrey"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.degrey2));
    	}
    	else if (name2.equals("geiger"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.geiger2));
    	}
    	else if (name2.equals("gloria"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.gloria));
    	}
    	else if (name2.equals("grave"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.grave2));
    	}
    	else if (name2.equals("gwen"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.gwen));
    	}
    	else if (name2.equals("jaina"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.jaina2));
    	}
    	else if (name2.equals("lum"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.lum2));
    	}
    	else if (name2.equals("menelker"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.menelker));
    	}
    	else if (name2.equals("midori"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.midori2));
    	}
    	else if (name2.equals("onimaru"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.onimaru));
    	}
    	else if (name2.equals("persephone"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.persephone));
    	}
    	else if (name2.equals("quince"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.quince));
    	}
    	else if (name2.equals("rook"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.rook2));
    	}
    	else if (name2.equals("setsuki"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.setsuki2));
    	}
    	else if (name2.equals("troq"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.troq));
    	}
    	else if (name2.equals("valerie"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.valerie2));
    	}
    	else if (name2.equals("vendetta"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.vendetta));
    	}
    	else if (name2.equals("zane"))
    	{
    		v2.setImageDrawable(getResources().getDrawable(R.drawable.zane));
    	}
    }
    
    public void initGameButtons()
    {
    	Button button1 = (Button) findViewById(R.id.newgame);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	shiftState();
            }
        });
        Button button2 = (Button) findViewById(R.id.p1M1);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	p1health -= 1;
        		EditText et1 = (EditText) findViewById(R.id.p1life);
        		et1.setText(p1health + "");
        		if (p1health <= 0)
        			et1.setTextColor(Color.parseColor("#ff0000"));
        		else
        			et1.setTextColor(Color.parseColor("#000000"));
            }
        });
        Button button3 = (Button) findViewById(R.id.p1M10);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	p1health -= 5;
        		EditText et1 = (EditText) findViewById(R.id.p1life);
        		et1.setText(p1health + "");
        		if (p1health <= 0)
        			et1.setTextColor(Color.parseColor("#ff0000"));
        		else
        			et1.setTextColor(Color.parseColor("#000000"));
            }
        });
        Button button4 = (Button) findViewById(R.id.p1P1);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	p1health += 1;
        		EditText et1 = (EditText) findViewById(R.id.p1life);
        		et1.setText(p1health + "");
        		if (p1health <= 0)
        			et1.setTextColor(Color.parseColor("#ff0000"));
        		else
        			et1.setTextColor(Color.parseColor("#000000"));
            }
        });
        Button button5 = (Button) findViewById(R.id.p1P10);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	p1health += 5;
        		EditText et1 = (EditText) findViewById(R.id.p1life);
        		et1.setText(p1health + "");
        		if (p1health <= 0)
        			et1.setTextColor(Color.parseColor("#ff0000"));
        		else
        			et1.setTextColor(Color.parseColor("#000000"));
            }
        });
        Button button6 = (Button) findViewById(R.id.p2M1);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	p2health -= 1;
        		EditText et2 = (EditText) findViewById(R.id.p2life);
        		et2.setText(p2health + "");
        		if (p2health <= 0)
        			et2.setTextColor(Color.parseColor("#ff0000"));
        		else
        			et2.setTextColor(Color.parseColor("#000000"));
            }
        });
        Button button7 = (Button) findViewById(R.id.p2M10);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	p2health -= 5;
        		EditText et2 = (EditText) findViewById(R.id.p2life);
        		et2.setText(p2health + "");
        		if (p2health <= 0)
        			et2.setTextColor(Color.parseColor("#ff0000"));
        		else
        			et2.setTextColor(Color.parseColor("#000000"));
            }
        });
        Button button9 = (Button) findViewById(R.id.p2P1);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	p2health += 1;
        		EditText et2 = (EditText) findViewById(R.id.p2life);
        		et2.setText(p2health + "");
        		if (p2health <= 0)
        			et2.setTextColor(Color.parseColor("#ff0000"));
        		else
        			et2.setTextColor(Color.parseColor("#000000"));
            }
        });
        Button button8 = (Button) findViewById(R.id.p2P10);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	p2health += 5;
        		EditText et2 = (EditText) findViewById(R.id.p2life);
        		et2.setText(p2health + "");
        		if (p2health <= 0)
        			et2.setTextColor(Color.parseColor("#ff0000"));
        		else
        			et2.setTextColor(Color.parseColor("#000000"));
            }
        });
    }
    
    public void initiateButtons()
    {
    	Button button1 = (Button) findViewById(R.id.argagargbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 85;
            		name1 = "argagarg";
            	}
            	if (state == P2)
            	{
            		p2health = 85;
        			name2 = "argagarg";
        		}
            	shiftState();
            }
        });
        Button button2 = (Button) findViewById(R.id.balbasbetabutton);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 90;
            		name1 ="balbasbeta";
            	}
            	if (state == P2)
            	{
            		p2health = 90;
            		name2 = "balbasbeta";
            	}
            	shiftState();
            }
        });
        Button button3 = (Button) findViewById(R.id.degreybutton);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 90;
            		name1 = "degrey";
            	}
            	if (state == P2)
            	{
            		p2health = 90;
            		name2 = "degrey";
            	}
            	shiftState();
            }
        });
        Button button4 = (Button) findViewById(R.id.geigerbutton);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 90;
            		name1 = "geiger";
            	}
            	if (state == P2)
            	{
            		p2health = 90;
            		name2 = "geiger";
            	}
            	shiftState();
            }
        });
        Button button5 = (Button) findViewById(R.id.gloriabutton);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 70;
            		name1 = "gloria";
            	}
            	if (state == P2)
            	{
            		p2health = 70;
            		name2 = "gloria";
            	}
            	shiftState();
            }
        });
        Button button6 = (Button) findViewById(R.id.gravebutton);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 90;
            		name1 = "grave";
            	}
            	if (state == P2)
            	{
            		p2health = 90;
            		name2 = "grave";
            	}
            	shiftState();
            }
        });
        Button button7 = (Button) findViewById(R.id.gwenbutton);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 85;
            		name1 = "gwen";
            	}
            	if (state == P2)
            	{
            		p2health = 85;
            		name2 = "gwen";
            	}
            	shiftState();
            }
        });
        Button button8 = (Button) findViewById(R.id.jainabutton);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 85;
            		name1 = "jaina";
            	}
            	if (state == P2)
            	{
            		p2health = 85;
            		name2 = "jaina";
            	}
            	shiftState();
            }
        });
        Button button9 = (Button) findViewById(R.id.lumbutton);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 90;
            		name1 = "lum";
            	}
            	if (state == P2)
            	{
            		p2health = 90;
            		name2 = "lum";
            	}
            	shiftState();
            }
        });
        Button button10 = (Button) findViewById(R.id.menelkerbutton);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 70;
            		name1 = "menelker";
            	}
            	if (state == P2)
            	{
            		p2health = 70;
            		name2 = "menelker";
            	}
            	shiftState();
            }
        });
        Button button11 = (Button) findViewById(R.id.midoributton);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 90;
            		name1 = "midori";
            	}
            	if (state == P2)
            	{
            		p2health = 90;
            		name2 = "midori";
            	}
            	shiftState();
            }
        });
        Button button12 = (Button) findViewById(R.id.onimarubutton);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 90;
            		name1 = "onimaru";
            	}
            	if (state == P2)
            	{
            		p2health = 90;
            		name2 = "onimaru";
            	}
            	shiftState();
            }
        });
        Button button13 = (Button) findViewById(R.id.persephonebutton);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 70;
            		name1 = "persephone";
            	}
            	if (state == P2)
            	{
            		p2health = 70;
            		name2 = "persephone";
            	}
            	shiftState();
            }
        });
        Button button14 = (Button) findViewById(R.id.quincebutton);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 90;
            		name1 = "quince";
            	}
            	if (state == P2)
            	{
            		p2health = 90;
            		name2 = "quince";
            	}
            	shiftState();
            }
        });
        Button button15 = (Button) findViewById(R.id.rookbutton);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 100;
            		name1 = "rook";
            	}
            	if (state == P2)
            	{
            		p2health = 100;
            		name2 = "rook";
            	}
            	shiftState();
            }
        });
        Button button16 = (Button) findViewById(R.id.setsukibutton);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 70;
            		name1 = "setsuki";
            	}
            	if (state == P2)
            	{
            		p2health = 70;
            		name2 = "setsuki";
            	}
            	shiftState();
            }
        });
        Button button17 = (Button) findViewById(R.id.troqbutton);
        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 95;
            		name1 = "troq";
            	}
            	if (state == P2)
            	{
            		p2health = 95;
            		name2 = "troq";
            	}
            	shiftState();
            }
        });
        Button button18 = (Button) findViewById(R.id.valeriebutton);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 80;
            		name1 = "valerie";
            	}
            	if (state == P2)
            	{
            		p2health = 80;
            		name2 = "valerie";
            	}
            	shiftState();
            }
        });
        Button button19 = (Button) findViewById(R.id.vendettabutton);
        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 75;
            		name1 = "vendetta";
            	}
            	if (state == P2)
            	{
            		p2health = 75;
            		name2 = "vendetta";
            	}
            	shiftState();
            }
        });
        Button button20 = (Button) findViewById(R.id.zanebutton);
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (state == P1)
            	{
            		p1health = 85;
            		name1 = "zane";
            	}
            	if (state == P2)
            	{
            		p2health = 85;
            		name2 = "zane";
            	}
            	shiftState();
            }
        });
    }
}