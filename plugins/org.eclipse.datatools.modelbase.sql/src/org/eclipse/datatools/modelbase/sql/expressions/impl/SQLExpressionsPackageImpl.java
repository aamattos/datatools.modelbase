/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.expressions.impl;

import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;
import org.eclipse.datatools.modelbase.sql.accesscontrol.impl.SQLAccessControlPackageImpl;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.constraints.impl.SQLConstraintsPackageImpl;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.impl.SQLDataTypesPackageImpl;
import org.eclipse.datatools.modelbase.sql.expressions.QueryExpression;
import org.eclipse.datatools.modelbase.sql.expressions.QueryExpressionDefault;
import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsFactory;
import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage;
import org.eclipse.datatools.modelbase.sql.expressions.SearchCondition;
import org.eclipse.datatools.modelbase.sql.expressions.SearchConditionDefault;
import org.eclipse.datatools.modelbase.sql.expressions.ValueExpression;
import org.eclipse.datatools.modelbase.sql.expressions.ValueExpressionDefault;
import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;
import org.eclipse.datatools.modelbase.sql.routines.impl.SQLRoutinesPackageImpl;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLSchemaPackageImpl;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;
import org.eclipse.datatools.modelbase.sql.statements.impl.SQLStatementsPackageImpl;
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
public class SQLExpressionsPackageImpl extends EPackageImpl implements SQLExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryExpressionDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchConditionDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionDefaultEClass = null;

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
	 * @see org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SQLExpressionsPackageImpl() {
		super(eNS_URI, SQLExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SQLExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SQLExpressionsPackage init() {
		if (isInited) return (SQLExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		SQLExpressionsPackageImpl theSQLExpressionsPackage = (SQLExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SQLExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SQLExpressionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SQLSchemaPackageImpl theSQLSchemaPackage = (SQLSchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI) instanceof SQLSchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI) : SQLSchemaPackage.eINSTANCE);
		SQLConstraintsPackageImpl theSQLConstraintsPackage = (SQLConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI) instanceof SQLConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI) : SQLConstraintsPackage.eINSTANCE);
		SQLDataTypesPackageImpl theSQLDataTypesPackage = (SQLDataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLDataTypesPackage.eNS_URI) instanceof SQLDataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLDataTypesPackage.eNS_URI) : SQLDataTypesPackage.eINSTANCE);
		SQLRoutinesPackageImpl theSQLRoutinesPackage = (SQLRoutinesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLRoutinesPackage.eNS_URI) instanceof SQLRoutinesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLRoutinesPackage.eNS_URI) : SQLRoutinesPackage.eINSTANCE);
		SQLStatementsPackageImpl theSQLStatementsPackage = (SQLStatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLStatementsPackage.eNS_URI) instanceof SQLStatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLStatementsPackage.eNS_URI) : SQLStatementsPackage.eINSTANCE);
		SQLTablesPackageImpl theSQLTablesPackage = (SQLTablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI) instanceof SQLTablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI) : SQLTablesPackage.eINSTANCE);
		SQLAccessControlPackageImpl theSQLAccessControlPackage = (SQLAccessControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLAccessControlPackage.eNS_URI) instanceof SQLAccessControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLAccessControlPackage.eNS_URI) : SQLAccessControlPackage.eINSTANCE);

		// Create package meta-data objects
		theSQLExpressionsPackage.createPackageContents();
		theSQLSchemaPackage.createPackageContents();
		theSQLConstraintsPackage.createPackageContents();
		theSQLDataTypesPackage.createPackageContents();
		theSQLRoutinesPackage.createPackageContents();
		theSQLStatementsPackage.createPackageContents();
		theSQLTablesPackage.createPackageContents();
		theSQLAccessControlPackage.createPackageContents();

		// Initialize created meta-data
		theSQLExpressionsPackage.initializePackageContents();
		theSQLSchemaPackage.initializePackageContents();
		theSQLConstraintsPackage.initializePackageContents();
		theSQLDataTypesPackage.initializePackageContents();
		theSQLRoutinesPackage.initializePackageContents();
		theSQLStatementsPackage.initializePackageContents();
		theSQLTablesPackage.initializePackageContents();
		theSQLAccessControlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSQLExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SQLExpressionsPackage.eNS_URI, theSQLExpressionsPackage);
		return theSQLExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryExpression() {
		return queryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQueryExpression__GetSQL() {
		return queryExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQueryExpression__SetSQL__String() {
		return queryExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExpression() {
		return valueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueExpression__GetSQL() {
		return valueExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueExpression__SetSQL__String() {
		return valueExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchCondition() {
		return searchConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSearchCondition__GetSQL() {
		return searchConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSearchCondition__SetSQL__String() {
		return searchConditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryExpressionDefault() {
		return queryExpressionDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryExpressionDefault_SQL() {
		return (EAttribute)queryExpressionDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchConditionDefault() {
		return searchConditionDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchConditionDefault_SQL() {
		return (EAttribute)searchConditionDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExpressionDefault() {
		return valueExpressionDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExpressionDefault_SQL() {
		return (EAttribute)valueExpressionDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLExpressionsFactory getSQLExpressionsFactory() {
		return (SQLExpressionsFactory)getEFactoryInstance();
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
		queryExpressionEClass = createEClass(QUERY_EXPRESSION);
		createEOperation(queryExpressionEClass, QUERY_EXPRESSION___GET_SQL);
		createEOperation(queryExpressionEClass, QUERY_EXPRESSION___SET_SQL__STRING);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEOperation(valueExpressionEClass, VALUE_EXPRESSION___GET_SQL);
		createEOperation(valueExpressionEClass, VALUE_EXPRESSION___SET_SQL__STRING);

		searchConditionEClass = createEClass(SEARCH_CONDITION);
		createEOperation(searchConditionEClass, SEARCH_CONDITION___GET_SQL);
		createEOperation(searchConditionEClass, SEARCH_CONDITION___SET_SQL__STRING);

		queryExpressionDefaultEClass = createEClass(QUERY_EXPRESSION_DEFAULT);
		createEAttribute(queryExpressionDefaultEClass, QUERY_EXPRESSION_DEFAULT__SQL);

		searchConditionDefaultEClass = createEClass(SEARCH_CONDITION_DEFAULT);
		createEAttribute(searchConditionDefaultEClass, SEARCH_CONDITION_DEFAULT__SQL);

		valueExpressionDefaultEClass = createEClass(VALUE_EXPRESSION_DEFAULT);
		createEAttribute(valueExpressionDefaultEClass, VALUE_EXPRESSION_DEFAULT__SQL);
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
		queryExpressionDefaultEClass.getESuperTypes().add(theSQLSchemaPackage.getSQLObject());
		queryExpressionDefaultEClass.getESuperTypes().add(this.getQueryExpression());
		searchConditionDefaultEClass.getESuperTypes().add(theSQLSchemaPackage.getSQLObject());
		searchConditionDefaultEClass.getESuperTypes().add(this.getSearchCondition());
		valueExpressionDefaultEClass.getESuperTypes().add(theSQLSchemaPackage.getSQLObject());
		valueExpressionDefaultEClass.getESuperTypes().add(this.getValueExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(queryExpressionEClass, QueryExpression.class, "QueryExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getQueryExpression__GetSQL(), ecorePackage.getEString(), "getSQL", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getQueryExpression__SetSQL__String(), null, "setSQL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sqlText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValueExpression__GetSQL(), ecorePackage.getEString(), "getSQL", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueExpression__SetSQL__String(), null, "setSQL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sqlText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(searchConditionEClass, SearchCondition.class, "SearchCondition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSearchCondition__GetSQL(), ecorePackage.getEString(), "getSQL", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSearchCondition__SetSQL__String(), null, "setSQL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sqlText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryExpressionDefaultEClass, QueryExpressionDefault.class, "QueryExpressionDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryExpressionDefault_SQL(), ecorePackage.getEString(), "SQL", null, 0, 1, QueryExpressionDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchConditionDefaultEClass, SearchConditionDefault.class, "SearchConditionDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchConditionDefault_SQL(), ecorePackage.getEString(), "SQL", null, 0, 1, SearchConditionDefault.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valueExpressionDefaultEClass, ValueExpressionDefault.class, "ValueExpressionDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExpressionDefault_SQL(), ecorePackage.getEString(), "SQL", null, 0, 1, ValueExpressionDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "com.isb.datamodeler.expressions.setting"
		   });						
	}

} //SQLExpressionsPackageImpl
