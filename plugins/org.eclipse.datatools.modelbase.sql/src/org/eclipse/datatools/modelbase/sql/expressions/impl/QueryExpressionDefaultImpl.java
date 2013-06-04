/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.expressions.impl;

import org.eclipse.datatools.modelbase.sql.expressions.QueryExpressionDefault;
import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Expression Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.expressions.impl.QueryExpressionDefaultImpl#getSQL <em>SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryExpressionDefaultImpl extends SQLObjectImpl implements QueryExpressionDefault {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryExpressionDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLExpressionsPackage.Literals.QUERY_EXPRESSION_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSQL() {
		return (String)eGet(SQLExpressionsPackage.Literals.QUERY_EXPRESSION_DEFAULT__SQL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSQL(String newSQL) {
		eSet(SQLExpressionsPackage.Literals.QUERY_EXPRESSION_DEFAULT__SQL, newSQL);
	}

} //QueryExpressionDefaultImpl
