/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.accesscontrol.impl;

import org.eclipse.datatools.modelbase.sql.accesscontrol.AuthorizationIdentifier;
import org.eclipse.datatools.modelbase.sql.accesscontrol.Privilege;
import org.eclipse.datatools.modelbase.sql.accesscontrol.RoleAuthorization;
import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.AuthorizationIdentifierImpl#getOwnedSchema <em>Owned Schema</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.AuthorizationIdentifierImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.AuthorizationIdentifierImpl#getReceivedRoleAuthorization <em>Received Role Authorization</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.AuthorizationIdentifierImpl#getGrantedRoleAuthorization <em>Granted Role Authorization</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.AuthorizationIdentifierImpl#getGrantedPrivilege <em>Granted Privilege</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.impl.AuthorizationIdentifierImpl#getReceivedPrivilege <em>Received Privilege</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AuthorizationIdentifierImpl extends SQLObjectImpl implements AuthorizationIdentifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLAccessControlPackage.Literals.AUTHORIZATION_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Schema> getOwnedSchema() {
		return (EList<Schema>)eGet(SQLAccessControlPackage.Literals.AUTHORIZATION_IDENTIFIER__OWNED_SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return (Database)eGet(SQLAccessControlPackage.Literals.AUTHORIZATION_IDENTIFIER__DATABASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		eSet(SQLAccessControlPackage.Literals.AUTHORIZATION_IDENTIFIER__DATABASE, newDatabase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoleAuthorization> getReceivedRoleAuthorization() {
		return (EList<RoleAuthorization>)eGet(SQLAccessControlPackage.Literals.AUTHORIZATION_IDENTIFIER__RECEIVED_ROLE_AUTHORIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoleAuthorization> getGrantedRoleAuthorization() {
		return (EList<RoleAuthorization>)eGet(SQLAccessControlPackage.Literals.AUTHORIZATION_IDENTIFIER__GRANTED_ROLE_AUTHORIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Privilege> getGrantedPrivilege() {
		return (EList<Privilege>)eGet(SQLAccessControlPackage.Literals.AUTHORIZATION_IDENTIFIER__GRANTED_PRIVILEGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Privilege> getReceivedPrivilege() {
		return (EList<Privilege>)eGet(SQLAccessControlPackage.Literals.AUTHORIZATION_IDENTIFIER__RECEIVED_PRIVILEGE, true);
	}

} //AuthorizationIdentifierImpl
