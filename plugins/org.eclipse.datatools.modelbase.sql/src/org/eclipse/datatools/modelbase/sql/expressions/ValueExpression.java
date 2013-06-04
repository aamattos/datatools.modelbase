/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.expressions;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.14.5 Base columns and generated columns
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage#getValueExpression()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ValueExpression extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSQL();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSQL(String sqlText);

} // ValueExpression
