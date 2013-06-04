/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.tables.impl;

import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;
import org.eclipse.datatools.modelbase.sql.tables.TemporaryTable;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporary Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TemporaryTableImpl#isLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.tables.impl.TemporaryTableImpl#isDeleteOnCommit <em>Delete On Commit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporaryTableImpl extends BaseTableImpl implements TemporaryTable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporaryTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLTablesPackage.Literals.TEMPORARY_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocal() {
		return (Boolean)eGet(SQLTablesPackage.Literals.TEMPORARY_TABLE__LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(boolean newLocal) {
		eSet(SQLTablesPackage.Literals.TEMPORARY_TABLE__LOCAL, newLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleteOnCommit() {
		return (Boolean)eGet(SQLTablesPackage.Literals.TEMPORARY_TABLE__DELETE_ON_COMMIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteOnCommit(boolean newDeleteOnCommit) {
		eSet(SQLTablesPackage.Literals.TEMPORARY_TABLE__DELETE_ON_COMMIT, newDeleteOnCommit);
	}

} //TemporaryTableImpl
