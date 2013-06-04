/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.accesscontrol.impl;

import org.eclipse.datatools.modelbase.sql.accesscontrol.AuthorizationIdentifier;
import org.eclipse.datatools.modelbase.sql.accesscontrol.Role;
import org.eclipse.datatools.modelbase.sql.accesscontrol.RoleAuthorization;
import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.RoleAuthorizationImpl#isGrantable <em>Grantable</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.RoleAuthorizationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.RoleAuthorizationImpl#getGrantee <em>Grantee</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.RoleAuthorizationImpl#getGrantor <em>Grantor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleAuthorizationImpl extends SQLObjectImpl implements RoleAuthorization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleAuthorizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrantable() {
		return (Boolean)eGet(SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION__GRANTABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrantable(boolean newGrantable) {
		eSet(SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION__GRANTABLE, newGrantable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return (Role)eGet(SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		eSet(SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationIdentifier getGrantee() {
		return (AuthorizationIdentifier)eGet(SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION__GRANTEE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrantee(AuthorizationIdentifier newGrantee) {
		eSet(SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION__GRANTEE, newGrantee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationIdentifier getGrantor() {
		return (AuthorizationIdentifier)eGet(SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION__GRANTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrantor(AuthorizationIdentifier newGrantor) {
		eSet(SQLAccessControlPackage.Literals.ROLE_AUTHORIZATION__GRANTOR, newGrantor);
	}

} //RoleAuthorizationImpl
