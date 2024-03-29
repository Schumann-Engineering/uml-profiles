/**
 */
package QWiki.Kernel;

import QWiki.Infrastructure.UmlPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.ModelRoot#getOwnedModelElement <em>Owned Model Element</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getModelRoot()
 * @model annotation="duplicates"
 * @generated
 */
public interface ModelRoot extends UmlPackage {
	/**
	 * Returns the value of the '<em><b>Owned Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Kernel.ModelElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Kernel.ModelElement#getModel <em>Model</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model Element</em>' containment reference list.
	 * @see QWiki.Kernel.KernelPackage#getModelRoot_OwnedModelElement()
	 * @see QWiki.Kernel.ModelElement#getModel
	 * @model opposite="model" containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ModelElement> getOwnedModelElement();

} // ModelRoot
