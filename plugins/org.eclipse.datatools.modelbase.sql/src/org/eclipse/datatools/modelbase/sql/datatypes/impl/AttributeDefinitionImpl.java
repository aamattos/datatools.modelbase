/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.AttributeDefinition;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.schema.ReferentialActionType;
import org.eclipse.datatools.modelbase.sql.schema.impl.TypedElementImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.AttributeDefinitionImpl#getScopeCheck <em>Scope Check</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.AttributeDefinitionImpl#isScopeChecked <em>Scope Checked</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.AttributeDefinitionImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionImpl extends TypedElementImpl implements AttributeDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialActionType getScopeCheck() {
		return (ReferentialActionType)eGet(SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__SCOPE_CHECK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeCheck(ReferentialActionType newScopeCheck) {
		eSet(SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__SCOPE_CHECK, newScopeCheck);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScopeChecked() {
		return (Boolean)eGet(SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__SCOPE_CHECKED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeChecked(boolean newScopeChecked) {
		eSet(SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__SCOPE_CHECKED, newScopeChecked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return (String)eGet(SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__DEFAULT_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		eSet(SQLDataTypesPackage.Literals.ATTRIBUTE_DEFINITION__DEFAULT_VALUE, newDefaultValue);
	}

} //AttributeDefinitionImpl
