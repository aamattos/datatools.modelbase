/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.constraints.impl;

import org.eclipse.datatools.modelbase.sql.constraints.CheckConstraint;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.expressions.SearchCondition;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.CheckConstraintImpl#getSearchCondition <em>Search Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckConstraintImpl extends TableConstraintImpl implements CheckConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLConstraintsPackage.Literals.CHECK_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchCondition getSearchCondition() {
		return (SearchCondition)eGet(SQLConstraintsPackage.Literals.CHECK_CONSTRAINT__SEARCH_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchCondition(SearchCondition newSearchCondition) {
		eSet(SQLConstraintsPackage.Literals.CHECK_CONSTRAINT__SEARCH_CONDITION, newSearchCondition);
	}

} //CheckConstraintImpl
