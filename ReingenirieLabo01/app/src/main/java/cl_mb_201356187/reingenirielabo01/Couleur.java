package cl_mb_201356187.reingenirielabo01;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ToggleButton;
import android.view.View;

public class Couleur extends AppCompatActivity {


    private View mZoneCouleur;
    private ToggleButton BoutonRouge;
    private ToggleButton BoutonVert;
    private ToggleButton BoutonBleu;
    private int couleurbackground = Color.BLACK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couleur);

        mZoneCouleur = findViewById(R.id.zone_couleur);
        mZoneCouleur.setBackgroundColor(couleurbackground);
        BoutonRouge = (ToggleButton)findViewById(R.id.bouton1);
        BoutonVert = (ToggleButton)findViewById(R.id.bouton2);
        BoutonBleu = (ToggleButton)findViewById(R.id.bouton3);

        BoutonRouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(BoutonRouge.isChecked())
                    couleurbackground = couleurbackground | 0x00FF0000;
                else
                    couleurbackground = couleurbackground & 0xFF00FFFF;

                mZoneCouleur.setBackgroundColor(couleurbackground);
            }
        });

        BoutonVert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(BoutonVert.isChecked())
                    couleurbackground = couleurbackground | 0x0000FF00;
                else
                    couleurbackground = couleurbackground & 0xFFFF00FF;

                mZoneCouleur.setBackgroundColor(couleurbackground);
            }
        });

        BoutonBleu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(BoutonBleu.isChecked())
                    couleurbackground = couleurbackground | 0x000000FF;
                else
                    couleurbackground = couleurbackground & 0xFFFFFF00;

                mZoneCouleur.setBackgroundColor(couleurbackground);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_couleur, menu);
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
