package dk.itu.smdp.group2.questionnaire;

import dk.itu.smdp.group2.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class QuestionsFragment extends Fragment {
	
	private void init(LinearLayout ll) {
		// THIS IS WHERE AUTO GENERATED SHOULD CREATE OBJECTS
		// AND PUT THEM IN THE SCROLLVIEW'S LINEAR LAYOUT
		
		/*
		
		Questionnaire qn = new Questionnaire(this.getActivity(),"Title","john@rambo.dk");
		ChoiceQuestion cq;
								//                 mandatory/min/max
		cq = new ChoiceQuestion("Title","Description",false,1,1);
		qn.addQuestion(cq);
		cq.addCondition("food");
		//           id      text
		cq.addOption("food2","I like food");
		...
		
		qn.generateAllViews(ll);
		
		*/
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.questions_fragment, container, false);
		init((LinearLayout)v.findViewById(R.id.svsLinearLayout));
		return v;
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

}
