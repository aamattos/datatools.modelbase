/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.Field;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.schema.ReferentialActionType;
import org.eclipse.datatools.modelbase.sql.schema.impl.TypedElementImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.FieldImpl#getScopeCheck <em>Scope Check</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.FieldImpl#isScopeChecked <em>Scope Checked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends TypedElementImpl implements Field {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialActionType getScopeCheck() {
		return (ReferentialActionType)eGet(SQLDataTypesPackage.Literals.FIELD__SCOPE_CHECK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeCheck(ReferentialActionType newScopeCheck) {
		eSet(SQLDataTypesPackage.Literals.FIELD__SCOPE_CHECK, newScopeCheck);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScopeChecked() {
		return (Boolean)eGet(SQLDataTypesPackage.Literals.FIELD__SCOPE_CHECKED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeChecked(boolean newScopeChecked) {
		eSet(SQLDataTypesPackage.Literals.FIELD__SCOPE_CHECKED, newScopeChecked);
	}

} //FieldImpl
