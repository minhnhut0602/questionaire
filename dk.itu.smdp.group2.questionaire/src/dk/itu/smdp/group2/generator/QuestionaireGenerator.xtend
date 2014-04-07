/*
 * generated by Xtext
 */
package dk.itu.smdp.group2.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import questionairemodel.*

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class QuestionaireGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Questionaire)).forEach [ Questionaire it |
			val fname = it.name.toFirstUpper
			// generate Android implementation
			fsa.generateFile("android/" + fname + ".java", AndroidGenerator.compileToAndroid(it))
			//TODO: other Android stuff?
			
			
			// generate Latex
			fsa.generateFile("latex/" + ".tex", LatexGenerator.compileToLatex(it))
			//TODO: other Latex stuff?
		]
	}
}
