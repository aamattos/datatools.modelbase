/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.statements.util;

import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.statements.*;
import org.eclipse.datatools.modelbase.sql.statements.SQLConnectionStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLControlStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLDataChangeStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLDataStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLDiagnosticsStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLDynamicStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLSchemaStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLSessionStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatement;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementDefault;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;
import org.eclipse.datatools.modelbase.sql.statements.SQLTransactionStatement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage
 * @generated
 */
public class SQLStatementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SQLStatementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStatementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SQLStatementsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLStatementsSwitch<Adapter> modelSwitch =
		new SQLStatementsSwitch<Adapter>() {
			@Override
			public Adapter caseSQLStatement(SQLStatement object) {
				return createSQLStatementAdapter();
			}
			@Override
			public Adapter caseSQLDataStatement(SQLDataStatement object) {
				return createSQLDataStatementAdapter();
			}
			@Override
			public Adapter caseSQLSchemaStatement(SQLSchemaStatement object) {
				return createSQLSchemaStatementAdapter();
			}
			@Override
			public Adapter caseSQLControlStatement(SQLControlStatement object) {
				return createSQLControlStatementAdapter();
			}
			@Override
			public Adapter caseSQLDataChangeStatement(SQLDataChangeStatement object) {
				return createSQLDataChangeStatementAdapter();
			}
			@Override
			public Adapter caseSQLStatementDefault(SQLStatementDefault object) {
				return createSQLStatementDefaultAdapter();
			}
			@Override
			public Adapter caseSQLConnectionStatement(SQLConnectionStatement object) {
				return createSQLConnectionStatementAdapter();
			}
			@Override
			public Adapter caseSQLDiagnosticsStatement(SQLDiagnosticsStatement object) {
				return createSQLDiagnosticsStatementAdapter();
			}
			@Override
			public Adapter caseSQLDynamicStatement(SQLDynamicStatement object) {
				return createSQLDynamicStatementAdapter();
			}
			@Override
			public Adapter caseSQLSessionStatement(SQLSessionStatement object) {
				return createSQLSessionStatementAdapter();
			}
			@Override
			public Adapter caseSQLTransactionStatement(SQLTransactionStatement object) {
				return createSQLTransactionStatementAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter caseSQLObject(SQLObject object) {
				return createSQLObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLStatement <em>SQL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLStatement
	 * @generated
	 */
	public Adapter createSQLStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLDataStatement <em>SQL Data Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLDataStatement
	 * @generated
	 */
	public Adapter createSQLDataStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLSchemaStatement <em>SQL Schema Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLSchemaStatement
	 * @generated
	 */
	public Adapter createSQLSchemaStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLControlStatement <em>SQL Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLControlStatement
	 * @generated
	 */
	public Adapter createSQLControlStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLDataChangeStatement <em>SQL Data Change Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLDataChangeStatement
	 * @generated
	 */
	public Adapter createSQLDataChangeStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLStatementDefault <em>SQL Statement Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLStatementDefault
	 * @generated
	 */
	public Adapter createSQLStatementDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLConnectionStatement <em>SQL Connection Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLConnectionStatement
	 * @generated
	 */
	public Adapter createSQLConnectionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLDiagnosticsStatement <em>SQL Diagnostics Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLDiagnosticsStatement
	 * @generated
	 */
	public Adapter createSQLDiagnosticsStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLDynamicStatement <em>SQL Dynamic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLDynamicStatement
	 * @generated
	 */
	public Adapter createSQLDynamicStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLSessionStatement <em>SQL Session Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLSessionStatement
	 * @generated
	 */
	public Adapter createSQLSessionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.statements.SQLTransactionStatement <em>SQL Transaction Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLTransactionStatement
	 * @generated
	 */
	public Adapter createSQLTransactionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.datatools.modelbase.sql.schema.SQLObject <em>SQL Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.datatools.modelbase.sql.schema.SQLObject
	 * @generated
	 */
	public Adapter createSQLObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SQLStatementsAdapterFactory
