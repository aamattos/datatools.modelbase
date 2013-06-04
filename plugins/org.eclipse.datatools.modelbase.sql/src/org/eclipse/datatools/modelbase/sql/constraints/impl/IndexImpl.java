/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.constraints.impl;

import org.eclipse.datatools.modelbase.sql.constraints.ForeignKey;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.constraints.IndexMember;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#isClustered <em>Clustered</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#getFillFactor <em>Fill Factor</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#isSystemGenerated <em>System Generated</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexImpl#getIncludedMembers <em>Included Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexImpl extends SQLObjectImpl implements Index {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLConstraintsPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return (Schema)eGet(SQLConstraintsPackage.Literals.INDEX__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		eSet(SQLConstraintsPackage.Literals.INDEX__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClustered() {
		return (Boolean)eGet(SQLConstraintsPackage.Literals.INDEX__CLUSTERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClustered(boolean newClustered) {
		eSet(SQLConstraintsPackage.Literals.INDEX__CLUSTERED, newClustered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFillFactor() {
		return (Integer)eGet(SQLConstraintsPackage.Literals.INDEX__FILL_FACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillFactor(int newFillFactor) {
		eSet(SQLConstraintsPackage.Literals.INDEX__FILL_FACTOR, newFillFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return (Boolean)eGet(SQLConstraintsPackage.Literals.INDEX__UNIQUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		eSet(SQLConstraintsPackage.Literals.INDEX__UNIQUE, newUnique);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSystemGenerated() {
		return (Boolean)eGet(SQLConstraintsPackage.Literals.INDEX__SYSTEM_GENERATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemGenerated(boolean newSystemGenerated) {
		eSet(SQLConstraintsPackage.Literals.INDEX__SYSTEM_GENERATED, newSystemGenerated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IndexMember> getMembers() {
		return (EList<IndexMember>)eGet(SQLConstraintsPackage.Literals.INDEX__MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		return (Table)eGet(SQLConstraintsPackage.Literals.INDEX__TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		eSet(SQLConstraintsPackage.Literals.INDEX__TABLE, newTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ForeignKey> getForeignKey() {
		return (EList<ForeignKey>)eGet(SQLConstraintsPackage.Literals.INDEX__FOREIGN_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IndexMember> getIncludedMembers() {
		return (EList<IndexMember>)eGet(SQLConstraintsPackage.Literals.INDEX__INCLUDED_MEMBERS, true);
	}

} //IndexImpl
