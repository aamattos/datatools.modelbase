/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.tables.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.datatools.modelbase.sql.constraints.Constraint;
import org.eclipse.datatools.modelbase.sql.constraints.ForeignKey;
import org.eclipse.datatools.modelbase.sql.constraints.PrimaryKey;
import org.eclipse.datatools.modelbase.sql.constraints.TableConstraint;
import org.eclipse.datatools.modelbase.sql.constraints.UniqueConstraint;
import org.eclipse.datatools.modelbase.sql.tables.BaseTable;
import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.BaseTableImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.BaseTableImpl#getReferencingForeignKeys <em>Referencing Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseTableImpl extends TableImpl implements BaseTable {
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLTablesPackage.Literals.BASE_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TableConstraint> getConstraints() {
		return (EList<TableConstraint>)eGet(SQLTablesPackage.Literals.BASE_TABLE__CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ForeignKey> getReferencingForeignKeys() {
		return (EList<ForeignKey>)eGet(SQLTablesPackage.Literals.BASE_TABLE__REFERENCING_FOREIGN_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@SuppressWarnings("unchecked")
	public List getUniqueConstraints() {
		Vector uniqueConstraints = new Vector();
		Iterator allConstraints = this.getConstraints().iterator();
		while( allConstraints.hasNext() ) {
			Constraint currentConstraint = (Constraint)allConstraints.next();
			if (currentConstraint instanceof UniqueConstraint) {
				uniqueConstraints.add(currentConstraint);
			}
		}
		
		return uniqueConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@SuppressWarnings("unchecked")
	public List getForeignKeys() {
		Vector foreignKeys = new Vector();
		Iterator allConstraints = this.getConstraints().iterator();
		while( allConstraints.hasNext() ) {
			Constraint currentConstraint = (Constraint)allConstraints.next();
			if (currentConstraint instanceof ForeignKey) {
				foreignKeys.add(currentConstraint);
			}
		}
		
		return foreignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public PrimaryKey getPrimaryKey() {
		Iterator allConstraints = this.getConstraints().iterator();
		while( allConstraints.hasNext() ) {
			Constraint currentConstraint = (Constraint)allConstraints.next();
			if (currentConstraint instanceof PrimaryKey) {
				return (PrimaryKey)currentConstraint;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SQLTablesPackage.BASE_TABLE___GET_UNIQUE_CONSTRAINTS:
				return getUniqueConstraints();
			case SQLTablesPackage.BASE_TABLE___GET_FOREIGN_KEYS:
				return getForeignKeys();
			case SQLTablesPackage.BASE_TABLE___GET_PRIMARY_KEY:
				return getPrimaryKey();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BaseTableImpl
