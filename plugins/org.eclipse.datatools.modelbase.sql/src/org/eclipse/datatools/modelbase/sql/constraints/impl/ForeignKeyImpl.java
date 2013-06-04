/**
 * <copyright>
 * </copyright>
 *
 * $Id: EForeignKeyImpl.java,v 1.18.8.1 2013/01/28 20:49:47 n775660 Exp $
 */
package org.eclipse.datatools.modelbase.sql.constraints.impl;

import org.eclipse.datatools.modelbase.sql.constraints.ForeignKey;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.constraints.MatchType;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.constraints.UniqueConstraint;
import org.eclipse.datatools.modelbase.sql.schema.ReferentialActionType;
import org.eclipse.datatools.modelbase.sql.tables.BaseTable;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ForeignKeyImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ForeignKeyImpl#getOnUpdate <em>On Update</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ForeignKeyImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ForeignKeyImpl#getUniqueConstraint <em>Unique Constraint</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ForeignKeyImpl#getReferencedMembers <em>Referenced Members</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ForeignKeyImpl#getUniqueIndex <em>Unique Index</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ForeignKeyImpl#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends ReferenceConstraintImpl implements ForeignKey {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLConstraintsPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchType getMatch() {
		return (MatchType)eGet(SQLConstraintsPackage.Literals.FOREIGN_KEY__MATCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(MatchType newMatch) {
		eSet(SQLConstraintsPackage.Literals.FOREIGN_KEY__MATCH, newMatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialActionType getOnUpdate() {
		return (ReferentialActionType)eGet(SQLConstraintsPackage.Literals.FOREIGN_KEY__ON_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdate(ReferentialActionType newOnUpdate) {
		eSet(SQLConstraintsPackage.Literals.FOREIGN_KEY__ON_UPDATE, newOnUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentialActionType getOnDelete() {
		return (ReferentialActionType)eGet(SQLConstraintsPackage.Literals.FOREIGN_KEY__ON_DELETE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDelete(ReferentialActionType newOnDelete) {
		eSet(SQLConstraintsPackage.Literals.FOREIGN_KEY__ON_DELETE, newOnDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueConstraint getUniqueConstraint() {
		return (UniqueConstraint)eGet(SQLConstraintsPackage.Literals.FOREIGN_KEY__UNIQUE_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueConstraint(UniqueConstraint newUniqueConstraint) {
		eSet(SQLConstraintsPackage.Literals.FOREIGN_KEY__UNIQUE_CONSTRAINT, newUniqueConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Column> getReferencedMembers() {
		return (EList<Column>)eGet(SQLConstraintsPackage.Literals.FOREIGN_KEY__REFERENCED_MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index getUniqueIndex() {
		return (Index)eGet(SQLConstraintsPackage.Literals.FOREIGN_KEY__UNIQUE_INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueIndex(Index newUniqueIndex) {
		eSet(SQLConstraintsPackage.Literals.FOREIGN_KEY__UNIQUE_INDEX, newUniqueIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseTable getReferencedTable() {
		return (BaseTable)eGet(SQLConstraintsPackage.Literals.FOREIGN_KEY__REFERENCED_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTable(BaseTable newReferencedTable) {
		eSet(SQLConstraintsPackage.Literals.FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return getName();
	}

} //EForeignKeyImpl
