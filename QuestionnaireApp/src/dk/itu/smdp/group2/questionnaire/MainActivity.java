package dk.itu.smdp.group2.questionnaire;

import dk.itu.smdp.group2.R;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // sets our QuestionsFragment as the current layout
        setContentView(R.layout.activity_main);        
    }    
}

