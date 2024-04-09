/**
 */
package QWiki.Glossary.impl;

import QWiki.Glossary.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryFactoryImpl extends EFactoryImpl implements GlossaryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GlossaryFactory init() {
		try {
			GlossaryFactory theGlossaryFactory = (GlossaryFactory)EPackage.Registry.INSTANCE.getEFactory(GlossaryPackage.eNS_URI);
			if (theGlossaryFactory != null) {
				return theGlossaryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GlossaryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION: return createGlossaryTermDefinition();
			case GlossaryPackage.GLOSSARY_TERM: return createGlossaryTerm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryTermDefinition createGlossaryTermDefinition() {
		GlossaryTermDefinitionImpl glossaryTermDefinition = new GlossaryTermDefinitionImpl();
		return glossaryTermDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryTerm createGlossaryTerm() {
		GlossaryTermImpl glossaryTerm = new GlossaryTermImpl();
		return glossaryTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryPackage getGlossaryPackage() {
		return (GlossaryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GlossaryPackage getPackage() {
		return GlossaryPackage.eINSTANCE;
	}

} //GlossaryFactoryImpl
