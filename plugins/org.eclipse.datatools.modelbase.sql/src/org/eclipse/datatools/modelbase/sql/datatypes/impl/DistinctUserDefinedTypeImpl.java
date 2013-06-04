/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.DistinctUserDefinedType;
import org.eclipse.datatools.modelbase.sql.datatypes.PredefinedDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distinct User Defined Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.DistinctUserDefinedTypeImpl#getPredefinedRepresentation <em>Predefined Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistinctUserDefinedTypeImpl extends UserDefinedTypeImpl implements DistinctUserDefinedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistinctUserDefinedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.DISTINCT_USER_DEFINED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedDataType getPredefinedRepresentation() {
		return (PredefinedDataType)eGet(SQLDataTypesPackage.Literals.DISTINCT_USER_DEFINED_TYPE__PREDEFINED_REPRESENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedRepresentation(PredefinedDataType newPredefinedRepresentation) {
		eSet(SQLDataTypesPackage.Literals.DISTINCT_USER_DEFINED_TYPE__PREDEFINED_REPRESENTATION, newPredefinedRepresentation);
	}

} //DistinctUserDefinedTypeImpl
