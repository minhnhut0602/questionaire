/*
 * generated by Xtext
 */
package dk.itu.smdp.group2.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractQuestionaireValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("platform:/resource/Questionaire/model/QuestionaireModel.ecore"));
		return result;
	}
}