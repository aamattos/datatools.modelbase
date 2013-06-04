/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.10 Collection Types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.CollectionDataType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getCollectionDataType()
 * @model abstract="true"
 * @generated
 */
public interface CollectionDataType extends ConstructedDataType {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.datatools.modelbase.sql.datatypes.ElementType#getCollectionDataType <em>Collection Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(ElementType)
	 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getCollectionDataType_ElementType()
	 * @see org.eclipse.datatools.modelbase.sql.datatypes.ElementType#getCollectionDataType
	 * @model opposite="CollectionDataType" containment="true" required="true"
	 * @generated
	 */
	ElementType getElementType();

	/**
	 * Sets the value of the '{@link org.eclipse.datatools.modelbase.sql.datatypes.CollectionDataType#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(ElementType value);

} // CollectionDataType
