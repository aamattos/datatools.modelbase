/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.datatools.modelbase.sql.constraints.impl;

import org.eclipse.datatools.modelbase.sql.constraints.IncrementType;
import org.eclipse.datatools.modelbase.sql.constraints.IndexExpression;
import org.eclipse.datatools.modelbase.sql.constraints.IndexMember;
import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;
import org.eclipse.datatools.modelbase.sql.schema.impl.SQLObjectImpl;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexMemberImpl#getIncrementType <em>Increment Type</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexMemberImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.constraints.impl.IndexMemberImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexMemberImpl extends SQLObjectImpl implements IndexMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLConstraintsPackage.Literals.INDEX_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementType getIncrementType() {
		return (IncrementType)eGet(SQLConstraintsPackage.Literals.INDEX_MEMBER__INCREMENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementType(IncrementType newIncrementType) {
		eSet(SQLConstraintsPackage.Literals.INDEX_MEMBER__INCREMENT_TYPE, newIncrementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getColumn() {
		return (Column)eGet(SQLConstraintsPackage.Literals.INDEX_MEMBER__COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		eSet(SQLConstraintsPackage.Literals.INDEX_MEMBER__COLUMN, newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexExpression getExpression() {
		return (IndexExpression)eGet(SQLConstraintsPackage.Literals.INDEX_MEMBER__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(IndexExpression newExpression) {
		eSet(SQLConstraintsPackage.Literals.INDEX_MEMBER__EXPRESSION, newExpression);
	}

} //IndexMemberImpl
