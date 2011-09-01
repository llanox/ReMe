package info.llanox.reme.mobile;



import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListRemindersActivity extends Activity {
	
	  static final String[] REMINDERS = new String[] {
		    "Honey, I love u!!", 
		    "I love my life when U are in it.", 
		    "Without you I am incomplete.", 
		    "I’m not there by your side But my heart’s right there with yours Miss you!", 
		    "Sending you my heart to say I love you More than words can say",
		    "I love my life when U are in it.", 
		    "Without you I am incomplete.", 
		    "I’m not there by your side But my heart’s right there with yours Miss you!", 
		    "Sending you my heart to say I love you More than words can say",
		   };
	  
	  private  ListView listaItemsReceta;
	  private  ListAdapter adapterGenerico;
	
	  
		 @Override
		  public void onCreate(Bundle savedInstanceState) {
		      super.onCreate(savedInstanceState);            
		      setContentView(R.layout.reminders);
		      
		      
		 
		      // Traemos una instancia de la ListView que tiene por id listaRecetas
		      // la vista ListView se encuentra en el archivo recetas.xml
		      listaItemsReceta = (ListView)findViewById(R.id.remindersList);
		     
		      //Creamos un adaptador generic, pero también usamos una vista generica para mostrar el item
		      //Las vistas genericas las podemos encontrar en android.R.layout
		      adapterGenerico = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,REMINDERS);
		      
		      //Agregamos el adaptador a la lista
		      //EL adaptador es el que decide como va pintar cada uno de los items de la lista.
		      listaItemsReceta.setAdapter(adapterGenerico);
		      
		      
		            
		      
		  } 
	

}
