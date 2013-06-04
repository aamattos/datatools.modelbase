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
 * A representation of the model object '<em><b>Search Condition Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Place holder for the default search condition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.expressions.SearchConditionDefault#getSQL <em>SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage#getSearchConditionDefault()
 * @model
 * @generated
 */
public interface SearchConditionDefault extends SQLObject, SearchCondition {
	/**
	 * Returns the value of the '<em><b>SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL</em>' attribute.
	 * @see #isSetSQL()
	 * @see #unsetSQL()
	 * @see #setSQL(String)
	 * @see org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage#getSearchConditionDefault_SQL()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	String getSQL();

	/**
	 * Sets the value of the '{@link org.eclipse.datatools.modelbase.sql.expressions.SearchConditionDefault#getSQL <em>SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SQL</em>' attribute.
	 * @see #isSetSQL()
	 * @see #unsetSQL()
	 * @see #getSQL()
	 * @generated
	 */
	void setSQL(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.datatools.modelbase.sql.expressions.SearchConditionDefault#getSQL <em>SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSQL()
	 * @see #getSQL()
	 * @see #setSQL(String)
	 * @generated
	 */
	void unsetSQL();

	/**
	 * Returns whether the value of the '{@link org.eclipse.datatools.modelbase.sql.expressions.SearchConditionDefault#getSQL <em>SQL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SQL</em>' attribute is set.
	 * @see #unsetSQL()
	 * @see #getSQL()
	 * @see #setSQL(String)
	 * @generated
	 */
	boolean isSetSQL();

} // SearchConditionDefault
