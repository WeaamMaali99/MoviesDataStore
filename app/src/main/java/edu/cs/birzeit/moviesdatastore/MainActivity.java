package edu.cs.birzeit.moviesdatastore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import edu.cs.birzeit.moviesdatastore.model.IMovieDa;
import edu.cs.birzeit.moviesdatastore.model.MovieFactory;
import edu.cs.birzeit.moviesdatastore.model.Movies;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
private EditText editText;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        editText=findViewById(R.id.edtSelectMovies);
        editText2=findViewById(R.id.EdtSearch);
        populateSpinner();
    }
    private void populateSpinner(){
        MovieFactory factory=new MovieFactory();
        IMovieDa objMovies =factory.getModel();
        String[] titleMovies=objMovies.getTitleMovies();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,titleMovies);
        spinner.setAdapter(adapter);

    }

    public void btnGetMoviesOnClick(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMoves = factory.getModel();
        String str = "";
        str = spinner.getSelectedItem().toString();
        List<Movies> movies=objMoves.getMovies(str);
        String str1 = "";

        for (Movies mm :movies) {
            str1+=mm.getTitle() + "\n" + mm.getYear() + "\n" + mm.getGenre();
        }
        editText.setText(str1);

    }

    public void btnSearchMovies(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMoves = factory.getModel();
        String str = "";
        str=editText2.getText().toString();
        List<Movies> movies=objMoves.getMovies(str);
        String item="";
        for (Movies m:movies){

        item += m.getTitle() + "\n" + m.getYear() + "\n" + m.getGenre();

        }
        editText.setText(item);

    }

}