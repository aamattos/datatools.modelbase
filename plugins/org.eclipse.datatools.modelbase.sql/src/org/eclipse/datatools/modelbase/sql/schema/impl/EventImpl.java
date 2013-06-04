/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.schema.impl;

import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Event;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.EventImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.EventImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.EventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.EventImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.EventImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends SQLObjectImpl implements Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLSchemaPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFor() {
		return (String)eGet(SQLSchemaPackage.Literals.EVENT__FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(String newFor) {
		eSet(SQLSchemaPackage.Literals.EVENT__FOR, newFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return (String)eGet(SQLSchemaPackage.Literals.EVENT__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		eSet(SQLSchemaPackage.Literals.EVENT__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return (String)eGet(SQLSchemaPackage.Literals.EVENT__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		eSet(SQLSchemaPackage.Literals.EVENT__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return (Boolean)eGet(SQLSchemaPackage.Literals.EVENT__ENABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		eSet(SQLSchemaPackage.Literals.EVENT__ENABLED, newEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return (Database)eGet(SQLSchemaPackage.Literals.EVENT__DATABASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		eSet(SQLSchemaPackage.Literals.EVENT__DATABASE, newDatabase);
	}

} //EventImpl
