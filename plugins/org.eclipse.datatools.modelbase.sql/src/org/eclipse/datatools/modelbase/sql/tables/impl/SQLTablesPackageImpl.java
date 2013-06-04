/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.tables.impl;

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
import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;
import org.eclipse.datatools.modelbase.sql.statements.impl.SQLStatementsPackageImpl;
import org.eclipse.datatools.modelbase.sql.tables.ActionGranularityType;
import org.eclipse.datatools.modelbase.sql.tables.ActionTimeType;
import org.eclipse.datatools.modelbase.sql.tables.BaseTable;
import org.eclipse.datatools.modelbase.sql.tables.CheckType;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.DerivedTable;
import org.eclipse.datatools.modelbase.sql.tables.PersistentTable;
import org.eclipse.datatools.modelbase.sql.tables.ReferenceType;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesFactory;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.TemporaryTable;
import org.eclipse.datatools.modelbase.sql.tables.Trigger;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SQLTablesPackageImpl extends EPackageImpl implements SQLTablesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporaryTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistentTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum checkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionGranularityTypeEEnum = null;

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
	 * @see org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SQLTablesPackageImpl() {
		super(eNS_URI, SQLTablesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SQLTablesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SQLTablesPackage init() {
		if (isInited) return (SQLTablesPackage)EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI);

		// Obtain or create and register package
		SQLTablesPackageImpl theSQLTablesPackage = (SQLTablesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SQLTablesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SQLTablesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SQLSchemaPackageImpl theSQLSchemaPackage = (SQLSchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI) instanceof SQLSchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI) : SQLSchemaPackage.eINSTANCE);
		SQLConstraintsPackageImpl theSQLConstraintsPackage = (SQLConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI) instanceof SQLConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI) : SQLConstraintsPackage.eINSTANCE);
		SQLDataTypesPackageImpl theSQLDataTypesPackage = (SQLDataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLDataTypesPackage.eNS_URI) instanceof SQLDataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLDataTypesPackage.eNS_URI) : SQLDataTypesPackage.eINSTANCE);
		SQLExpressionsPackageImpl theSQLExpressionsPackage = (SQLExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLExpressionsPackage.eNS_URI) instanceof SQLExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLExpressionsPackage.eNS_URI) : SQLExpressionsPackage.eINSTANCE);
		SQLRoutinesPackageImpl theSQLRoutinesPackage = (SQLRoutinesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLRoutinesPackage.eNS_URI) instanceof SQLRoutinesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLRoutinesPackage.eNS_URI) : SQLRoutinesPackage.eINSTANCE);
		SQLStatementsPackageImpl theSQLStatementsPackage = (SQLStatementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLStatementsPackage.eNS_URI) instanceof SQLStatementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLStatementsPackage.eNS_URI) : SQLStatementsPackage.eINSTANCE);
		SQLAccessControlPackageImpl theSQLAccessControlPackage = (SQLAccessControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SQLAccessControlPackage.eNS_URI) instanceof SQLAccessControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SQLAccessControlPackage.eNS_URI) : SQLAccessControlPackage.eINSTANCE);

		// Create package meta-data objects
		theSQLTablesPackage.createPackageContents();
		theSQLSchemaPackage.createPackageContents();
		theSQLConstraintsPackage.createPackageContents();
		theSQLDataTypesPackage.createPackageContents();
		theSQLExpressionsPackage.createPackageContents();
		theSQLRoutinesPackage.createPackageContents();
		theSQLStatementsPackage.createPackageContents();
		theSQLAccessControlPackage.createPackageContents();

		// Initialize created meta-data
		theSQLTablesPackage.initializePackageContents();
		theSQLSchemaPackage.initializePackageContents();
		theSQLConstraintsPackage.initializePackageContents();
		theSQLDataTypesPackage.initializePackageContents();
		theSQLExpressionsPackage.initializePackageContents();
		theSQLRoutinesPackage.initializePackageContents();
		theSQLStatementsPackage.initializePackageContents();
		theSQLAccessControlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSQLTablesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SQLTablesPackage.eNS_URI, theSQLTablesPackage);
		return theSQLTablesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewTable() {
		return viewTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewTable_CheckType() {
		return (EAttribute)viewTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporaryTable() {
		return temporaryTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporaryTable_Local() {
		return (EAttribute)temporaryTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporaryTable_DeleteOnCommit() {
		return (EAttribute)temporaryTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Supertable() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Subtables() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Schema() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Udt() {
		return (EReference)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Triggers() {
		return (EReference)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Index() {
		return (EReference)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_SelfRefColumnGeneration() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Insertable() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Updatable() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistentTable() {
		return persistentTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedTable() {
		return derivedTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedTable_QueryExpression() {
		return (EReference)derivedTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseTable() {
		return baseTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseTable_Constraints() {
		return (EReference)baseTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseTable_ReferencingForeignKeys() {
		return (EReference)baseTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBaseTable__GetUniqueConstraints() {
		return baseTableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBaseTable__GetForeignKeys() {
		return baseTableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBaseTable__GetPrimaryKey() {
		return baseTableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Table() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_IdentitySpecifier() {
		return (EReference)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_GenerateExpression() {
		return (EReference)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_ImplementationDependent() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Nullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_DefaultValue() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_ScopeCheck() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_ScopeChecked() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumn__IsPartOfForeignKey() {
		return columnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumn__IsPartOfUniqueConstraint() {
		return columnEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumn__IsPartOfPrimaryKey() {
		return columnEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Schema() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_SubjectTable() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_ActionStatement() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_TriggerColumn() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_ActionGranularity() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_When() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_TimeStamp() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_ActionTime() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_UpdateType() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_InsertType() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_DeleteType() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_OldRow() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_NewRow() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_OldTable() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_NewTable() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCheckType() {
		return checkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceType() {
		return referenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionTimeType() {
		return actionTimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionGranularityType() {
		return actionGranularityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLTablesFactory getSQLTablesFactory() {
		return (SQLTablesFactory)getEFactoryInstance();
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
		viewTableEClass = createEClass(VIEW_TABLE);
		createEAttribute(viewTableEClass, VIEW_TABLE__CHECK_TYPE);

		temporaryTableEClass = createEClass(TEMPORARY_TABLE);
		createEAttribute(temporaryTableEClass, TEMPORARY_TABLE__LOCAL);
		createEAttribute(temporaryTableEClass, TEMPORARY_TABLE__DELETE_ON_COMMIT);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__SUPERTABLE);
		createEReference(tableEClass, TABLE__SUBTABLES);
		createEReference(tableEClass, TABLE__SCHEMA);
		createEReference(tableEClass, TABLE__UDT);
		createEReference(tableEClass, TABLE__TRIGGERS);
		createEReference(tableEClass, TABLE__INDEX);
		createEAttribute(tableEClass, TABLE__SELF_REF_COLUMN_GENERATION);
		createEAttribute(tableEClass, TABLE__INSERTABLE);
		createEAttribute(tableEClass, TABLE__UPDATABLE);

		persistentTableEClass = createEClass(PERSISTENT_TABLE);

		derivedTableEClass = createEClass(DERIVED_TABLE);
		createEReference(derivedTableEClass, DERIVED_TABLE__QUERY_EXPRESSION);

		baseTableEClass = createEClass(BASE_TABLE);
		createEReference(baseTableEClass, BASE_TABLE__CONSTRAINTS);
		createEReference(baseTableEClass, BASE_TABLE__REFERENCING_FOREIGN_KEYS);
		createEOperation(baseTableEClass, BASE_TABLE___GET_UNIQUE_CONSTRAINTS);
		createEOperation(baseTableEClass, BASE_TABLE___GET_FOREIGN_KEYS);
		createEOperation(baseTableEClass, BASE_TABLE___GET_PRIMARY_KEY);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__TABLE);
		createEReference(columnEClass, COLUMN__IDENTITY_SPECIFIER);
		createEReference(columnEClass, COLUMN__GENERATE_EXPRESSION);
		createEAttribute(columnEClass, COLUMN__IMPLEMENTATION_DEPENDENT);
		createEAttribute(columnEClass, COLUMN__NULLABLE);
		createEAttribute(columnEClass, COLUMN__DEFAULT_VALUE);
		createEAttribute(columnEClass, COLUMN__SCOPE_CHECK);
		createEAttribute(columnEClass, COLUMN__SCOPE_CHECKED);
		createEOperation(columnEClass, COLUMN___IS_PART_OF_FOREIGN_KEY);
		createEOperation(columnEClass, COLUMN___IS_PART_OF_UNIQUE_CONSTRAINT);
		createEOperation(columnEClass, COLUMN___IS_PART_OF_PRIMARY_KEY);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__SCHEMA);
		createEReference(triggerEClass, TRIGGER__SUBJECT_TABLE);
		createEReference(triggerEClass, TRIGGER__ACTION_STATEMENT);
		createEReference(triggerEClass, TRIGGER__TRIGGER_COLUMN);
		createEAttribute(triggerEClass, TRIGGER__ACTION_GRANULARITY);
		createEReference(triggerEClass, TRIGGER__WHEN);
		createEAttribute(triggerEClass, TRIGGER__TIME_STAMP);
		createEAttribute(triggerEClass, TRIGGER__ACTION_TIME);
		createEAttribute(triggerEClass, TRIGGER__UPDATE_TYPE);
		createEAttribute(triggerEClass, TRIGGER__INSERT_TYPE);
		createEAttribute(triggerEClass, TRIGGER__DELETE_TYPE);
		createEAttribute(triggerEClass, TRIGGER__OLD_ROW);
		createEAttribute(triggerEClass, TRIGGER__NEW_ROW);
		createEAttribute(triggerEClass, TRIGGER__OLD_TABLE);
		createEAttribute(triggerEClass, TRIGGER__NEW_TABLE);

		// Create enums
		checkTypeEEnum = createEEnum(CHECK_TYPE);
		referenceTypeEEnum = createEEnum(REFERENCE_TYPE);
		actionTimeTypeEEnum = createEEnum(ACTION_TIME_TYPE);
		actionGranularityTypeEEnum = createEEnum(ACTION_GRANULARITY_TYPE);
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
		SQLDataTypesPackage theSQLDataTypesPackage = (SQLDataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(SQLDataTypesPackage.eNS_URI);
		SQLConstraintsPackage theSQLConstraintsPackage = (SQLConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI);
		SQLExpressionsPackage theSQLExpressionsPackage = (SQLExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLExpressionsPackage.eNS_URI);
		SQLStatementsPackage theSQLStatementsPackage = (SQLStatementsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLStatementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		viewTableEClass.getESuperTypes().add(this.getDerivedTable());
		temporaryTableEClass.getESuperTypes().add(this.getBaseTable());
		tableEClass.getESuperTypes().add(theSQLSchemaPackage.getSQLObject());
		persistentTableEClass.getESuperTypes().add(this.getBaseTable());
		derivedTableEClass.getESuperTypes().add(this.getTable());
		baseTableEClass.getESuperTypes().add(this.getTable());
		columnEClass.getESuperTypes().add(theSQLSchemaPackage.getTypedElement());
		triggerEClass.getESuperTypes().add(theSQLSchemaPackage.getSQLObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(viewTableEClass, ViewTable.class, "ViewTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewTable_CheckType(), this.getCheckType(), "checkType", null, 0, 1, ViewTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporaryTableEClass, TemporaryTable.class, "TemporaryTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporaryTable_Local(), ecorePackage.getEBoolean(), "local", null, 0, 1, TemporaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporaryTable_DeleteOnCommit(), ecorePackage.getEBoolean(), "deleteOnCommit", null, 0, 1, TemporaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Columns(), this.getColumn(), this.getColumn_Table(), "columns", null, 1, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Supertable(), this.getTable(), this.getTable_Subtables(), "supertable", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Subtables(), this.getTable(), this.getTable_Supertable(), "subtables", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Schema(), theSQLSchemaPackage.getSchema(), theSQLSchemaPackage.getSchema_Tables(), "schema", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Udt(), theSQLDataTypesPackage.getStructuredUserDefinedType(), null, "udt", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Triggers(), this.getTrigger(), this.getTrigger_SubjectTable(), "triggers", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Index(), theSQLConstraintsPackage.getIndex(), theSQLConstraintsPackage.getIndex_Table(), "index", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_SelfRefColumnGeneration(), this.getReferenceType(), "selfRefColumnGeneration", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Insertable(), ecorePackage.getEBoolean(), "insertable", null, 0, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Updatable(), ecorePackage.getEBoolean(), "updatable", null, 0, 1, Table.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(persistentTableEClass, PersistentTable.class, "PersistentTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedTableEClass, DerivedTable.class, "DerivedTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedTable_QueryExpression(), theSQLExpressionsPackage.getQueryExpression(), null, "queryExpression", null, 0, 1, DerivedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseTableEClass, BaseTable.class, "BaseTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseTable_Constraints(), theSQLConstraintsPackage.getTableConstraint(), theSQLConstraintsPackage.getTableConstraint_BaseTable(), "constraints", null, 0, -1, BaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseTable_ReferencingForeignKeys(), theSQLConstraintsPackage.getForeignKey(), theSQLConstraintsPackage.getForeignKey_ReferencedTable(), "referencingForeignKeys", null, 0, -1, BaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBaseTable__GetUniqueConstraints(), theSQLSchemaPackage.getList(), "getUniqueConstraints", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBaseTable__GetForeignKeys(), theSQLSchemaPackage.getList(), "getForeignKeys", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBaseTable__GetPrimaryKey(), theSQLConstraintsPackage.getPrimaryKey(), "getPrimaryKey", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Table(), this.getTable(), this.getTable_Columns(), "table", null, 1, 1, Column.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_IdentitySpecifier(), theSQLSchemaPackage.getIdentitySpecifier(), null, "identitySpecifier", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_GenerateExpression(), theSQLExpressionsPackage.getValueExpression(), null, "generateExpression", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ImplementationDependent(), ecorePackage.getEBoolean(), "implementationDependent", "False", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Nullable(), ecorePackage.getEBoolean(), "nullable", "True", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Column.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ScopeCheck(), theSQLSchemaPackage.getReferentialActionType(), "scopeCheck", "NO_ACTION", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ScopeChecked(), ecorePackage.getEBoolean(), "scopeChecked", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getColumn__IsPartOfForeignKey(), ecorePackage.getEBoolean(), "isPartOfForeignKey", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getColumn__IsPartOfUniqueConstraint(), ecorePackage.getEBoolean(), "isPartOfUniqueConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getColumn__IsPartOfPrimaryKey(), ecorePackage.getEBoolean(), "isPartOfPrimaryKey", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Schema(), theSQLSchemaPackage.getSchema(), theSQLSchemaPackage.getSchema_Triggers(), "schema", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_SubjectTable(), this.getTable(), this.getTable_Triggers(), "subjectTable", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_ActionStatement(), theSQLStatementsPackage.getSQLStatement(), null, "actionStatement", null, 1, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_TriggerColumn(), this.getColumn(), null, "triggerColumn", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_ActionGranularity(), this.getActionGranularityType(), "actionGranularity", "STATEMENT", 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_When(), theSQLExpressionsPackage.getSearchCondition(), null, "when", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_TimeStamp(), theSQLSchemaPackage.getDate(), "timeStamp", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_ActionTime(), this.getActionTimeType(), "actionTime", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_UpdateType(), ecorePackage.getEBoolean(), "updateType", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_InsertType(), ecorePackage.getEBoolean(), "insertType", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_DeleteType(), ecorePackage.getEBoolean(), "deleteType", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_OldRow(), ecorePackage.getEString(), "oldRow", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_NewRow(), ecorePackage.getEString(), "newRow", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_OldTable(), ecorePackage.getEString(), "oldTable", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_NewTable(), ecorePackage.getEString(), "newTable", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(checkTypeEEnum, CheckType.class, "CheckType");
		addEEnumLiteral(checkTypeEEnum, CheckType.CASCADED);
		addEEnumLiteral(checkTypeEEnum, CheckType.LOCAL);
		addEEnumLiteral(checkTypeEEnum, CheckType.NONE);

		initEEnum(referenceTypeEEnum, ReferenceType.class, "ReferenceType");
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.SYSTEM_GENERATED);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.USER_GENERATED);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.DERIVED_SELF_REF);

		initEEnum(actionTimeTypeEEnum, ActionTimeType.class, "ActionTimeType");
		addEEnumLiteral(actionTimeTypeEEnum, ActionTimeType.AFTER);
		addEEnumLiteral(actionTimeTypeEEnum, ActionTimeType.BEFORE);
		addEEnumLiteral(actionTimeTypeEEnum, ActionTimeType.INSTEADOF);

		initEEnum(actionGranularityTypeEEnum, ActionGranularityType.class, "ActionGranularityType");
		addEEnumLiteral(actionGranularityTypeEEnum, ActionGranularityType.STATEMENT_LITERAL);
		addEEnumLiteral(actionGranularityTypeEEnum, ActionGranularityType.ROW_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// com.isb.datamodeler.tables.setting
		createComAnnotations();
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
			 "settingDelegates", "com.isb.datamodeler.tables.setting"
		   });													
	}

	/**
	 * Initializes the annotations for <b>com.isb.datamodeler.tables.setting</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createComAnnotations() {
		String source = "com.isb.datamodeler.tables.setting";											
		addAnnotation
		  (getColumn_DefaultValue(), 
		   source, 
		   new String[] {
		   });				
	}

} //SQLTablesPackageImpl
