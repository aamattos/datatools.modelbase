/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.statements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage
 * @generated
 */
public interface SQLStatementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SQLStatementsFactory eINSTANCE = org.eclipse.datatools.modelbase.sql.statements.impl.SQLStatementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SQL Statement Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQL Statement Default</em>'.
	 * @generated
	 */
	SQLStatementDefault createSQLStatementDefault();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SQLStatementsPackage getSQLStatementsPackage();

} //SQLStatementsFactory
