package charlielaplante_201356187.reinginirielabo012;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;

import java.util.Random;


public class QuoteAndShizzle extends AppCompatActivity {
    String Quote = "";
    ImageButton bouton  ;
    ImageButton bouton1 ;
    ImageButton bouton2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_and_shizzle);

        bouton = (ImageButton)findViewById(R.id.imageButton1);
        bouton1 = (ImageButton)findViewById(R.id.imageButton2);
        bouton2 = (ImageButton)findViewById(R.id.imageButton3);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        bouton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Quote = RandomQuote(bouton);
                for (int i=0; i < 2; i++) {
                    Toast.makeText(QuoteAndShizzle.this,
                            Quote, Toast.LENGTH_LONG).show();
                }

            }
        });
        bouton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Quote = RandomQuote(bouton1);
                for (int i=0; i < 2; i++)
                {
                    Toast.makeText(QuoteAndShizzle.this, Quote, Toast.LENGTH_LONG).show();
                }
            }
        });
        bouton2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Quote = RandomQuote(bouton2);
                for (int i = 0; i < 2; i++) {
                    Toast.makeText(QuoteAndShizzle.this,
                            Quote, Toast.LENGTH_LONG).show();
                }

            }
        });

    }
    int randomInt = 0;
    public String RandomQuote (ImageButton buttappuyé)
    {
        Random randomGenerator = new Random();
        int tempo;
        do
        {
            tempo = randomGenerator.nextInt(5);
        }while(tempo == randomInt);
        randomInt = tempo;
        String[] Quoteyo;
        String message = "";
        switch(buttappuyé.getId())
        {
            case R.id.imageButton1:
                Quoteyo = getResources().getStringArray(R.array.Jonathan);
                message = Quoteyo[randomInt];
                break;
            case R.id.imageButton2:
                Quoteyo = getResources().getStringArray(R.array.Momo);
                message = Quoteyo[randomInt];
                break;
            case R.id.imageButton3:
                Quoteyo = getResources().getStringArray(R.array.Kevin);
                message = Quoteyo[randomInt];
                break;
        }

        return message;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quote_and_shizzle, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
