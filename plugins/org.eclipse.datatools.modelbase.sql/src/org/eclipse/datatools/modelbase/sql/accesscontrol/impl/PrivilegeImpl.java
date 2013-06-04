/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.accesscontrol.impl;

import org.eclipse.datatools.modelbase.sql.accesscontrol.AuthorizationIdentifier;
import org.eclipse.datatools.modelbase.sql.accesscontrol.Privilege;
import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privilege</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.PrivilegeImpl#isGrantable <em>Grantable</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.PrivilegeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.PrivilegeImpl#isWithHierarchy <em>With Hierarchy</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.PrivilegeImpl#getGrantor <em>Grantor</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.PrivilegeImpl#getGrantee <em>Grantee</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.PrivilegeImpl#getActionObjects <em>Action Objects</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.PrivilegeImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivilegeImpl extends SQLObjectImpl implements Privilege {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivilegeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLAccessControlPackage.Literals.PRIVILEGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrantable() {
		return (Boolean)eGet(SQLAccessControlPackage.Literals.PRIVILEGE__GRANTABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrantable(boolean newGrantable) {
		eSet(SQLAccessControlPackage.Literals.PRIVILEGE__GRANTABLE, newGrantable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return (String)eGet(SQLAccessControlPackage.Literals.PRIVILEGE__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		eSet(SQLAccessControlPackage.Literals.PRIVILEGE__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWithHierarchy() {
		return (Boolean)eGet(SQLAccessControlPackage.Literals.PRIVILEGE__WITH_HIERARCHY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithHierarchy(boolean newWithHierarchy) {
		eSet(SQLAccessControlPackage.Literals.PRIVILEGE__WITH_HIERARCHY, newWithHierarchy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationIdentifier getGrantor() {
		return (AuthorizationIdentifier)eGet(SQLAccessControlPackage.Literals.PRIVILEGE__GRANTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrantor(AuthorizationIdentifier newGrantor) {
		eSet(SQLAccessControlPackage.Literals.PRIVILEGE__GRANTOR, newGrantor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationIdentifier getGrantee() {
		return (AuthorizationIdentifier)eGet(SQLAccessControlPackage.Literals.PRIVILEGE__GRANTEE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrantee(AuthorizationIdentifier newGrantee) {
		eSet(SQLAccessControlPackage.Literals.PRIVILEGE__GRANTEE, newGrantee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SQLObject> getActionObjects() {
		return (EList<SQLObject>)eGet(SQLAccessControlPackage.Literals.PRIVILEGE__ACTION_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLObject getObject() {
		return (SQLObject)eGet(SQLAccessControlPackage.Literals.PRIVILEGE__OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(SQLObject newObject) {
		eSet(SQLAccessControlPackage.Literals.PRIVILEGE__OBJECT, newObject);
	}

} //PrivilegeImpl
