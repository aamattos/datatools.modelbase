/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.statements.impl;

import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementDefault;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Statement Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.statements.impl.SQLStatementDefaultImpl#getSQL <em>SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLStatementDefaultImpl extends SQLObjectImpl implements SQLStatementDefault {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLStatementDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLStatementsPackage.Literals.SQL_STATEMENT_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSQL() {
		return (String)eGet(SQLStatementsPackage.Literals.SQL_STATEMENT_DEFAULT__SQL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSQL(String newSQL) {
		eSet(SQLStatementsPackage.Literals.SQL_STATEMENT_DEFAULT__SQL, newSQL);
	}

} //SQLStatementDefaultImpl
