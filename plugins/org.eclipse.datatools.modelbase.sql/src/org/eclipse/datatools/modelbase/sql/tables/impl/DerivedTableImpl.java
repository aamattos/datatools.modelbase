/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.tables.impl;

import org.eclipse.datatools.modelbase.sql.expressions.QueryExpression;
import org.eclipse.datatools.modelbase.sql.tables.DerivedTable;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.DerivedTableImpl#getQueryExpression <em>Query Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DerivedTableImpl extends TableImpl implements DerivedTable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLTablesPackage.Literals.DERIVED_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryExpression getQueryExpression() {
		return (QueryExpression)eGet(SQLTablesPackage.Literals.DERIVED_TABLE__QUERY_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryExpression(QueryExpression newQueryExpression) {
		eSet(SQLTablesPackage.Literals.DERIVED_TABLE__QUERY_EXPRESSION, newQueryExpression);
	}

} //DerivedTableImpl
