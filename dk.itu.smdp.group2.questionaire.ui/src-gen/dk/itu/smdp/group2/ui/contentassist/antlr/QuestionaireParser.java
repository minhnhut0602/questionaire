/*
* generated by Xtext
*/
package dk.itu.smdp.group2.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.itu.smdp.group2.services.QuestionaireGrammarAccess;

public class QuestionaireParser extends AbstractContentAssistParser {
	
	@Inject
	private QuestionaireGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser createParser() {
		dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser result = new dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getQuestionaireAccess().getGroup(), "rule__Questionaire__Group__0");
					put(grammarAccess.getQuestionaireAccess().getGroup_5(), "rule__Questionaire__Group_5__0");
					put(grammarAccess.getQuestionaireAccess().getGroup_5_3(), "rule__Questionaire__Group_5_3__0");
					put(grammarAccess.getHeadingAccess().getGroup(), "rule__Heading__Group__0");
					put(grammarAccess.getParagraphAccess().getGroup(), "rule__Paragraph__Group__0");
					put(grammarAccess.getTextQuestionAccess().getGroup(), "rule__TextQuestion__Group__0");
					put(grammarAccess.getTextQuestionAccess().getGroup_8(), "rule__TextQuestion__Group_8__0");
					put(grammarAccess.getTextQuestionAccess().getGroup_9(), "rule__TextQuestion__Group_9__0");
					put(grammarAccess.getTextQuestionAccess().getGroup_9_3(), "rule__TextQuestion__Group_9_3__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup(), "rule__ChoiceQuestion__Group__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup_7(), "rule__ChoiceQuestion__Group_7__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup_8(), "rule__ChoiceQuestion__Group_8__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup_9(), "rule__ChoiceQuestion__Group_9__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup_10(), "rule__ChoiceQuestion__Group_10__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup_10_3(), "rule__ChoiceQuestion__Group_10_3__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup_14(), "rule__ChoiceQuestion__Group_14__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup(), "rule__MatrixQuestion__Group__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_7(), "rule__MatrixQuestion__Group_7__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_8(), "rule__MatrixQuestion__Group_8__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_8_3(), "rule__MatrixQuestion__Group_8_3__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_9(), "rule__MatrixQuestion__Group_9__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_9_3(), "rule__MatrixQuestion__Group_9_3__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_12(), "rule__MatrixQuestion__Group_12__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_12_3(), "rule__MatrixQuestion__Group_12_3__0");
					put(grammarAccess.getCalendarQuestionAccess().getGroup(), "rule__CalendarQuestion__Group__0");
					put(grammarAccess.getCalendarQuestionAccess().getGroup_12(), "rule__CalendarQuestion__Group_12__0");
					put(grammarAccess.getCalendarQuestionAccess().getGroup_13(), "rule__CalendarQuestion__Group_13__0");
					put(grammarAccess.getCalendarQuestionAccess().getGroup_13_3(), "rule__CalendarQuestion__Group_13_3__0");
					put(grammarAccess.getIntegerQuestionAccess().getGroup(), "rule__IntegerQuestion__Group__0");
					put(grammarAccess.getIntegerQuestionAccess().getGroup_7(), "rule__IntegerQuestion__Group_7__0");
					put(grammarAccess.getIntegerQuestionAccess().getGroup_14(), "rule__IntegerQuestion__Group_14__0");
					put(grammarAccess.getIntegerQuestionAccess().getGroup_14_3(), "rule__IntegerQuestion__Group_14_3__0");
					put(grammarAccess.getQuestionConditionAccess().getGroup(), "rule__QuestionCondition__Group__0");
					put(grammarAccess.getQuestionConditionAccess().getGroup_5(), "rule__QuestionCondition__Group_5__0");
					put(grammarAccess.getOptionAccess().getGroup(), "rule__Option__Group__0");
					put(grammarAccess.getOptionAccess().getGroup_2(), "rule__Option__Group_2__0");
					put(grammarAccess.getOptionAccess().getGroup_3(), "rule__Option__Group_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getQuestionaireAccess().getNameAssignment_1(), "rule__Questionaire__NameAssignment_1");
					put(grammarAccess.getQuestionaireAccess().getResultEmailAssignment_4(), "rule__Questionaire__ResultEmailAssignment_4");
					put(grammarAccess.getQuestionaireAccess().getElementsAssignment_5_2(), "rule__Questionaire__ElementsAssignment_5_2");
					put(grammarAccess.getQuestionaireAccess().getElementsAssignment_5_3_1(), "rule__Questionaire__ElementsAssignment_5_3_1");
					put(grammarAccess.getHeadingAccess().getTextAssignment_3(), "rule__Heading__TextAssignment_3");
					put(grammarAccess.getParagraphAccess().getTextAssignment_3(), "rule__Paragraph__TextAssignment_3");
					put(grammarAccess.getTextQuestionAccess().getMandatoryAssignment_0(), "rule__TextQuestion__MandatoryAssignment_0");
					put(grammarAccess.getTextQuestionAccess().getMultilineAssignment_1(), "rule__TextQuestion__MultilineAssignment_1");
					put(grammarAccess.getTextQuestionAccess().getIdAssignment_5(), "rule__TextQuestion__IdAssignment_5");
					put(grammarAccess.getTextQuestionAccess().getTitleAssignment_7(), "rule__TextQuestion__TitleAssignment_7");
					put(grammarAccess.getTextQuestionAccess().getDescriptionAssignment_8_1(), "rule__TextQuestion__DescriptionAssignment_8_1");
					put(grammarAccess.getTextQuestionAccess().getConditionsAssignment_9_2(), "rule__TextQuestion__ConditionsAssignment_9_2");
					put(grammarAccess.getTextQuestionAccess().getConditionsAssignment_9_3_1(), "rule__TextQuestion__ConditionsAssignment_9_3_1");
					put(grammarAccess.getChoiceQuestionAccess().getMandatoryAssignment_0(), "rule__ChoiceQuestion__MandatoryAssignment_0");
					put(grammarAccess.getChoiceQuestionAccess().getIdAssignment_4(), "rule__ChoiceQuestion__IdAssignment_4");
					put(grammarAccess.getChoiceQuestionAccess().getTitleAssignment_6(), "rule__ChoiceQuestion__TitleAssignment_6");
					put(grammarAccess.getChoiceQuestionAccess().getDescriptionAssignment_7_1(), "rule__ChoiceQuestion__DescriptionAssignment_7_1");
					put(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_8_1(), "rule__ChoiceQuestion__MinSelectionsAssignment_8_1");
					put(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsAssignment_9_1(), "rule__ChoiceQuestion__MaxSelectionsAssignment_9_1");
					put(grammarAccess.getChoiceQuestionAccess().getConditionsAssignment_10_2(), "rule__ChoiceQuestion__ConditionsAssignment_10_2");
					put(grammarAccess.getChoiceQuestionAccess().getConditionsAssignment_10_3_1(), "rule__ChoiceQuestion__ConditionsAssignment_10_3_1");
					put(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_13(), "rule__ChoiceQuestion__OptionsAssignment_13");
					put(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_14_1(), "rule__ChoiceQuestion__OptionsAssignment_14_1");
					put(grammarAccess.getMatrixQuestionAccess().getMandatoryAssignment_0(), "rule__MatrixQuestion__MandatoryAssignment_0");
					put(grammarAccess.getMatrixQuestionAccess().getIdAssignment_4(), "rule__MatrixQuestion__IdAssignment_4");
					put(grammarAccess.getMatrixQuestionAccess().getTitleAssignment_6(), "rule__MatrixQuestion__TitleAssignment_6");
					put(grammarAccess.getMatrixQuestionAccess().getDescriptionAssignment_7_1(), "rule__MatrixQuestion__DescriptionAssignment_7_1");
					put(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_8_2(), "rule__MatrixQuestion__ColumnNamesAssignment_8_2");
					put(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_8_3_1(), "rule__MatrixQuestion__ColumnNamesAssignment_8_3_1");
					put(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_9_2(), "rule__MatrixQuestion__RowNamesAssignment_9_2");
					put(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_9_3_1(), "rule__MatrixQuestion__RowNamesAssignment_9_3_1");
					put(grammarAccess.getMatrixQuestionAccess().getMaxPerRowAssignment_11(), "rule__MatrixQuestion__MaxPerRowAssignment_11");
					put(grammarAccess.getMatrixQuestionAccess().getConditionsAssignment_12_2(), "rule__MatrixQuestion__ConditionsAssignment_12_2");
					put(grammarAccess.getMatrixQuestionAccess().getConditionsAssignment_12_3_1(), "rule__MatrixQuestion__ConditionsAssignment_12_3_1");
					put(grammarAccess.getCalendarQuestionAccess().getMandatoryAssignment_0(), "rule__CalendarQuestion__MandatoryAssignment_0");
					put(grammarAccess.getCalendarQuestionAccess().getYearAssignment_1(), "rule__CalendarQuestion__YearAssignment_1");
					put(grammarAccess.getCalendarQuestionAccess().getMonthAssignment_2(), "rule__CalendarQuestion__MonthAssignment_2");
					put(grammarAccess.getCalendarQuestionAccess().getDayAssignment_3(), "rule__CalendarQuestion__DayAssignment_3");
					put(grammarAccess.getCalendarQuestionAccess().getHourAssignment_4(), "rule__CalendarQuestion__HourAssignment_4");
					put(grammarAccess.getCalendarQuestionAccess().getMinuteAssignment_5(), "rule__CalendarQuestion__MinuteAssignment_5");
					put(grammarAccess.getCalendarQuestionAccess().getIdAssignment_9(), "rule__CalendarQuestion__IdAssignment_9");
					put(grammarAccess.getCalendarQuestionAccess().getTitleAssignment_11(), "rule__CalendarQuestion__TitleAssignment_11");
					put(grammarAccess.getCalendarQuestionAccess().getDescriptionAssignment_12_1(), "rule__CalendarQuestion__DescriptionAssignment_12_1");
					put(grammarAccess.getCalendarQuestionAccess().getConditionsAssignment_13_2(), "rule__CalendarQuestion__ConditionsAssignment_13_2");
					put(grammarAccess.getCalendarQuestionAccess().getConditionsAssignment_13_3_1(), "rule__CalendarQuestion__ConditionsAssignment_13_3_1");
					put(grammarAccess.getIntegerQuestionAccess().getMandatoryAssignment_0(), "rule__IntegerQuestion__MandatoryAssignment_0");
					put(grammarAccess.getIntegerQuestionAccess().getIdAssignment_4(), "rule__IntegerQuestion__IdAssignment_4");
					put(grammarAccess.getIntegerQuestionAccess().getTitleAssignment_6(), "rule__IntegerQuestion__TitleAssignment_6");
					put(grammarAccess.getIntegerQuestionAccess().getDescriptionAssignment_7_1(), "rule__IntegerQuestion__DescriptionAssignment_7_1");
					put(grammarAccess.getIntegerQuestionAccess().getMinValueAssignment_9(), "rule__IntegerQuestion__MinValueAssignment_9");
					put(grammarAccess.getIntegerQuestionAccess().getStepAssignment_11(), "rule__IntegerQuestion__StepAssignment_11");
					put(grammarAccess.getIntegerQuestionAccess().getMaxValueAssignment_13(), "rule__IntegerQuestion__MaxValueAssignment_13");
					put(grammarAccess.getIntegerQuestionAccess().getConditionsAssignment_14_2(), "rule__IntegerQuestion__ConditionsAssignment_14_2");
					put(grammarAccess.getIntegerQuestionAccess().getConditionsAssignment_14_3_1(), "rule__IntegerQuestion__ConditionsAssignment_14_3_1");
					put(grammarAccess.getQuestionConditionAccess().getOptionAssignment_4(), "rule__QuestionCondition__OptionAssignment_4");
					put(grammarAccess.getQuestionConditionAccess().getOptionAssignment_5_1(), "rule__QuestionCondition__OptionAssignment_5_1");
					put(grammarAccess.getOptionAccess().getIdAssignment_2_1(), "rule__Option__IdAssignment_2_1");
					put(grammarAccess.getOptionAccess().getTextAssignment_3_1(), "rule__Option__TextAssignment_3_1");
					put(grammarAccess.getOptionAccess().getQuestionAssignment_5(), "rule__Option__QuestionAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser typedParser = (dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser) parser;
			typedParser.entryRuleQuestionaire();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public QuestionaireGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QuestionaireGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}