/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.expressions;

import org.eclipse.datatools.modelbase.sql.schema.SQLObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Expression Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Place holder for the default query expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.expressions.QueryExpressionDefault#getSQL <em>SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage#getQueryExpressionDefault()
 * @model
 * @generated
 */
public interface QueryExpressionDefault extends SQLObject, QueryExpression {
	/**
	 * Returns the value of the '<em><b>SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL</em>' attribute.
	 * @see #setSQL(String)
	 * @see org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage#getQueryExpressionDefault_SQL()
	 * @model
	 * @generated
	 */
	String getSQL();

	/**
	 * Sets the value of the '{@link org.eclipse.datatools.modelbase.sql.expressions.QueryExpressionDefault#getSQL <em>SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SQL</em>' attribute.
	 * @see #getSQL()
	 * @generated
	 */
	void setSQL(String value);

} // QueryExpressionDefault
