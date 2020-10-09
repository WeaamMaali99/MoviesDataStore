package edu.cs.birzeit.moviesdatastore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
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
    //    String[] item =new String[]{"title","year","Genre"};
        String[] titleMovies=objMovies.getTitleMovies();
        String[] generMovies=objMovies.getGenreovies();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,generMovies);
        spinner.setAdapter(adapter);


    }

    public void btnGetMoviesOnClick(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMoves = factory.getModel();
        String selection = "";
        selection = spinner.getSelectedItem().toString();
        List<Movies> movies=objMoves.getMovies(selection,selection,selection);
        String item="";
        for (Movies m:movies){

            item += m.getTitle() + "\n" + m.getYear() + "\n" + m.getGenre()+"\n";

        }
        editText.setText(item);

      //  if (selection.equals("title")) {
 //   StringBuilder builder = new StringBuilder();
 //   String[] titles= new String[]{"The Lion King","Halloween","some Like it Hot","Wonder Woman","Home Alone"};
//for (String s :titles) {
  //  builder.append(s).append("\n ");
  //  editText.setText(builder.toString());
//}



//}else if (selection.equals("year")){
  //  StringBuilder builder = new StringBuilder();
  //  String[] years= new String[]{"1994","2017","1978","1959"};
  //  for (String s :years) {
   //     builder.append(s).append("\n ");
   //     editText.setText(builder.toString());
   // }
  //  }else if (selection.equals("Genre")){
  //  StringBuilder builder = new StringBuilder();
  //  String[] Genres= new String[]{"Animation","Action","Horror","Comedy"};
 //   for (String s :Genres) {
   //     builder.append(s).append("\n ");
   //     editText.setText(builder.toString());

 //  }
}

  //  }

    public void btnSearchMovies(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMoves = factory.getModel();
        String str = "";
        str=editText2.getText().toString();
        List<Movies> movies=objMoves.getMovies(str,str,str);
        String item="";
        for (Movies m:movies){

        item += m.getTitle() + "\n" + m.getYear() + "\n" + m.getGenre()+"\n";

        }
        editText.setText(item);

    }

}