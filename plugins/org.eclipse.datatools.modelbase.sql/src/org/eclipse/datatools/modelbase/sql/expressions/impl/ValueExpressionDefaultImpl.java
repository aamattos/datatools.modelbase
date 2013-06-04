/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.expressions.impl;

import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage;
import org.eclipse.datatools.modelbase.sql.expressions.ValueExpressionDefault;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Expression Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.expressions.impl.ValueExpressionDefaultImpl#getSQL <em>SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueExpressionDefaultImpl extends SQLObjectImpl implements ValueExpressionDefault {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueExpressionDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLExpressionsPackage.Literals.VALUE_EXPRESSION_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSQL() {
		return (String)eGet(SQLExpressionsPackage.Literals.VALUE_EXPRESSION_DEFAULT__SQL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSQL(String newSQL) {
		eSet(SQLExpressionsPackage.Literals.VALUE_EXPRESSION_DEFAULT__SQL, newSQL);
	}

} //ValueExpressionDefaultImpl
