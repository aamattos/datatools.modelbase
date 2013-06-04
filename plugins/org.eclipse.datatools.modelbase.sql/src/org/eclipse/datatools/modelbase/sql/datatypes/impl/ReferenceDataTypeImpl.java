/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.ReferenceDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.StructuredUserDefinedType;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.ReferenceDataTypeImpl#getScopeTable <em>Scope Table</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.ReferenceDataTypeImpl#getReferencedType <em>Referenced Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReferenceDataTypeImpl extends ConstructedDataTypeImpl implements ReferenceDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.REFERENCE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getScopeTable() {
		return (Table)eGet(SQLDataTypesPackage.Literals.REFERENCE_DATA_TYPE__SCOPE_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeTable(Table newScopeTable) {
		eSet(SQLDataTypesPackage.Literals.REFERENCE_DATA_TYPE__SCOPE_TABLE, newScopeTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredUserDefinedType getReferencedType() {
		return (StructuredUserDefinedType)eGet(SQLDataTypesPackage.Literals.REFERENCE_DATA_TYPE__REFERENCED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedType(StructuredUserDefinedType newReferencedType) {
		eSet(SQLDataTypesPackage.Literals.REFERENCE_DATA_TYPE__REFERENCED_TYPE, newReferencedType);
	}

} //ReferenceDataTypeImpl
