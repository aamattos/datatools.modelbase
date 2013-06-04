/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.OrderingCategoryType;
import org.eclipse.datatools.modelbase.sql.datatypes.OrderingType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.UserDefinedTypeOrdering;
import org.eclipse.datatools.modelbase.sql.routines.Routine;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined Type Ordering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.UserDefinedTypeOrderingImpl#getOrderingForm <em>Ordering Form</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.UserDefinedTypeOrderingImpl#getOrderingCategory <em>Ordering Category</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.UserDefinedTypeOrderingImpl#getOrderingRoutine <em>Ordering Routine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDefinedTypeOrderingImpl extends SQLObjectImpl implements UserDefinedTypeOrdering {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDefinedTypeOrderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.USER_DEFINED_TYPE_ORDERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType getOrderingForm() {
		return (OrderingType)eGet(SQLDataTypesPackage.Literals.USER_DEFINED_TYPE_ORDERING__ORDERING_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderingForm(OrderingType newOrderingForm) {
		eSet(SQLDataTypesPackage.Literals.USER_DEFINED_TYPE_ORDERING__ORDERING_FORM, newOrderingForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingCategoryType getOrderingCategory() {
		return (OrderingCategoryType)eGet(SQLDataTypesPackage.Literals.USER_DEFINED_TYPE_ORDERING__ORDERING_CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderingCategory(OrderingCategoryType newOrderingCategory) {
		eSet(SQLDataTypesPackage.Literals.USER_DEFINED_TYPE_ORDERING__ORDERING_CATEGORY, newOrderingCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routine getOrderingRoutine() {
		return (Routine)eGet(SQLDataTypesPackage.Literals.USER_DEFINED_TYPE_ORDERING__ORDERING_ROUTINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderingRoutine(Routine newOrderingRoutine) {
		eSet(SQLDataTypesPackage.Literals.USER_DEFINED_TYPE_ORDERING__ORDERING_ROUTINE, newOrderingRoutine);
	}

} //UserDefinedTypeOrderingImpl
