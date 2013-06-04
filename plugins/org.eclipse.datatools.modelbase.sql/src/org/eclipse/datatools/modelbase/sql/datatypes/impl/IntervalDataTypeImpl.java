/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.IntervalDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.IntervalQualifierType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.IntervalDataTypeImpl#getLeadingQualifier <em>Leading Qualifier</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.IntervalDataTypeImpl#getTrailingQualifier <em>Trailing Qualifier</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.IntervalDataTypeImpl#getLeadingFieldPrecision <em>Leading Field Precision</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.IntervalDataTypeImpl#getTrailingFieldPrecision <em>Trailing Field Precision</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.IntervalDataTypeImpl#getFractionalSecondsPrecision <em>Fractional Seconds Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalDataTypeImpl extends PredefinedDataTypeImpl implements IntervalDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalQualifierType getLeadingQualifier() {
		return (IntervalQualifierType)eGet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__LEADING_QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeadingQualifier(IntervalQualifierType newLeadingQualifier) {
		eSet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__LEADING_QUALIFIER, newLeadingQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalQualifierType getTrailingQualifier() {
		return (IntervalQualifierType)eGet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__TRAILING_QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrailingQualifier(IntervalQualifierType newTrailingQualifier) {
		eSet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__TRAILING_QUALIFIER, newTrailingQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeadingFieldPrecision() {
		return (Integer)eGet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__LEADING_FIELD_PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeadingFieldPrecision(int newLeadingFieldPrecision) {
		eSet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__LEADING_FIELD_PRECISION, newLeadingFieldPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrailingFieldPrecision() {
		return (Integer)eGet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__TRAILING_FIELD_PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrailingFieldPrecision(int newTrailingFieldPrecision) {
		eSet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__TRAILING_FIELD_PRECISION, newTrailingFieldPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFractionalSecondsPrecision() {
		return (Integer)eGet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__FRACTIONAL_SECONDS_PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFractionalSecondsPrecision(int newFractionalSecondsPrecision) {
		eSet(SQLDataTypesPackage.Literals.INTERVAL_DATA_TYPE__FRACTIONAL_SECONDS_PRECISION, newFractionalSecondsPrecision);
	}

} //IntervalDataTypeImpl
