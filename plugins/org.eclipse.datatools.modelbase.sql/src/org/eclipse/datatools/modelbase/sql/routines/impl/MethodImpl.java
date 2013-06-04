/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.routines.impl;

import org.eclipse.datatools.modelbase.sql.routines.Method;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.MethodImpl#isOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.routines.impl.MethodImpl#isConstructor <em>Constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends FunctionImpl implements Method {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLRoutinesPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverriding() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.METHOD__OVERRIDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverriding(boolean newOverriding) {
		eSet(SQLRoutinesPackage.Literals.METHOD__OVERRIDING, newOverriding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstructor() {
		return (Boolean)eGet(SQLRoutinesPackage.Literals.METHOD__CONSTRUCTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructor(boolean newConstructor) {
		eSet(SQLRoutinesPackage.Literals.METHOD__CONSTRUCTOR, newConstructor);
	}

} //MethodImpl
