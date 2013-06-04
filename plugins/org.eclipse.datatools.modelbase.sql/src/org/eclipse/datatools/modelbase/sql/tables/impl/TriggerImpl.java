/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.tables.impl;

import java.util.Date;

import org.eclipse.datatools.modelbase.sql.expressions.SearchCondition;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatement;
import org.eclipse.datatools.modelbase.sql.tables.ActionGranularityType;
import org.eclipse.datatools.modelbase.sql.tables.ActionTimeType;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.Trigger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getSubjectTable <em>Subject Table</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getActionStatement <em>Action Statement</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getTriggerColumn <em>Trigger Column</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getActionGranularity <em>Action Granularity</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getActionTime <em>Action Time</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#isUpdateType <em>Update Type</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#isInsertType <em>Insert Type</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#isDeleteType <em>Delete Type</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getOldRow <em>Old Row</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getNewRow <em>New Row</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getOldTable <em>Old Table</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TriggerImpl#getNewTable <em>New Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends SQLObjectImpl implements Trigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLTablesPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return (Schema)eGet(SQLTablesPackage.Literals.TRIGGER__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		eSet(SQLTablesPackage.Literals.TRIGGER__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getSubjectTable() {
		return (Table)eGet(SQLTablesPackage.Literals.TRIGGER__SUBJECT_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectTable(Table newSubjectTable) {
		eSet(SQLTablesPackage.Literals.TRIGGER__SUBJECT_TABLE, newSubjectTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SQLStatement> getActionStatement() {
		return (EList<SQLStatement>)eGet(SQLTablesPackage.Literals.TRIGGER__ACTION_STATEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Column> getTriggerColumn() {
		return (EList<Column>)eGet(SQLTablesPackage.Literals.TRIGGER__TRIGGER_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGranularityType getActionGranularity() {
		return (ActionGranularityType)eGet(SQLTablesPackage.Literals.TRIGGER__ACTION_GRANULARITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionGranularity(ActionGranularityType newActionGranularity) {
		eSet(SQLTablesPackage.Literals.TRIGGER__ACTION_GRANULARITY, newActionGranularity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchCondition getWhen() {
		return (SearchCondition)eGet(SQLTablesPackage.Literals.TRIGGER__WHEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(SearchCondition newWhen) {
		eSet(SQLTablesPackage.Literals.TRIGGER__WHEN, newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return (Date)eGet(SQLTablesPackage.Literals.TRIGGER__TIME_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTimeType getActionTime() {
		return (ActionTimeType)eGet(SQLTablesPackage.Literals.TRIGGER__ACTION_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionTime(ActionTimeType newActionTime) {
		eSet(SQLTablesPackage.Literals.TRIGGER__ACTION_TIME, newActionTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdateType() {
		return (Boolean)eGet(SQLTablesPackage.Literals.TRIGGER__UPDATE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateType(boolean newUpdateType) {
		eSet(SQLTablesPackage.Literals.TRIGGER__UPDATE_TYPE, newUpdateType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsertType() {
		return (Boolean)eGet(SQLTablesPackage.Literals.TRIGGER__INSERT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertType(boolean newInsertType) {
		eSet(SQLTablesPackage.Literals.TRIGGER__INSERT_TYPE, newInsertType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleteType() {
		return (Boolean)eGet(SQLTablesPackage.Literals.TRIGGER__DELETE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteType(boolean newDeleteType) {
		eSet(SQLTablesPackage.Literals.TRIGGER__DELETE_TYPE, newDeleteType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldRow() {
		return (String)eGet(SQLTablesPackage.Literals.TRIGGER__OLD_ROW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldRow(String newOldRow) {
		eSet(SQLTablesPackage.Literals.TRIGGER__OLD_ROW, newOldRow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewRow() {
		return (String)eGet(SQLTablesPackage.Literals.TRIGGER__NEW_ROW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewRow(String newNewRow) {
		eSet(SQLTablesPackage.Literals.TRIGGER__NEW_ROW, newNewRow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldTable() {
		return (String)eGet(SQLTablesPackage.Literals.TRIGGER__OLD_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldTable(String newOldTable) {
		eSet(SQLTablesPackage.Literals.TRIGGER__OLD_TABLE, newOldTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewTable() {
		return (String)eGet(SQLTablesPackage.Literals.TRIGGER__NEW_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTable(String newNewTable) {
		eSet(SQLTablesPackage.Literals.TRIGGER__NEW_TABLE, newNewTable);
	}

} //TriggerImpl
