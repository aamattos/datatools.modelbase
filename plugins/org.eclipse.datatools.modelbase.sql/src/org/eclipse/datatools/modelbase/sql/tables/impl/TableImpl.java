/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.tables.impl;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.datatypes.StructuredUserDefinedType;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.ReferenceType;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.Trigger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#getSupertable <em>Supertable</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#getSubtables <em>Subtables</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#getUdt <em>Udt</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#getSelfRefColumnGeneration <em>Self Ref Column Generation</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl#isUpdatable <em>Updatable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TableImpl extends SQLObjectImpl implements Table {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLTablesPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Column> getColumns() {
		return (EList<Column>)eGet(SQLTablesPackage.Literals.TABLE__COLUMNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getSupertable() {
		return (Table)eGet(SQLTablesPackage.Literals.TABLE__SUPERTABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertable(Table newSupertable) {
		eSet(SQLTablesPackage.Literals.TABLE__SUPERTABLE, newSupertable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Table> getSubtables() {
		return (EList<Table>)eGet(SQLTablesPackage.Literals.TABLE__SUBTABLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return (Schema)eGet(SQLTablesPackage.Literals.TABLE__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		eSet(SQLTablesPackage.Literals.TABLE__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredUserDefinedType getUdt() {
		return (StructuredUserDefinedType)eGet(SQLTablesPackage.Literals.TABLE__UDT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdt(StructuredUserDefinedType newUdt) {
		eSet(SQLTablesPackage.Literals.TABLE__UDT, newUdt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Trigger> getTriggers() {
		return (EList<Trigger>)eGet(SQLTablesPackage.Literals.TABLE__TRIGGERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Index> getIndex() {
		return (EList<Index>)eGet(SQLTablesPackage.Literals.TABLE__INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getSelfRefColumnGeneration() {
		return (ReferenceType)eGet(SQLTablesPackage.Literals.TABLE__SELF_REF_COLUMN_GENERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfRefColumnGeneration(ReferenceType newSelfRefColumnGeneration) {
		eSet(SQLTablesPackage.Literals.TABLE__SELF_REF_COLUMN_GENERATION, newSelfRefColumnGeneration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsertable() {
		return (Boolean)eGet(SQLTablesPackage.Literals.TABLE__INSERTABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdatable() {
		return (Boolean)eGet(SQLTablesPackage.Literals.TABLE__UPDATABLE, true);
	}

} //TableImpl
