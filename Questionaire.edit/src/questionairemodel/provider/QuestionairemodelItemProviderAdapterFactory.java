/**
 */
package questionairemodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import questionairemodel.util.QuestionairemodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionairemodelItemProviderAdapterFactory extends QuestionairemodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionairemodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.Questionaire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionaireItemProvider questionaireItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.Questionaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestionaireAdapter() {
		if (questionaireItemProvider == null) {
			questionaireItemProvider = new QuestionaireItemProvider(this);
		}

		return questionaireItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.Heading} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadingItemProvider headingItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.Heading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeadingAdapter() {
		if (headingItemProvider == null) {
			headingItemProvider = new HeadingItemProvider(this);
		}

		return headingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.Paragraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphItemProvider paragraphItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParagraphAdapter() {
		if (paragraphItemProvider == null) {
			paragraphItemProvider = new ParagraphItemProvider(this);
		}

		return paragraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.TextQuestion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextQuestionItemProvider textQuestionItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.TextQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextQuestionAdapter() {
		if (textQuestionItemProvider == null) {
			textQuestionItemProvider = new TextQuestionItemProvider(this);
		}

		return textQuestionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.ChoiceQuestion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceQuestionItemProvider choiceQuestionItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.ChoiceQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceQuestionAdapter() {
		if (choiceQuestionItemProvider == null) {
			choiceQuestionItemProvider = new ChoiceQuestionItemProvider(this);
		}

		return choiceQuestionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.Option} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionItemProvider optionItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionAdapter() {
		if (optionItemProvider == null) {
			optionItemProvider = new OptionItemProvider(this);
		}

		return optionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.MatrixQuestion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixQuestionItemProvider matrixQuestionItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.MatrixQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatrixQuestionAdapter() {
		if (matrixQuestionItemProvider == null) {
			matrixQuestionItemProvider = new MatrixQuestionItemProvider(this);
		}

		return matrixQuestionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.CalendarQuestion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarQuestionItemProvider calendarQuestionItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.CalendarQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalendarQuestionAdapter() {
		if (calendarQuestionItemProvider == null) {
			calendarQuestionItemProvider = new CalendarQuestionItemProvider(this);
		}

		return calendarQuestionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.IntegerQuestion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerQuestionItemProvider integerQuestionItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.IntegerQuestion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerQuestionAdapter() {
		if (integerQuestionItemProvider == null) {
			integerQuestionItemProvider = new IntegerQuestionItemProvider(this);
		}

		return integerQuestionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link questionairemodel.QuestionCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionConditionItemProvider questionConditionItemProvider;

	/**
	 * This creates an adapter for a {@link questionairemodel.QuestionCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestionConditionAdapter() {
		if (questionConditionItemProvider == null) {
			questionConditionItemProvider = new QuestionConditionItemProvider(this);
		}

		return questionConditionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (questionaireItemProvider != null) questionaireItemProvider.dispose();
		if (headingItemProvider != null) headingItemProvider.dispose();
		if (paragraphItemProvider != null) paragraphItemProvider.dispose();
		if (textQuestionItemProvider != null) textQuestionItemProvider.dispose();
		if (choiceQuestionItemProvider != null) choiceQuestionItemProvider.dispose();
		if (optionItemProvider != null) optionItemProvider.dispose();
		if (matrixQuestionItemProvider != null) matrixQuestionItemProvider.dispose();
		if (calendarQuestionItemProvider != null) calendarQuestionItemProvider.dispose();
		if (integerQuestionItemProvider != null) integerQuestionItemProvider.dispose();
		if (questionConditionItemProvider != null) questionConditionItemProvider.dispose();
	}

}