/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.schema.impl;

import org.eclipse.datatools.modelbase.sql.schema.Dependency;
import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.DependencyImpl#getTargetEnd <em>Target End</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.schema.impl.DependencyImpl#getDependencyType <em>Dependency Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends SQLObjectImpl implements Dependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLSchemaPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTargetEnd() {
		return (EObject)eGet(SQLSchemaPackage.Literals.DEPENDENCY__TARGET_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEnd(EObject newTargetEnd) {
		eSet(SQLSchemaPackage.Literals.DEPENDENCY__TARGET_END, newTargetEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependencyType() {
		return (String)eGet(SQLSchemaPackage.Literals.DEPENDENCY__DEPENDENCY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyType(String newDependencyType) {
		eSet(SQLSchemaPackage.Literals.DEPENDENCY__DEPENDENCY_TYPE, newDependencyType);
	}

} //DependencyImpl
