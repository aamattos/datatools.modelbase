/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distinct User Defined Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.7 User-defined types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.DistinctUserDefinedType#getPredefinedRepresentation <em>Predefined Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getDistinctUserDefinedType()
 * @model
 * @generated
 */
public interface DistinctUserDefinedType extends UserDefinedType {
	/**
	 * Returns the value of the '<em><b>Predefined Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Representation</em>' containment reference.
	 * @see #setPredefinedRepresentation(PredefinedDataType)
	 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getDistinctUserDefinedType_PredefinedRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PredefinedDataType getPredefinedRepresentation();

	/**
	 * Sets the value of the '{@link org.eclipse.datatools.modelbase.sql.datatypes.DistinctUserDefinedType#getPredefinedRepresentation <em>Predefined Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Representation</em>' containment reference.
	 * @see #getPredefinedRepresentation()
	 * @generated
	 */
	void setPredefinedRepresentation(PredefinedDataType value);

} // DistinctUserDefinedType
