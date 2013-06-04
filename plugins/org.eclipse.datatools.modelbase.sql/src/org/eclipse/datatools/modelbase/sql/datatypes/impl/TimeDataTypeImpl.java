/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.TimeDataType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.TimeDataTypeImpl#getFractionalSecondsPrecision <em>Fractional Seconds Precision</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.TimeDataTypeImpl#isTimeZone <em>Time Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeDataTypeImpl extends PredefinedDataTypeImpl implements TimeDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.TIME_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimeZone() {
		return (Boolean)eGet(SQLDataTypesPackage.Literals.TIME_DATA_TYPE__TIME_ZONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZone(boolean newTimeZone) {
		eSet(SQLDataTypesPackage.Literals.TIME_DATA_TYPE__TIME_ZONE, newTimeZone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFractionalSecondsPrecision() {
		return (Integer)eGet(SQLDataTypesPackage.Literals.TIME_DATA_TYPE__FRACTIONAL_SECONDS_PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFractionalSecondsPrecision(int newFractionalSecondsPrecision) {
		eSet(SQLDataTypesPackage.Literals.TIME_DATA_TYPE__FRACTIONAL_SECONDS_PRECISION, newFractionalSecondsPrecision);
	}

} //TimeDataTypeImpl
