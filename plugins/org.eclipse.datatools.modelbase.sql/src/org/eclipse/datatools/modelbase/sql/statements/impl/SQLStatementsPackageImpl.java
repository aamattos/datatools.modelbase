/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.statements.impl;

import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;
import org.eclipse.datatools.modelbase.sql.accesscontrol.impl.SQLAccessControlPackageImpl;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.constraints.impl.SQLConstraintsPackageImpl;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.impl.SQLDataTypesPackageImpl;
import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage;
import org.eclipse.datatools.modelbase.sql.expressions.impl.SQLExpressionsPackageImpl;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;
import org.eclipse.datatools.modelbase.sql.routines.impl.SQLRoutinesPackageImpl;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLSchemaPackageImpl;
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
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsFactory;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;
import org.eclipse.datatools.modelbase.sql.statements.SQLTransactionStatement;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.datatools.modelbase.sql.tables.impl.SQLTablesPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SQLStatementsPackageImpl extends EPackageImpl implements SQLStatementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlDataStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlSchemaStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlControlStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlDataChangeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlStatementDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlConnectionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlDiagnosticsStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlDynamicStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlSessionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlTransactionStatementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SQLStatementsPackageImpl() {
		super(eNS_URI, SQLStatementsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SQLStatementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SQLStatementsPackage init() {
		if (isInited) return (SQLStatementsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLStatementsPackage.eNS_URI);

		// Obtain or create and register package
		SQLStatementsPackageImpl theSQLStatementsPackage = (SQLStatementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SQLStatementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SQLStatementsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SQLSchemaPackageImpl theSQLSchemaPackage = (SQLSchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI) instanceof SQLSchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI) : SQLSchemaPackage.eINSTANCE);
		SQLConstraintsPackageImpl theSQLConstraintsPackage = (SQLConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI) instanceof SQLConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI) : SQLConstraintsPackage.eINSTANCE);
		SQLDataTypesPackageImpl theSQLDataTypesPackage = (SQLDataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLDataTypesPackage.eNS_URI) instanceof SQLDataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLDataTypesPackage.eNS_URI) : SQLDataTypesPackage.eINSTANCE);
		SQLExpressionsPackageImpl theSQLExpressionsPackage = (SQLExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLExpressionsPackage.eNS_URI) instanceof SQLExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLExpressionsPackage.eNS_URI) : SQLExpressionsPackage.eINSTANCE);
		SQLRoutinesPackageImpl theSQLRoutinesPackage = (SQLRoutinesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLRoutinesPackage.eNS_URI) instanceof SQLRoutinesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLRoutinesPackage.eNS_URI) : SQLRoutinesPackage.eINSTANCE);
		SQLTablesPackageImpl theSQLTablesPackage = (SQLTablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI) instanceof SQLTablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI) : SQLTablesPackage.eINSTANCE);
		SQLAccessControlPackageImpl theSQLAccessControlPackage = (SQLAccessControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLAccessControlPackage.eNS_URI) instanceof SQLAccessControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLAccessControlPackage.eNS_URI) : SQLAccessControlPackage.eINSTANCE);

		// Create package meta-data objects
		theSQLStatementsPackage.createPackageContents();
		theSQLSchemaPackage.createPackageContents();
		theSQLConstraintsPackage.createPackageContents();
		theSQLDataTypesPackage.createPackageContents();
		theSQLExpressionsPackage.createPackageContents();
		theSQLRoutinesPackage.createPackageContents();
		theSQLTablesPackage.createPackageContents();
		theSQLAccessControlPackage.createPackageContents();

		// Initialize created meta-data
		theSQLStatementsPackage.initializePackageContents();
		theSQLSchemaPackage.initializePackageContents();
		theSQLConstraintsPackage.initializePackageContents();
		theSQLDataTypesPackage.initializePackageContents();
		theSQLExpressionsPackage.initializePackageContents();
		theSQLRoutinesPackage.initializePackageContents();
		theSQLTablesPackage.initializePackageContents();
		theSQLAccessControlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSQLStatementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SQLStatementsPackage.eNS_URI, theSQLStatementsPackage);
		return theSQLStatementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLStatement() {
		return sqlStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSQLStatement__GetSQL() {
		return sqlStatementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSQLStatement__SetSQL__String() {
		return sqlStatementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLDataStatement() {
		return sqlDataStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLSchemaStatement() {
		return sqlSchemaStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLControlStatement() {
		return sqlControlStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLDataChangeStatement() {
		return sqlDataChangeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLStatementDefault() {
		return sqlStatementDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLStatementDefault_SQL() {
		return (EAttribute)sqlStatementDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLConnectionStatement() {
		return sqlConnectionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLDiagnosticsStatement() {
		return sqlDiagnosticsStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLDynamicStatement() {
		return sqlDynamicStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLSessionStatement() {
		return sqlSessionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLTransactionStatement() {
		return sqlTransactionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStatementsFactory getSQLStatementsFactory() {
		return (SQLStatementsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sqlStatementEClass = createEClass(SQL_STATEMENT);
		createEOperation(sqlStatementEClass, SQL_STATEMENT___GET_SQL);
		createEOperation(sqlStatementEClass, SQL_STATEMENT___SET_SQL__STRING);

		sqlDataStatementEClass = createEClass(SQL_DATA_STATEMENT);

		sqlSchemaStatementEClass = createEClass(SQL_SCHEMA_STATEMENT);

		sqlControlStatementEClass = createEClass(SQL_CONTROL_STATEMENT);

		sqlDataChangeStatementEClass = createEClass(SQL_DATA_CHANGE_STATEMENT);

		sqlStatementDefaultEClass = createEClass(SQL_STATEMENT_DEFAULT);
		createEAttribute(sqlStatementDefaultEClass, SQL_STATEMENT_DEFAULT__SQL);

		sqlConnectionStatementEClass = createEClass(SQL_CONNECTION_STATEMENT);

		sqlDiagnosticsStatementEClass = createEClass(SQL_DIAGNOSTICS_STATEMENT);

		sqlDynamicStatementEClass = createEClass(SQL_DYNAMIC_STATEMENT);

		sqlSessionStatementEClass = createEClass(SQL_SESSION_STATEMENT);

		sqlTransactionStatementEClass = createEClass(SQL_TRANSACTION_STATEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SQLSchemaPackage theSQLSchemaPackage = (SQLSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqlDataStatementEClass.getESuperTypes().add(this.getSQLStatement());
		sqlSchemaStatementEClass.getESuperTypes().add(this.getSQLStatement());
		sqlControlStatementEClass.getESuperTypes().add(this.getSQLStatement());
		sqlDataChangeStatementEClass.getESuperTypes().add(this.getSQLDataStatement());
		sqlStatementDefaultEClass.getESuperTypes().add(theSQLSchemaPackage.getSQLObject());
		sqlStatementDefaultEClass.getESuperTypes().add(this.getSQLStatement());
		sqlConnectionStatementEClass.getESuperTypes().add(this.getSQLStatement());
		sqlDiagnosticsStatementEClass.getESuperTypes().add(this.getSQLStatement());
		sqlDynamicStatementEClass.getESuperTypes().add(this.getSQLStatement());
		sqlSessionStatementEClass.getESuperTypes().add(this.getSQLStatement());
		sqlTransactionStatementEClass.getESuperTypes().add(this.getSQLStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(sqlStatementEClass, SQLStatement.class, "SQLStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSQLStatement__GetSQL(), ecorePackage.getEString(), "getSQL", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getSQLStatement__SetSQL__String(), null, "setSQL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sqlText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sqlDataStatementEClass, SQLDataStatement.class, "SQLDataStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlSchemaStatementEClass, SQLSchemaStatement.class, "SQLSchemaStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlControlStatementEClass, SQLControlStatement.class, "SQLControlStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlDataChangeStatementEClass, SQLDataChangeStatement.class, "SQLDataChangeStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlStatementDefaultEClass, SQLStatementDefault.class, "SQLStatementDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSQLStatementDefault_SQL(), ecorePackage.getEString(), "SQL", null, 0, 1, SQLStatementDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlConnectionStatementEClass, SQLConnectionStatement.class, "SQLConnectionStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlDiagnosticsStatementEClass, SQLDiagnosticsStatement.class, "SQLDiagnosticsStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlDynamicStatementEClass, SQLDynamicStatement.class, "SQLDynamicStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlSessionStatementEClass, SQLSessionStatement.class, "SQLSessionStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlTransactionStatementEClass, SQLTransactionStatement.class, "SQLTransactionStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SQLStatementsPackageImpl
