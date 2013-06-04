/**
 * <copyright>
 * </copyright>
 *
 * $Id: EConstraintImpl.java,v 1.14.8.2 2013/01/28 20:49:47 n775660 Exp $
 */
package org.eclipse.datatools.modelbase.sql.constraints.impl;

import org.eclipse.datatools.modelbase.sql.constraints.Constraint;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ConstraintImpl#isDeferrable <em>Deferrable</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ConstraintImpl#isInitiallyDeferred <em>Initially Deferred</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.ConstraintImpl#isEnforced <em>Enforced</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends SQLObjectImpl implements Constraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLConstraintsPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeferrable() {
		return (Boolean)eGet(SQLConstraintsPackage.Literals.CONSTRAINT__DEFERRABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeferrable(boolean newDeferrable) {
		eSet(SQLConstraintsPackage.Literals.CONSTRAINT__DEFERRABLE, newDeferrable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitiallyDeferred() {
		return (Boolean)eGet(SQLConstraintsPackage.Literals.CONSTRAINT__INITIALLY_DEFERRED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiallyDeferred(boolean newInitiallyDeferred) {
		eSet(SQLConstraintsPackage.Literals.CONSTRAINT__INITIALLY_DEFERRED, newInitiallyDeferred);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnforced() {
		return (Boolean)eGet(SQLConstraintsPackage.Literals.CONSTRAINT__ENFORCED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnforced(boolean newEnforced) {
		eSet(SQLConstraintsPackage.Literals.CONSTRAINT__ENFORCED, newEnforced);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {		
		return getName();
	}

} //EConstraintImpl
