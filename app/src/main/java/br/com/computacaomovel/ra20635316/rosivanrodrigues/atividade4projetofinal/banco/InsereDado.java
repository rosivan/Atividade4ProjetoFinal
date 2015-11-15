package br.com.computacaomovel.ra20635316.rosivanrodrigues.atividade4projetofinal.banco;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.computacaomovel.ra20635316.rosivanrodrigues.atividade4projetofinal.R;

/**
 * Created by rosivanrs on 15/11/15.
 */
public class InsereDado extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO: Alterar activity
        setContentView(R.layout.activity_main);

        Button botao = (Button)findViewById(R.id.button);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());


                EditText titulo = (EditText)findViewById(R.id.editText);
                EditText autor = (EditText)findViewById((R.id.editText2));
                EditText editora = (EditText)findViewById(R.id.editText3);
                String tituloString = titulo.getText().toString();
                String autorString = autor.getText().toString();
                String editoraString = editora.getText().toString();
                String resultado; resultado = crud.insereDado(tituloString,autorString,editoraString);

                Toast.makeText(getApplicationContext(), resultado,
                        Toast.LENGTH_LONG).show();
            }
        });
    }



}
