/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.statements.impl;

import org.eclipse.datatools.modelbase.sql.statements.*;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementDefault;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsFactory;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SQLStatementsFactoryImpl extends EFactoryImpl implements SQLStatementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SQLStatementsFactory init() {
		try {
			SQLStatementsFactory theSQLStatementsFactory = (SQLStatementsFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/datatools/modelbase/sql/statements.ecore"); 
			if (theSQLStatementsFactory != null) {
				return theSQLStatementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SQLStatementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStatementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SQLStatementsPackage.SQL_STATEMENT_DEFAULT: return createSQLStatementDefault();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStatementDefault createSQLStatementDefault() {
		SQLStatementDefaultImpl sqlStatementDefault = new SQLStatementDefaultImpl();
		return sqlStatementDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStatementsPackage getSQLStatementsPackage() {
		return (SQLStatementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SQLStatementsPackage getPackage() {
		return SQLStatementsPackage.eINSTANCE;
	}

} //SQLStatementsFactoryImpl
