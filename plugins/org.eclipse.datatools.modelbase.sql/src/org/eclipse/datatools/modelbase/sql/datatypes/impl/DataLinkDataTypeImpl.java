/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.datatypes.impl;

import org.eclipse.datatools.modelbase.sql.datatypes.DataLinkDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.IntegrityControlOption;
import org.eclipse.datatools.modelbase.sql.datatypes.LinkControlOption;
import org.eclipse.datatools.modelbase.sql.datatypes.ReadPermissionOption;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;
import org.eclipse.datatools.modelbase.sql.datatypes.UnlinkOption;
import org.eclipse.datatools.modelbase.sql.datatypes.WritePermissionOption;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Link Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.DataLinkDataTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.DataLinkDataTypeImpl#getLinkControl <em>Link Control</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.DataLinkDataTypeImpl#getIntegrityControl <em>Integrity Control</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.DataLinkDataTypeImpl#getReadPermission <em>Read Permission</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.DataLinkDataTypeImpl#getWritePermission <em>Write Permission</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.DataLinkDataTypeImpl#isRecovery <em>Recovery</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.datatypes.impl.DataLinkDataTypeImpl#getUnlink <em>Unlink</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataLinkDataTypeImpl extends PredefinedDataTypeImpl implements DataLinkDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLinkDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return (Integer)eGet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		eSet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkControlOption getLinkControl() {
		return (LinkControlOption)eGet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__LINK_CONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkControl(LinkControlOption newLinkControl) {
		eSet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__LINK_CONTROL, newLinkControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityControlOption getIntegrityControl() {
		return (IntegrityControlOption)eGet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__INTEGRITY_CONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityControl(IntegrityControlOption newIntegrityControl) {
		eSet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__INTEGRITY_CONTROL, newIntegrityControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadPermissionOption getReadPermission() {
		return (ReadPermissionOption)eGet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__READ_PERMISSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadPermission(ReadPermissionOption newReadPermission) {
		eSet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__READ_PERMISSION, newReadPermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritePermissionOption getWritePermission() {
		return (WritePermissionOption)eGet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__WRITE_PERMISSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritePermission(WritePermissionOption newWritePermission) {
		eSet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__WRITE_PERMISSION, newWritePermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecovery() {
		return (Boolean)eGet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__RECOVERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecovery(boolean newRecovery) {
		eSet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__RECOVERY, newRecovery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlinkOption getUnlink() {
		return (UnlinkOption)eGet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__UNLINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlink(UnlinkOption newUnlink) {
		eSet(SQLDataTypesPackage.Literals.DATA_LINK_DATA_TYPE__UNLINK, newUnlink);
	}

} //DataLinkDataTypeImpl
