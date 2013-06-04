/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.accesscontrol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference: 5WD-02-Foundation-2002-12 4.34.1 Authorization Identifiers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.accesscontrol.User#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage#getUser()
 * @model
 * @generated
 */
public interface User extends AuthorizationIdentifier {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.datatools.modelbase.sql.accesscontrol.Group}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.datatools.modelbase.sql.accesscontrol.Group#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference list.
	 * @see org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage#getUser_Group()
	 * @see org.eclipse.datatools.modelbase.sql.accesscontrol.Group#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Group> getGroup();

} // User
