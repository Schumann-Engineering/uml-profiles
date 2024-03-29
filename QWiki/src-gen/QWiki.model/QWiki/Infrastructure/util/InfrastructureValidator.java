/**
 */
package QWiki.Infrastructure.util;

import QWiki.Infrastructure.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see QWiki.Infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfrastructureValidator INSTANCE = new InfrastructureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "QWiki.Infrastructure";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return InfrastructurePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case InfrastructurePackage.UML_ASSOCIATION:
				return validateUmlAssociation((UmlAssociation)value, diagnostics, context);
			case InfrastructurePackage.UML_RELATIONSHIP:
				return validateUmlRelationship((UmlRelationship)value, diagnostics, context);
			case InfrastructurePackage.UML_ELEMENT:
				return validateUmlElement((UmlElement)value, diagnostics, context);
			case InfrastructurePackage.UML_COMMENT:
				return validateUmlComment((UmlComment)value, diagnostics, context);
			case InfrastructurePackage.UML_DIRECTED_RELATIONSHIP:
				return validateUmlDirectedRelationship((UmlDirectedRelationship)value, diagnostics, context);
			case InfrastructurePackage.UML_NAMED_ELEMENT:
				return validateUmlNamedElement((UmlNamedElement)value, diagnostics, context);
			case InfrastructurePackage.UML_PACKAGE:
				return validateUmlPackage((UmlPackage)value, diagnostics, context);
			case InfrastructurePackage.UML_PACKAGEABLE_ELEMENT:
				return validateUmlPackageableElement((UmlPackageableElement)value, diagnostics, context);
			case InfrastructurePackage.UML_NAMESPACE:
				return validateUmlNamespace((UmlNamespace)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlAssociation(UmlAssociation umlAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlRelationship(UmlRelationship umlRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlRelationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlElement(UmlElement umlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the not_own_self constraint of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UML_ELEMENT__NOT_OWN_SELF__EEXPRESSION = "not self.allOwnedElements()->includes(self)";

	/**
	 * Validates the not_own_self constraint of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlElement_not_own_self(UmlElement umlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InfrastructurePackage.Literals.UML_ELEMENT,
				 umlElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_own_self",
				 UML_ELEMENT__NOT_OWN_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_owner constraint of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UML_ELEMENT__HAS_OWNER__EEXPRESSION = "self.mustBeOwned() implies owner->notEmpty()";

	/**
	 * Validates the has_owner constraint of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlElement_has_owner(UmlElement umlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InfrastructurePackage.Literals.UML_ELEMENT,
				 umlElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_owner",
				 UML_ELEMENT__HAS_OWNER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlComment(UmlComment umlComment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlComment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlComment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlDirectedRelationship(UmlDirectedRelationship umlDirectedRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlDirectedRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlDirectedRelationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlNamedElement(UmlNamedElement umlNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlNamedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(umlNamedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the has_no_qualified_name constraint of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UML_NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME__EEXPRESSION = "(self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())\r\n" +
		"  implies self.qualifiedName->isEmpty()";

	/**
	 * Validates the has_no_qualified_name constraint of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlNamedElement_has_no_qualified_name(UmlNamedElement umlNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InfrastructurePackage.Literals.UML_NAMED_ELEMENT,
				 umlNamedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_no_qualified_name",
				 UML_NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_qualified_name constraint of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UML_NAMED_ELEMENT__HAS_QUALIFIED_NAME__EEXPRESSION = "(self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies\n" +
		"  self.qualifiedName = self.allNamespaces()->iterate( ns : UmlNamespace; result: String = self.name | ns.name + self.separator() + result)";

	/**
	 * Validates the has_qualified_name constraint of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlNamedElement_has_qualified_name(UmlNamedElement umlNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InfrastructurePackage.Literals.UML_NAMED_ELEMENT,
				 umlNamedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_qualified_name",
				 UML_NAMED_ELEMENT__HAS_QUALIFIED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlPackage(UmlPackage umlPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(umlPackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlPackageableElement(UmlPackageableElement umlPackageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlPackageableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(umlPackageableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlNamespace(UmlNamespace umlNamespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlNamespace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(umlNamespace, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //InfrastructureValidator
